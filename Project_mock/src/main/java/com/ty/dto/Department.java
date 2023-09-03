package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Department {
@Id
private int id;
private String name;
private long phno;
@ManyToMany(cascade = CascadeType.ALL)
@JoinColumn
private List<Employee> employee;
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn
private Company company;
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public List<Employee> getEmployee() {
	return employee;
}
public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}



}
