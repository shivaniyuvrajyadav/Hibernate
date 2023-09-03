package org.jsp.car_wala;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Entity
public class Car {
	@Id
	private String brand;
	private int price ;
	private String color ;	
		
public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

public int getPrice() {
		return price;
	}

public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}


public void setColor(String color) {
		this.color = color;
	}


@Override
public String toString() {
	return "Car [brand=" + brand + ", price=" + price + ", color=" + color + "]";
}

public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Car c = new Car();
	c.setBrand("ertiga");
	c.setColor("blue");
	c.setPrice(50000);
	
//	entityTransaction.begin();
//	entityManager.persist(c);
//	entityTransaction.commit();
	
//	entityTransaction.begin();
//	entityManager.merge(c);
//	entityTransaction.commit();
	
	
	Query q = entityManager.createQuery("select c from Car c");
	List <Car> list = q.getResultList();
	
	for(Car c1:list) {
		System.out.println(list);
	}
	
}
}
