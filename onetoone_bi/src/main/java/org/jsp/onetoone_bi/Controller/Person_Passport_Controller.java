package org.jsp.onetoone_bi.Controller;

import org.jsp.onetoone_bi.dao.Person_Passport_Dao;
import org.jsp.onetoone_bi.dto.Passport;
import org.jsp.onetoone_bi.dto.Person;

public class Person_Passport_Controller {

	public static void main(String[] args) {
		Passport passport = new Passport();
	
		passport.setPno(101);
		passport.setOrigin("canada");
		passport.setDate_of_issue("27-08-2003");
		
		Person person = new Person();
		person.setId(101);
		person.setName("raj");
		person.setPhno(8081099);
		person.setAddress("toronto");
		person.setPassport(passport);
		
		passport.setPerson(person);
		
		Person_Passport_Dao dao = new Person_Passport_Dao();
//	    dao.savePerson(person);
	    dao.savePassport(passport);
//        dao.updatePassport(passport);
//        dao.findPersonById(101);
//		dao.deletePersonByID(101);
        
	}
	
	
}
