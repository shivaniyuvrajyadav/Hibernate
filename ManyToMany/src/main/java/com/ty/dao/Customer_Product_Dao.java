package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Customer;
import com.ty.dto.Product;

public class Customer_Product_Dao {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void saveCustomer(Customer customer) {
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
		
	}
	
	public void deleteProduct(int id) {
		Product product = manager.find(Product.class, id);
		if (product  != null) {
			List<Customer> customers = manager.createQuery("from Customer").getResultList();
			for (Customer customer : customers) {
				if (customer.getProduct().contains(product)) {
					customer.getProduct().remove(product);
				}
			}
			transaction.begin();
			manager.remove(product);
			transaction.commit();
		}
		else {
			System.out.println("no record found");
		}
	}
	
	public void removeCustomerbyId(int cid,int pid) {
		Customer customer = manager.find(Customer.class, cid);
		List<Product> product = customer.getProduct();
		Product p1 = manager.find(Product.class, pid);
		
		if (product.contains(p1)) {
			product.remove(p1);
		}
		customer.setProduct(product);
		transaction.begin();
		manager.persist(customer);
		transaction.commit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
