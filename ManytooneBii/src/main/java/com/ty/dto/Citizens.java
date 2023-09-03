package com.ty.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Citizens {
@Id
private int cid;
private String state;
private String name;
private int age ; 
@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn
private Country country;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}



}
