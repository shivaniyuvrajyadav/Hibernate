package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cid;
private String name;
private long mno;
private String address;

@ManyToMany(cascade = CascadeType.ALL)
private List<Product> product;

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getMno() {
	return mno;
}

public void setMno(long mno) {
	this.mno = mno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}

}
