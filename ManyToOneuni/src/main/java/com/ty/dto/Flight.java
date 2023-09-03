package com.ty.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Flight {
@Id
private int fid;
private String name;
private String type;


public int getFid() {
	return fid;
}
public void setFid(int fid) {
	this.fid = fid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}



}
