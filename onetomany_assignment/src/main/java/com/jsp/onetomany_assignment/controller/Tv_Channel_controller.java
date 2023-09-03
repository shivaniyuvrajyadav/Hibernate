package com.jsp.onetomany_assignment.controller;

import java.util.ArrayList;
import java.util.List;

import com.jsp.onetomany_assignment.dao.Tv_Channel_Dao;
import com.jsp.onetomany_assignment.dto.Channel;
import com.jsp.onetomany_assignment.dto.TV;

public class Tv_Channel_controller {
public static void main(String[] args) {
	TV tv = new TV();
	tv.setId(101);
	tv.setDish("TATA");
	tv.setPrice(10000);
	tv.setBrand("LG");
	
	
	TV tv1 = new TV();
	tv1.setBrand("MI");
	tv1.setDish("videocon");
	tv1.setId(102);
	tv1.setPrice(15000);
	
	TV tv2 = new TV();
	tv2.setBrand("Panasonic");
	tv2.setId(103);
	tv2.setDish("TATA");
	tv2.setPrice(20000);
	
	
	List <TV> l = new ArrayList<TV>();
	l.add(tv);
	l.add(tv1);
	l.add(tv2);
	
	
	
	Channel ch = new Channel();
	
	ch.setId(1);
	ch.setLanguage("hindi");
	ch.setName("star Plus");
	ch.setTv(l);
	
	Tv_Channel_Dao dao = new Tv_Channel_Dao();
	dao.saveTv(ch);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}