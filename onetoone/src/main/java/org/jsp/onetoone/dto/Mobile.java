package org.jsp.onetoone.dto;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mobile {
	@Id
	private int id;
	private String name;
	private String color;
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Os os;

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", os=" + os + "]";
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	

}
