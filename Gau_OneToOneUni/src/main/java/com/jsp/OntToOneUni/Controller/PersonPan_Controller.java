package com.jsp.OntToOneUni.Controller;

import com.jsp.OntToOneUni.dao.PersonPan_Dao;
import com.jsp.OntToOneUni.dto.PanCard;
import com.jsp.OntToOneUni.dto.Person;

public class PersonPan_Controller {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		person.setPersonId(104);
		person.setName("Shivani");
		person.setAddress("Banglore");
		person.setMobileNo(87675786968l);
		
		PanCard card = new PanCard();
		card.setPanNo(10004);
		card.setName("Gautami Sagar");
		card.setIssueDate("30th Aug, 2023");
		
		person.setPanCard(card);
		
		PersonPan_Dao dao = new PersonPan_Dao();
//		dao.savePerson(person);
//		dao.savePan(card);
		
//		dao.updatePerson(person);
		
//		dao.findPerson(104);
		dao.removePerson(104);
		
	}

}
