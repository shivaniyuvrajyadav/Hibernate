package com.jsp.controller;

import com.jsp.dao.Department_Employee_Dao;
import com.jsp.dto.Department;
import com.jsp.dto.Employee;

public class Department_Employee_Controller {
public static void main(String[] args) {
	Employee employee = new Employee();
	employee.setId(1023);
	employee.setEname("developer");
	employee.setSal(30000);
	
	
	
	Department dept =  new Department();
	dept.setDname("trainee");
	dept.setId(331);
	dept.setMno("30002");
	dept.setEmployee(employee);
	
	Department dept1 =  new Department();
	dept1.setDname("it");
	dept1.setId(5904);
	dept1.setMno("30002");
	dept1.setEmployee(employee);
	
	Department department = new Department();
	department.setDname("testing");
	department.setId(962);
	department.setMno("34088299");
	department.setEmployee(employee);
	

	
	
	Department_Employee_Dao  dao = new Department_Employee_Dao();
	dao.saveDepartment(department);
	
//	dao.addDepartment(2, department);
	
//	dao.Delete(4);
	
}
}
