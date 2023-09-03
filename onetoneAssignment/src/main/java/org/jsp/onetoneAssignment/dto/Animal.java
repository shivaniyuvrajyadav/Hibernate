package org.jsp.onetoneAssignment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class Animal {
@Id
	private int id;
	public Info getInfo() {
	return info;
}
public void setInfo(Info info) {
	this.info = info;
}
	private String name;
	private String species;
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "animal")
	private Info info ;
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
	public String getSpecies() {
		return species;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", species=" + species + "]";
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
}
