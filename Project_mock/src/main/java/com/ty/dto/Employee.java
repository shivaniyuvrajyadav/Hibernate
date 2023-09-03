package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Employee {
@Id
private int eid;
private String name;
private double sal;
private int age;
private long phno;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn
private Company company;

@ManyToMany(cascade = CascadeType.ALL)
@JoinColumn
private List<Department> department;

@OneToMany(cascade = CascadeType.ALL,mappedBy = "employee")
private List<Skills> skills;

@OneToOne(cascade = CascadeType.ALL,mappedBy = "employee" )
private Computer computer;
public List<Department> getDepartment() {
	return department;
}
public void setDepartment(List<Department> department) {
	this.department = department;
}
public List<Skills> getSkills() {
	return skills;
}
public void setSkills(List<Skills> skills) {
	this.skills = skills;
}
public Computer getComputer() {
	return computer;
}
public void setComputer(Computer computer) {
	this.computer = computer;
}
public int getId() {
	return eid;
}
public void setId( int eid) {
	this.eid = eid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSal() {
	return sal;
}
public void setSal(double sal) {
	this.sal = sal;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
public Company getCompany() {
	return company;
}
public void setCompany(Company company) {
	this.company = company;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", age=" + age + ", phno=" + phno + ", company="
			+ company + ", department=" + department + ", skills=" + skills + ", computer=" + computer + "]";
}

}
