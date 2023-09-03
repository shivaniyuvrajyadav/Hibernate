package com.jsp.OntToOneUni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.OntToOneUni.dto.PanCard;
import com.jsp.OntToOneUni.dto.Person;

public class PersonPan_Dao {
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
	
	public void savePan(PanCard card) {
		manager = getEntityManager();
		transaction= manager.getTransaction();
		
		transaction.begin();
		manager.persist(card);
		transaction.commit();
		
	}
	
	public void updatePerson(Person person) {
		
		manager = getEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.merge(person);
		transaction.commit();
	}
	
	//find
	public void findPerson(int personId) {
		manager = getEntityManager();
		transaction= manager.getTransaction();
		
		Person person= manager.find(Person.class, personId);
		System.out.println(person);
	}
	
	public void removePerson(int personId) {
		manager = getEntityManager();
		transaction= manager.getTransaction();
		
		Person person = manager.find(Person.class, personId);
		transaction.begin();
		manager.remove(person);
		transaction.commit();
	}
	
	
	
	

}
