package com.ty.student.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import com.ty.student.dto.Student;

public class Student_dao {

	
		// TODO Auto-generated constructor stub
		public void saveStudent(Student student) {
			
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			
				
	} 
		public void findStudent(int id) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Student student = entityManager.find(Student.class, id);
			System.out.println(student);
			
		}
		public void DeleteStudent(int id) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Student s = entityManager.find(Student.class, id);
			entityTransaction.begin();
			entityManager.remove(s);
			entityTransaction.commit();
			
		}
		
		public void FindAllStudent(Student student) {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			javax.persistence.Query query = entityManager.createQuery("select a from Student a ");
			List<Student>list = query.getResultList();
			System.out.println(list);
		}
		
 
}

