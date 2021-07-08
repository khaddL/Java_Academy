package run;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import conection.ConnectionFile;

public class manager {
	
	Date date = new Date();
	 
	 public static Session sesion = 
				ConnectionFile.getSessionFactory().openSession();

	
	private void close() {
		
		ConnectionFile.getSessionFactory().close();
		
		}
	
	private  void  mana() {
		
		 int idcc = 4;
		 int idCity = 2;
		 int idCountry = 2;
		 int idState = 2;
		
       Clients cl = new Clients();
		cl.setName("Cosa");
		cl.setLastName("Thing");
		cl.setUsername("a");
		cl.setPassword("a");
		cl.setEmail("aaaaaaaaaa@gmail.com");
		
		InformationCc cc = sesion.get(InformationCc.class, idcc);
		
		CreditCards cd = new CreditCards();
		cd.setClients(cl);
		cd.setInformationCc(cc);
			
		City cs = sesion.get(City.class, idCity);
		
		Country cn = sesion.get(Country.class,idCountry);
		
		States st = sesion.get(States.class, idState);
		
		DeliveryAdress da = new DeliveryAdress();
		da.setClients(cl);
		da.setCountry(cn);
		da.setStates(st);
		da.setCity(cs);
		da.setNumber(533);
		da.setStreet("sadasdasdasd");
		
		PurchaseOrders po = new PurchaseOrders();
		po.setDeliveryAdress(da);
		po.setPurchaseDate(date);
		
		Billing bill = new Billing();
		bill.setPurchaseOrders(po);
		bill.setAmount(4512);
		bill.setDate(date);
		
		
		sesion.beginTransaction();
		sesion.save(cl);
		sesion.save(cc);
		sesion.save(cd);
		sesion.save(da);
		sesion.save(po);
		sesion.save(bill);
		sesion.getTransaction().commit();
		sesion.close();
	
		
	}
private void read() {
		
		int id_client = 3;
		Clients cl = sesion.get(Clients.class,id_client);
		
		List<Clients> c= sesion.createQuery("FROM run.Clients WHERE id_client=:id_client").setParameter("id_client", id_client ).list();
		for (Iterator it = c.iterator(); it.hasNext();) {
			Clients client = (Clients) it.next();
			
			System.out.println("     CLIENTS    ");
			System.out.println("Name : " + client.getName());
			System.out.println("Last Name : " + client.getLastName());
			
			System.out.println("    CREDIT CARDS     ");

			Set creditCards = client.getCreditCardses();
			for (Iterator i2 = creditCards.iterator(); i2.hasNext();) {
				CreditCards card = (CreditCards) i2.next();
				
					System.out.println("Number Credit Card : " + card.getInformationCc().getCreditCardNumber()); 
					System.out.println("Name Credit Card : " + card.getInformationCc().getCardholder());
					System.out.println("Type : " + card.getInformationCc().getType());

		
				
			
			
				Set deliveryAdress  = client.getDeliveryAdresses();
				for (it = deliveryAdress.iterator(); it.hasNext();) {
					
					DeliveryAdress address = (DeliveryAdress) it.next();
					System.out.println("    DELIVERY ADRESS    ");
					System.out.println("Country : " + address.getCountry().getIdCountry());
					System.out.println("State : " + address.getStates().getIdState());
					System.out.println("City : " + address.getCity().getIdCity());
					System.out.println("Number : " + address.getNumber());
					System.out.println("Street : " + address.getStreet());
					
					
			}
				
		}
	
		
		
		}
		
}
	
	

	public static void main(String[] args) {
		
		manager man = new manager();
		
		man.mana();
		man.read();
		man.close();
	}

}
