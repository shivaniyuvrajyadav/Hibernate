package com.jsp.dto;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
// A composite primary key , also called composite key ,
// is a combination of two or more columns  to form a primary key for a table 
// more than one key in a db is composite key 

@Entity
public class Amazon {
private String uname;
private String pwd ;

@EmbeddedId
private Amazon_id id;

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

public Amazon_id getId() {
	return id;
}

public void setId(Amazon_id id) {
	this.id = id;
}




}
