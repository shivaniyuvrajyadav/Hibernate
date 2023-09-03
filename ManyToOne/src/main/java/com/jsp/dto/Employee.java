package com.jsp.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
private int id;
private String ename ;
private double sal ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}

}
