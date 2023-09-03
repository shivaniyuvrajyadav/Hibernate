package org.jsp.onetoone_bi.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


//import org.jsp.onetoone.dto.Mobile;
import org.jsp.onetoone_bi.dto.Passport;
import org.jsp.onetoone_bi.dto.Person;

public class Person_Passport_Dao {

	private EntityManagerFactory factory = null;
	private EntityManager manager = null;
	private EntityTransaction transaction = null;
	
	public EntityManager getEntityManager() {
		factory = Persistence.createEntityManagerFactory("dev");
		manager = factory.createEntityManager();
         return manager;		
	}
	
	
	public void savePerson(Person person) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
	}
	public void savePassport(Passport passport) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(passport);
		transaction.commit();
	}
	
	public void updatePassport(Passport passport) {
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(passport);
		transaction.commit();
	}
	
	public void findPersonById(int id) {
		manager = getEntityManager();
		Person person = manager.find(Person.class, id);
		System.out.println(person);
		
	}
	
	public void deletePersonByID(int id) {
		// TODO Auto-generated method stub
		manager = getEntityManager();
		transaction = manager.getTransaction();
		
	     Person person = manager.find(Person.class, id);
	     if(person != null) {
	    	 transaction.begin();
	    	 manager.remove(person);
	    	 transaction.commit();
	     }
	     else {
	    	 System.out.println("object not deleted");
	     }

}
}
