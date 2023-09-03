package com.ty.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skills {
@Id
private int id;
private String name;
@ManyToOne(cascade = CascadeType.ALL)
private Employee employee;
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
public Employee getEmployee1() {
	return employee;
}
public void setEmployee1(Employee employee1) {
	this.employee = employee1;
}

}
