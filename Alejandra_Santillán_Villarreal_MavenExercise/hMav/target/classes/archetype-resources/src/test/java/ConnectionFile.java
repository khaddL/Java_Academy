package conection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionFile {
	
	private static final SessionFactory sessionFactory =
			buildSessionFactory();
			 private static SessionFactory buildSessionFactory() {
			
			 try {
				
			 return new
			Configuration().configure().buildSessionFactory();
			 }
			 catch (Throwable ex) {
			 System.err.println("Error al crear sessionFactory " + ex);
			 throw new ExceptionInInitializerError(ex);
			 }
			 }

			 public static SessionFactory getSessionFactory() {
			 return sessionFactory;
			 }

}
