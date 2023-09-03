package org.jsp.onetoneAssignment.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Info {
	@Id
	private int id ;
	private String habitat;
	private int age ; 
	private Animal animal;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
	@Override
	public String toString() {
		return "Info [id=" + id + ", habitat=" + habitat + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
