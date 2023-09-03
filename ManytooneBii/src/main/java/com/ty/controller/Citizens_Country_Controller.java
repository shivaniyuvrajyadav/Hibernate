package com.ty.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.dao.Citizents_Country_Dao;
import com.ty.dto.Citizens;
import com.ty.dto.Country;

public class Citizens_Country_Controller {
	public static void main(String[] args) {
		
	
Country country = new Country();
 country.setGov("BJP");
 country.setId(2);
 country.setName("INDIA");
 
 
 Citizens citizens = new Citizens();
 citizens.setAge(20);
 citizens.setCid(20);
 citizens.setState("Maharashtra");
 citizens.setName("sagar");
 citizens.setCountry(country);
 
 Citizens citizens1 = new Citizens();
 citizens1.setAge(18);
 citizens1.setCid(3);
 citizens1.setState("Delhi");
 citizens1.setName("vinod");
 citizens1.setCountry(country);
 
 
 List<Citizens>list = new ArrayList<Citizens>();
 list.add(citizens);
 list.add(citizens1);
 
 country.setCitizens(list);
 
 
 Citizents_Country_Dao dao = new Citizents_Country_Dao();
// dao.saveCitizen(citizens1);
 dao.savecountry(country);
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
}
