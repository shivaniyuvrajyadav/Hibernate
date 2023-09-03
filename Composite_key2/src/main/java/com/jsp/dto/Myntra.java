package com.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Myntra {
private String uname;
private String pwd;

@EmbeddedId
private Myntra_id id;

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public Myntra_id getId() {
	return id;
}

public void setId(Myntra_id id) {
	this.id = id;
}




}
