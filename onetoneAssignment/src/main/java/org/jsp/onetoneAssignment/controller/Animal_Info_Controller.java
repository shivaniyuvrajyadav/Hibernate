package org.jsp.onetoneAssignment.controller;

import org.jsp.onetoneAssignment.dao.Animal_Info_Dao;
import org.jsp.onetoneAssignment.dto.Animal;
import org.jsp.onetoneAssignment.dto.Info;

public class Animal_Info_Controller {

	
		// TODO Auto-generated constructor stub
		public static void main(String[] args) {
		    Animal animal = new Animal();
		    animal.setId(101);
		    animal.setName("Tiger");
		    animal.setSpecies("Panthera tigris tigris");
			
			Info info = new Info();
			info.setId(101);
			info.setAge(10);
			info.setHabitat("forest");
			
			Animal_Info_Dao ai = new Animal_Info_Dao();
			ai.saveAnimal(animal);
//			ai.saveInfo(info);
//			ai.deleteAnimalByID(101);
			ai.deleteInfoByID(101);
			
		}

	
	
	}


