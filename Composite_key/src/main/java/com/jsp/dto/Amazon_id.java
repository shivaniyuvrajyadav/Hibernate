package com.jsp.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;
@Embeddable
public class Amazon_id implements  Serializable{
	private String email;
	private long mno;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	

}
