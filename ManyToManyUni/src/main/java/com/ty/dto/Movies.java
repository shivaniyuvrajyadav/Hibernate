package com.ty.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Movies {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

private int mid;
private String name;
private String language;
private double duration;
@ManyToMany(cascade = CascadeType.ALL)
private List< Actors> actor;
public int getMid() {
	return mid;
}

public void setMid(int mid) {
	this.mid = mid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public double getDuration() {
	return duration;
}

public void setDuration(double d) {
	this.duration = d;
}

public List<Actors> getActor() {
	return actor;
}

public void setActor(List<Actors> actor) {
	this.actor = actor;
}

@Override
public String toString() {
	return "Movies [mid=" + mid + ", name=" + name + ", language=" + language + ", duration=" + duration + ", actor="
			+ actor + "]";
}




}
