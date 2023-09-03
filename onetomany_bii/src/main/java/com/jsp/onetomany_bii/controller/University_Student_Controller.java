package com.jsp.onetomany_bii.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.onetomany_bii.dao.University_Student_dao;
import com.jsp.onetomany_bii.dto.Student;
import com.jsp.onetomany_bii.dto.University;

public class University_Student_Controller {
public static void main(String[] args) {
	

	University university = new University();
	university.setCity("Delhi");
	university.setId(1002);
	university.setName("university of mumbai");
	
	
	Student student = new Student ();
	student.setName("shivani");
	student.setPrn(23456000);
	student.setStid(1700);
	student.setStream("science");
	
	List <Student>list = new ArrayList<Student>();
	list .add(student);
	university.setStudent(list);
	
	University_Student_dao dao = new University_Student_dao();
//	dao.saveStudent(student);
	dao.saveUniversity(university);
	
}
}
