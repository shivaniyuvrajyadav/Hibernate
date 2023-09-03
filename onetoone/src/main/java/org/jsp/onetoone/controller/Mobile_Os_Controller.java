package org.jsp.onetoone.controller;

import org.jsp.onetoone.dao.Mobile_Os_Dao;
import org.jsp.onetoone.dto.Mobile;
import org.jsp.onetoone.dto.Os;

public class Mobile_Os_Controller {

	public static void main(String[] args) {
		Mobile mobile=new Mobile();
		mobile.setId(101);
		mobile.setName("Redme");
		mobile.setColor("black");
		mobile.setPrice(30000);
		
		Os os=new Os();
		os.setId(101);
		os.setBit("64bit");
		os.setType("android");
		
		
		Mobile_Os_Dao dao = new Mobile_Os_Dao();
//		dao.saveMobile(mobile);
//	dao.saveOs(os);
//		dao.updateMobile(mobile);
		
		dao.findMobileById(101);
		dao.deleteMobileByID(101);
        dao.deleteOsByID(1003);
		
	}

}
