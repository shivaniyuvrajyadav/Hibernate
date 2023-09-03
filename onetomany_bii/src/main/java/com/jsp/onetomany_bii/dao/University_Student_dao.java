package com.jsp.onetomany_bii.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.onetomany_bii.dto.Student;
import com.jsp.onetomany_bii.dto.University;

public class University_Student_dao {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    EntityTransaction transaction = entityManager.getTransaction();
    
    
    public void saveStudent (Student student) {
    	transaction.begin();
    	entityManager.persist(student);
    	transaction.commit();
    }
	
    public void saveUniversity (University university) {
    	transaction.begin();
    	List<Student>student = university.getStudent();
    	for (Student student2 : student) {
    		student2.setUniversity(university);
    	  	}
    	entityManager.persist(university);
    	transaction.commit();
    }
    
    
	
}
