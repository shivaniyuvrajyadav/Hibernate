package com.jsp.onetomany_assignment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_assignment.dto.Channel;
import com.jsp.onetomany_assignment.dto.TV;

public class Tv_Channel_Dao {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();
	private EntityTransaction transaction = entityManager.getTransaction();
	
	
	
	public void saveTv(Channel ch) {
		transaction.begin();
		entityManager.persist(ch);
	    transaction.commit();
	}
	
	
	public void findTvById(int id) {
		TV tv = entityManager.find(TV.class, id);
		System.out.println(tv);
		
	}
	
	
}