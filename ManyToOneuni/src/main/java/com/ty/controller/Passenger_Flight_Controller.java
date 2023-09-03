package com.ty.controller;

import com.ty.dao.Passenger_Flight_Dao;
import com.ty.dto.Flight;
import com.ty.dto.Passenger;

public class Passenger_Flight_Controller {
public static void main(String[] args) {
	Flight flight = new Flight();
	flight.setName("indigo");
	flight.setType("international");
	flight.setFid(104);
	
	Passenger passenger = new Passenger();
	passenger.setAge(28);
	passenger.setName("shivam");
	passenger.setNumber(123338899);
	passenger.setPid(2);
	passenger.setFlight(flight);
	
	Passenger passenger1 = new Passenger();
	passenger1.setAge(32);
	passenger1.setName("aniket");
	passenger1.setNumber(749920020);
    passenger1.setPid(3);
	passenger1.setFlight(flight);
    
    
	Passenger passenger2 = new Passenger();
	passenger2.setAge(23);
	passenger2.setName("raghav");
	passenger2.setNumber(74839939);
	passenger2.setPid(4);
	passenger2.setFlight(flight);
	
	Passenger passenger3 = new Passenger();
	passenger3.setAge(34);
	passenger3.setName("ramesh");
	passenger3.setNumber(744789988);
	passenger3.setPid(5);
	passenger3.setFlight(flight);
	
	
	Passenger_Flight_Dao dao = new Passenger_Flight_Dao();
//	dao.saveFlight(flight);
	dao.savePassenger(passenger2);
	dao.Delete(3);
	

	
	
	
}
}
