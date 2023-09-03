package org.jsp.Caching.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.Caching.dao.Emp_Dao;
import org.jsp.Caching.dto.Employee;

public class Emp_Controller {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setName("Snehal");
		employee.setSal(87867876);
		
		Emp_Dao dao = new Emp_Dao();
		dao.saveEmployee(employee);
//		dao.findEmp(1);
//		dao.findEmp(2);
//		dao.findEmp(1);
//		dao.findEmp(2);
//		dao.findEmp(1);
//		dao.findEmp(2);
		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction transaction = manager.getTransaction();
//		
//		Employee employee1= manager.find(Employee.class, 1);
//		Employee employee2= manager.find(Employee.class, 2);
//		System.out.println(employee1);
//		System.out.println(employee2);
//		
//		Employee employee3= manager.find(Employee.class, 1);
//		Employee employee4= manager.find(Employee.class, 2);
//		System.out.println(employee3);
//		System.out.println(employee4);
		
		
	}
}
