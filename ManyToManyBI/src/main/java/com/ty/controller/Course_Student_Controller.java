package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.dao.Course_Student_dao;
import com.ty.dto.Course;
import com.ty.dto.Student;

public class Course_Student_Controller {
public static void main(String[] args) {
	Course course =  new Course();
	course.setCname("c#");
	course.setDuration("100");

	
	Course course1 =  new Course();
	course1.setCname("css");
	course1.setDuration("120");

	Student student = new Student();
	student.setAddress("malad");
	student.setSname("priyanka");

	Student student1 = new Student();
	student1.setAddress("cst");
	student1.setSname("shreyas");
	
	Student student11 = new Student();
	student11.setAddress("borivali");
	student11.setSname("sanika");
	
	List<Student>list = new ArrayList<Student>();
	list.add(student1);
	list.add(student11);
	list.add(student);
	
	List<Course>clist = new ArrayList<Course>();
	clist.add(course);
	clist.add(course1);
	
	
	Course_Student_dao dao = new Course_Student_dao();
	
		dao.saveCourse(clist);
	
}
}
