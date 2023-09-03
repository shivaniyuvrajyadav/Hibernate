package org.jsp.onetoneAssignment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.onetoneAssignment.dto.Animal;
import org.jsp.onetoneAssignment.dto.Info;





public class Animal_Info_Dao {
	
	public void saveAnimal(Animal animal) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(animal);
		transaction.commit();
		
	}
	
	public void saveInfo(Info info) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.persist(info);
		transaction.commit();
		
	}
	
	
	
	public void findAnimalById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence .createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		Animal animal = manager.find(Animal.class, id);
		System.out.println(animal);
	}
	
	
	public void updateAnimal(Animal animal) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();
		manager.merge(animal);
		transaction.commit();
	
	}

	public void deleteAnimalByID(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		
	     Animal animal = manager.find(Animal.class, id);
	     if(animal != null) {
	    	 transaction.begin();
	    	 manager.remove(animal);
	    	 transaction.commit();
	     }
	     else {
	    	 System.out.println("object not deleted");
	     }
	}

	public void deleteInfoByID(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		
	     Info info = manager.find(Info.class, id);
	     if(info != null) {
	    	 transaction.begin();
	    	 manager.remove(info);
	    	 transaction.commit();
	     }
	     else {
	    	 System.out.println("object not deleted");
	     }
	}

	

}
