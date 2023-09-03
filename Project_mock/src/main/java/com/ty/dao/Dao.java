package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.dto.Company;
import com.ty.dto.Computer;
import com.ty.dto.Department;
import com.ty.dto.Employee;

public class Dao {
private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
private EntityManager manager = factory.createEntityManager();
private EntityTransaction transaction = manager.getTransaction();



public void saveCompany(Company company) {
	
	transaction.begin();
		manager.persist(company);
	transaction.commit();
	}


public void saveEmployee(Employee employee) {
	transaction.begin();
		manager.persist(employee);
	transaction.commit();
}

public void findEmployee(int id) {
	
	Employee employee=manager.find(Employee.class, id);
	System.out.println(employee);
}

public void findCompany(int id) {
	
	Company company=manager.find(Company.class, id);
	System.out.println(company);
}

public void findAllEmp(Employee employee) {
	Query query=manager.createQuery("select a from Employee a");
	List<Employee> list=query.getResultList();
	System.out.println(list);
}

public void findAllComp(Company company) {
	Query query=manager.createQuery("select a from Company a");
	List<Company> list=query.getResultList();
	System.out.println(list);
}

public void updateEmployee(int id, List<Employee> employees) {
	
	Company company=manager.find(Company.class, id);
	
	if(company != null) {
		List<Employee> list=company.getEmployee();
		list.addAll(employees);
		company.setEmployee(employees);
		
		transaction.begin();
		manager.merge(company);
		transaction.commit();
	}
}

public void updateCompany(Company company) {
//	Company company=manager.find(Company.class, id);
//	Address address=manager.find(Address.class, id);
	company.setAddress(null);
	
	transaction.begin();
	manager.merge(company);
	transaction.commit();
}


























































































}
