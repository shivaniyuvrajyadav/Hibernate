package com.jsp.OntToOneUni.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PanCard {
	@Id
	private int panNo;
	private String Name;
	private String issueDate;
	
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	
}
