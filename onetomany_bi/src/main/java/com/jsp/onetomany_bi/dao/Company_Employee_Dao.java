package com.jsp.onetomany_bi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_bi.dto.Company;
import com.jsp.onetomany_bi.dto.Employee;

public class Company_Employee_Dao {
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	public  void saveEmployee(Employee employee) {
	  entityTransaction.begin();
	  entityManager.persist(employee);
	  entityTransaction.commit();
	  
	}
	
	public  void saveCompany(Company company) {
		  entityTransaction.begin();
		  List<Employee>employees=company.getEmployee();
		  for (Employee emp : employees) {
			emp.setCompany(company);
		}
		  
		  entityManager.persist(company);
		  entityTransaction.commit();
		  
		  
		}
//	public void updateCompany(Company company) {
//		entityTransaction.begin();
//		entityManager.merge(company);
//		entityTransaction.commit();
//	}
	
	public void deleteCompany(int cid) {
		entityTransaction.begin();
		Company company = entityManager.find(Company.class, cid);
		entityManager.remove(company);
		System.out.println(company);
		entityTransaction.commit();
		
	}
	

//	public void deleteEmployee(Employee employee) {
//		entityTransaction.begin();
//		entityManager.remove(employee);
//		entityTransaction.commit();
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
