package com.jsp.onetomany_assignment.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TV {
@Id
	private int id;
    private String brand;
    private String dish;
    private int price ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TV [id=" + id + ", brand=" + brand + ", dish=" + dish + ", price=" + price + "]";
	} 
    

}
