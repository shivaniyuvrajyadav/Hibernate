package com.ty.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Course;
import com.ty.dto.Student;

public class Course_Student_dao {
private EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
private EntityManager manager = factory.createEntityManager();
private EntityTransaction transaction = manager.getTransaction();


public void saveStudent(List<Student> student) {
	for (Student student2 : student) {
		transaction.begin();
		manager.persist(student2);
	}
	
	transaction.commit();
}


public void saveCourse(List<Course> course) {
	for (Course course2 : course) {
		transaction.begin();
		manager.persist(course2);	
	}
	
	transaction.commit();
}


















}
