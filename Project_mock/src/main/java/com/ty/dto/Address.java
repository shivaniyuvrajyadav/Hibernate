package com.ty.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {
@Id
private int id;
private int pincode;
private long phno;
private String place;

@OneToOne(cascade = CascadeType.ALL,mappedBy = "address")
private Company company;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public long getPhno() {
	return phno;
}

public void setPhno(long phno) {
	this.phno = phno;
}

public String getPlace() {
	return place;
}

public void setPlace(String place) {
	this.place = place;
}

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}
}
