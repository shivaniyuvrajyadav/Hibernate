package org.jsp.onetomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.onetomany_uni.dao.Flipkart_User_Items_Dao;
import org.jsp.onetomany_uni.dto.Flipkart_User;
import org.jsp.onetomany_uni.dto.Items;

public class Flipkart_User_Items_Controller {

	public static void main(String[] args) {
		
		Items items1=new Items();
		items1.setId(1001);
		items1.setName("mobile");
		items1.setPrice(150);
		items1.setQty(2);
		
		Items items2 =new Items();
		items2.setId(1002);
		items2.setName("Bat");
		items2.setPrice(999);
		items2.setQty(1);
		
		Items items3 =new Items();
		items3.setId(1003);
		items3.setName("Stump");
		items3.setPrice(1200);
		items3.setQty(3);
		
		List<Items>list =new ArrayList<Items>();
		list.add(items1);
		list.add(items2);
		list.add(items3);
		
		Flipkart_User user =new Flipkart_User();
		user.setId(1);
		user.setEmail("swap@email.com");
		user.setMno(675443322);
		user.setAddress("Thane");
		user.setPwd("123");
		
		user.setItems(list);
		
	Flipkart_User_Items_Dao dao= new Flipkart_User_Items_Dao();
//	dao.saveFlipkart(user);

//	dao.updateFlipkart(2, list);
//	dao.findFlipkartById(1);
//	dao.findALL(user);
//	dao.deleteFlipkart(1002);
	dao.deleteItems(1003);
		

		
		}

}

