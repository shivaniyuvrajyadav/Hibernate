package com.jsp.onetomany_assignment.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Channel {
@Id
	private int id;
    private String name;
    private String language;
    @OneToMany(cascade=CascadeType.ALL)
    private List<TV>tv;
	public int getId() {
		return id;
	}
	public List<TV> getTv() {
		return tv;
	}
	public void setTv(List<TV> tv) {
		this.tv = tv;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Channel [id=" + id + ", name=" + name + ", language=" + language + "]";
	}
    
}
