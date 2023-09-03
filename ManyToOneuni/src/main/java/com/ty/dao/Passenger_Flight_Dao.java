package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Flight;
import com.ty.dto.Passenger;

public class Passenger_Flight_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	
	public void savePassenger(Passenger passenger) {
	transaction.begin();
	manager.persist(passenger);
	transaction.commit();
	}
	
	
	public void Delete (int id) {
		transaction.begin();
		Passenger passenger = manager.find(Passenger.class, 3);
		passenger.setFlight(null);
		manager.remove(passenger);
		transaction.commit();
	}
	
     public void updatePassenger(Passenger passenger) {
		
		transaction.begin();
		manager.merge(passenger);
		transaction.commit();
	}
		
    public void findAllPassenger(Passenger passenger) {
	
	Query query = manager.createQuery("select a from Passenger p");
	List<Passenger> list=query.getResultList();
	System.out.println(list);
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
