package run;
// Generated Jun 11, 2021, 1:48:56 AM by Hibernate Tools 5.4.30.Final

import java.util.HashSet;
import java.util.Set;

/**
 * DeliveryAdress generated by hbm2java
 */
public class DeliveryAdress implements java.io.Serializable {

	private Integer idAdress;
	private City city;
	private Clients clients;
	private Country country;
	private States states;
	private int number;
	private String street;
	private Set purchaseOrderses = new HashSet(0);

	public DeliveryAdress() {
	}

	public DeliveryAdress(City city, Clients clients, Country country, States states, int number, String street) {
		this.city = city;
		this.clients = clients;
		this.country = country;
		this.states = states;
		this.number = number;
		this.street = street;
	}

	public DeliveryAdress(City city, Clients clients, Country country, States states, int number, String street,
			Set purchaseOrderses) {
		this.city = city;
		this.clients = clients;
		this.country = country;
		this.states = states;
		this.number = number;
		this.street = street;
		this.purchaseOrderses = purchaseOrderses;
	}

	public Integer getIdAdress() {
		return this.idAdress;
	}

	public void setIdAdress(Integer idAdress) {
		this.idAdress = idAdress;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public States getStates() {
		return this.states;
	}

	public void setStates(States states) {
		this.states = states;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStreet() {
		return this.street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Set getPurchaseOrderses() {
		return this.purchaseOrderses;
	}

	public void setPurchaseOrderses(Set purchaseOrderses) {
		this.purchaseOrderses = purchaseOrderses;
	}

}
