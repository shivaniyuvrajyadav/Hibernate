package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int sid;
private String sname;
private String address;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(joinColumns = @JoinColumn(name="sid"),inverseJoinColumns = @JoinColumn(name="cid"))
private List<Course>course;

public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<Course> getCourse() {
	return course;
}
public void setCourse(List<Course> course) {
	this.course = course;
}



}
