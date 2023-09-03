package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Company {
@Id
private int id;
private String name;
private String email;
@OneToOne(cascade = CascadeType.ALL )
private Address address;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")

private List<Employee> employee;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn
private List< Computer> computer;
@OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
private List<Department> department;

public List<Computer> getComputer() {
	return computer;
}
public void setComputer(List<Computer> list) {
	this.computer = list;
}
public List<Department> getDepartment() {
	return department;
}
public void setDepartment(List<Department> department) {
	this.department = department;
}
public List<Employee> getEmployee() {
	return employee;
}
public void setEmployee(List<Employee> list) {
	this.employee = list;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Company [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", employee="
			+ employee + ", computer=" + computer + ", department=" + department + "]";
}

}
