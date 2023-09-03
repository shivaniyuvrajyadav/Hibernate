package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private int cid;
private String cname;
private String duration;

@ManyToMany(cascade = CascadeType.ALL,mappedBy = "course")
private List<Student>student;

public int getCid() {
	return cid;
}

public void setCid(int cid) {
	this.cid = cid;
}

public String getCname() {
	return cname;
}

public void setCname(String cname) {
	this.cname = cname;
}

public String getDuration() {
	return duration;
}

public void setDuration(String duration) {
	this.duration = duration;
}

public List<Student> getStudent() {
	return student;
}

public void setStudent(List<Student> student) {
	this.student = student;
}



}
