package com.jsp.dao;

import java.security.PublicKey;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Department;
import com.jsp.dto.Employee;

public class Department_Employee_Dao {
private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
private EntityManager entityManager = entityManagerFactory.createEntityManager();
private EntityTransaction transaction = entityManager.getTransaction();



public void saveDepartment(Department department) {
	transaction.begin();
	entityManager.persist(department);
	transaction.commit();
	
}	
	public void addDepartment(int eid , Department department) {
		Employee employee = entityManager.find(Employee.class, 101);
		department.setEmployee(employee);
		
		transaction.begin();
		entityManager.merge(department);
		transaction.commit();
		
	}
	
	public void Delete(int id) {
		transaction.begin();
		Department department = entityManager.find(Department.class,5 );
		department.setEmployee(null);
		entityManager.remove(department);
		transaction.commit();
		
		
	}

}

