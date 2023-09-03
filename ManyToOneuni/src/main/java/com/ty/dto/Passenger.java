package com.ty.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Passenger {
@Id
private int pid;
private String name;
private int number;
private int age;
@ManyToOne (cascade = CascadeType.ALL)
private Flight flight;
public Flight getFlight() {
	return flight;
}
public void setFlight(Flight flight) {
	this.flight = flight;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}

}
