package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country {
@Id
private int id;
private String name;
private String gov ;

@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
private List<Citizens> citizens;

public int getId() {
	return id;
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

public String getGov() {
	return gov;
}

public void setGov(String gov) {
	this.gov = gov;
}

public List<Citizens> getCitizens() {
	return citizens;
}

public void setCitizens(List<Citizens> citizens) {
	this.citizens = citizens;
}


}
