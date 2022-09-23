package com.Airline.Admin.service;

import java.util.List;

import com.Airline.Admin.Model.Admin;
import com.Airline.Admin.Model.PassengerDto;

public interface AdminService {
	
	public String deletePassengerProfile(int PassengerId);
	public List<PassengerDto> findAllPassenger(int PassengerId);
	public List<PassengerDto> findByAirline(int airlineId);
	public List<Admin> findAllFlight();

}
