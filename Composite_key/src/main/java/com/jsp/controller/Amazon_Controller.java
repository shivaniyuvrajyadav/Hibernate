package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Amazon;
import com.jsp.dto.Amazon_id;
import com.jsp.dto.Bike;

public class Amazon_Controller {
public static void main(String[] args) {
	Amazon amazon = new Amazon();
	amazon.setUname("abc");
	amazon.setPwd("ab123");
	
	
	
	Amazon_id id = new Amazon_id();
	id.setEmail("abc@gmail.com");
	id.setMno(299909999);
	amazon.setId(id);
	
	Bike bike = new Bike();
	bike.setBikeid(1);
	bike.setBrand("Hero");
	bike.setPrice(34000);
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = entityManagerFactory .createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	transaction.begin();
	manager.persist(bike);
	transaction.commit();
}
}
