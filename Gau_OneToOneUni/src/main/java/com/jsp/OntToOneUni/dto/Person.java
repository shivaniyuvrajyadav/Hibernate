package com.jsp.OntToOneUni.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	private int personId;
	private String name;
	private String address;
	private long mobileNo;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PanCard panCard;

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public PanCard getPanCard() {
		return panCard;
	}

	public void setPanCard(PanCard panCard) {
		this.panCard = panCard;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo
				+ ", panCard=" + panCard + "]";
	}
	
	
	
}
