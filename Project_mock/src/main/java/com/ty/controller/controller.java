package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.dao.Dao;
import com.ty.dto.Address;
import com.ty.dto.Company;
import com.ty.dto.Computer;
import com.ty.dto.Department;
import com.ty.dto.Employee;
import com.ty.dto.Skills;

public class controller {
public static void main(String[] args) {
	
	Address address = new Address();
	address.setId(101);
	address.setPhno(78490384940l);
	address.setPincode(400015);
	address.setPlace("thane");
	
	Employee employee = new Employee();
	employee.setId(102);
	employee.setName("shivani");
	employee.setPhno(78574839390332l);
	employee.setAge(23);
	employee.setSal(20000);
	
	
	Employee employee1 = new Employee();
	employee1.setId(103);
	employee1.setName("shreya");
	employee1.setPhno(785748393);
	employee1.setAge(26);
	employee1.setSal(205678);
	
	Employee employee11 = new Employee();
	employee11.setId(104);
	employee11.setName("sanika");
	employee11.setPhno(78574839390l);
	employee11.setAge(26);
	employee11.setSal(29000);
	
	List<Employee>list = new ArrayList<Employee>();
	list .add(employee11);
	list.add(employee11);
	list.add(employee11);
	
	Computer computer = new Computer();
	computer.setId(105);
	computer.setBrand("lenovo");
	computer.setModel("i3");
	computer.setEmployee(employee);
		
	Computer computer1 = new Computer();
	computer1.setId(106);
	computer1.setBrand("Hp");
	computer1.setModel("5");
	computer1.setEmployee(employee1);
	
	List<Computer>list2 = new ArrayList<Computer>();
	list2.add(computer);
	list2.add(computer1);



	Company company = new Company();
	company.setEmail("tcs123@gmail.com");
	company.setId(107);
	company.setName("tcs");
	company.setAddress(address);
	company.setEmployee(list);
    company.setComputer(list2); 
	
	computer.setCompany(company);
	computer1.setCompany(company);
	
	Department department = new Department();
	department.setId(108);
	department.setName("development");
	department.setPhno(2234877880922l);
		department.setCompany(company);
	
	Department department1 = new Department();
	department1.setId(109);
	department1.setName("testing");
	department1.setPhno(223487772618l);
	department1.setEmployee(list);
	department1.setCompany(company);
	
	List<Department>list1 = new ArrayList<Department>();
	list1.add(department);
	list1.add(department1);
	
	company.setDepartment(list1);
	company.setComputer(list2);
	
	
	Skills skills = new Skills();
	skills.setId(1100);
	skills.setName("java");
	skills.setEmployee1(employee);
	
	Skills skills1 = new Skills();
	skills1.setEmployee1(employee1);
	skills1.setId(120);
	skills1.setName("React");
	
	Skills skills2 = new Skills();
	skills2.setEmployee1(employee11);
	skills2.setId(130);
	skills2.setName("Javascript");
	
	employee.setComputer(computer);
	employee1.setComputer(computer1);
	employee11.setComputer(computer1);
	
	employee.setCompany(company);
	employee1.setCompany(company);
	employee11.setCompany(company);
	
	List<Skills>list3 = new ArrayList<Skills>();
	list3.add(skills);
	list3.add(skills1);
	list3.add(skills2);
	
	employee.setSkills(list3);
	employee1.setSkills(list3);
	employee11.setSkills(list3);
	
	
	
	Dao dao = new Dao();
	dao.saveCompany(company);
	
//	dao.saveEmployee(employee);
	
//	dao.findAllComp(company);
	
//	dao.findAllEmp(employee11);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
