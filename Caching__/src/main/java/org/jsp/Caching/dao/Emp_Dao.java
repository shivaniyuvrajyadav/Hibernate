package org.jsp.Caching.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Caching.dto.Employee;

public class Emp_Dao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	private EntityManager manager = factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();
	
	public void saveEmployee(Employee employee) {
		transaction.begin();
		manager.persist(employee);
		transaction.commit();
	}
	
	public void findEmp(int id) {
		
		Employee employee=  manager.find(Employee.class, id);
		System.out.println(employee);
		
	}
}
