package org.jsp.chai;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

@Entity
@Table

public class Chai {
	@Id
	private int id;
	private String brand;
	private String milk;
	
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
	public String getMilk() {
		return milk;
	}
	public void setMilk(String milk) {
		this.milk = milk;
	}
	
	
	
	@Override
	public String toString() {
		return "Chai [id=" + id + ", brand=" + brand + ", milk=" + milk + "]";
	}
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Chai c = new Chai();
		c.setId(5);
		c.setBrand("bru");
		c.setMilk("amul");
		
//		et.begin();
//		em.persist(c);
//		et.commit();
		
		
        et.begin();
        em.merge(c);
        et.commit();
        
        //find
        
        Chai c1 = em.find(Chai.class, 2);
        System.out.println(c1);
        
        
		
	}
	
	
	
	
	

}


