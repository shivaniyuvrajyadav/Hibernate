package com.ty.student.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.student.dao.Student_dao;
import com.ty.student.dto.Student;

public class Student_Controller {

	public static void main(String[] args) {
		Student  student = new Student();
		student.setId(103);
		student.setName("shivani");
		student.setMno(785412782);
		student.setAddress("Parel ");
		
		Student  student1 = new Student();
		student1.setId(101);
		student1.setName("dimple");
		student1.setMno(785324455);
		student1.setAddress("Dadar ");
		
		Student  student11 = new Student();
		student11.setId(102);
		student11.setName("swapnali");
		student11.setMno(7824455);
		student11.setAddress("Naigaon ");
		
		
		
		
////		
		Student_dao dao = new Student_dao();
//		dao.saveStudent(student11);
//		dao.DeleteStudent(103);
//		dao.findStudent(109);
		dao.FindAllStudent(student11);
		
	}

}
