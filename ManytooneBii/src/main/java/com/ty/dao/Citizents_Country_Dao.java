package com.ty.dao;


import java.util.concurrent.Flow.Publisher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Citizens;
import com.ty.dto.Country;

public class Citizents_Country_Dao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
    public void savecountry(Country country) {
    	transaction.begin();
		manager.persist(country);
		transaction.commit();
    }
     public void saveCitizen(Citizens citizens) {
    transaction.begin();
	manager.persist(citizens);
	transaction.commit();
     }
     
     public void updatecountry(Country country) {
     	transaction.begin();
 		manager.merge(country);
 		transaction.commit();
     }
     
     public void updateCitizen(Citizens citizens) {
    	    transaction.begin();
    		manager.merge(citizens);
    		transaction.commit();
    	     }
     
     public void deleteCountry(int id) {
		transaction.begin();
		Country country = manager.find(Country.class, id);
	    manager.remove(country);
	    transaction.commit();
      
     }
     
     public void deleteCitizens(int cid) {
    	 transaction.begin();
    	 Citizens citizens2 = manager.find(Citizens.class, cid);
    	 manager.remove(citizens2);
    	 transaction.commit();
     }
    
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    
}

