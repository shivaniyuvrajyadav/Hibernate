package com.jsp.onetomany_bii.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Student {
@Id
private int stid;
private String name;
private String stream;
private int prn;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn
private University university;

public int getStid() {
	return stid;
}

public void setStid(int stid) {
	this.stid = stid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getStream() {
	return stream;
}

public void setStream(String stream) {
	this.stream = stream;
}

public int getPrn() {
	return prn;
}

public void setPrn(int prn) {
	this.prn = prn;
}

public University getUniversity() {
	return university;
}

public void setUniversity(University university) {
	this.university = university;
}


}
