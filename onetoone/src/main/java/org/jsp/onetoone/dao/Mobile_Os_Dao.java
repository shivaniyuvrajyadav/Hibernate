package org.jsp.onetoone.dao;

//import java.lang.invoke.ClassSpecializer.Factory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoone.dto.Mobile;
import org.jsp.onetoone.dto.Os;

public class Mobile_Os_Dao {
	
	public void saveMobile(Mobile mobile) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(mobile);
		transaction.commit();
		
	}
	
	public void saveOs(Os os) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(os);
		transaction.commit();
		
	}
	
	public void updateMobile(Mobile mobile) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(mobile);
		transaction.commit();
	
	}



public void findMobileById(int id) {
	EntityManagerFactory entityManagerFactory = Persistence .createEntityManagerFactory("dev");
	EntityManager manager = entityManagerFactory.createEntityManager();
	
	Mobile mobile = manager.find(Mobile.class, id);
	System.out.println(mobile);
}
public void deleteMobileByID(int id) {
	// TODO Auto-generated method stub
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
     Mobile mobile = manager.find(Mobile.class, id);
     if(mobile != null) {
    	 transaction.begin();
    	 manager.remove(mobile);
    	 transaction.commit();
     }
     else {
    	 System.out.println("object not deleted");
     }
}

public void deleteOsByID(int id) {
	// TODO Auto-generated method stub
	EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
     Os os = manager.find(Os.class, id);
     if(os != null) {
    	 transaction.begin();
    	 manager.remove(os);
    	 transaction.commit();
     }
     else {
    	 System.out.println("object not deleted");
     }
}











}















