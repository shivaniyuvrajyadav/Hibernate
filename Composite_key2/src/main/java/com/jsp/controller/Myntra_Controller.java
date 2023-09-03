package com.jsp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Clothes;
import com.jsp.dto.Myntra;
import com.jsp.dto.Myntra_id;

public class Myntra_Controller {
public static void main(String[] args) {
	Myntra myntra = new Myntra();
	myntra.setUname("shivani");
	myntra.setPwd("asj@122");
	
	Myntra_id id = new Myntra_id();
	id.setEmail("shivani123@gmail.com");
	id.setMno(345678906);
	myntra.setId(id);
	
	
	Clothes clothes = new Clothes();
	clothes.setId(1);
	clothes.setBrand("zara");
	clothes.setPrice(2000);
	
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	
	transaction.begin();
	manager.persist(clothes);
	transaction.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
