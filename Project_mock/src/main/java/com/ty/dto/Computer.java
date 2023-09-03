package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Computer {
@Id
private int cid;
private String model;
private String brand;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn
private Company company;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn
private Employee employee;
public int getId() {
	return cid;
}
public void setId(int id) {
	this.cid = id;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
