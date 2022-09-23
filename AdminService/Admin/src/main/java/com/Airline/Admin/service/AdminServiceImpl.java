package com.Airline.Admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.Airline.Admin.Model.Admin;
import com.Airline.Admin.Model.PassengerDto;
import com.Airline.Admin.repo.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	FeignProxy proxy;
	
	@Autowired
	RestTemplate template;
	
	@Autowired
	AdminRepository repo;
	
	@Override
	public String deletePassengerProfile(int PassengerId) {
		return proxy.deletePassengerProfile(PassengerId);
	}

	@Override
	public List<Admin> findAllPassenger(int PassengerId) {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public List<PassengerDto> findByAirline(int airlineId) {
		// TODO Auto-generated method stub
		return ;
	}

	@Override
	public List<Admin> findAllFlight() {
		// TODO Auto-generated method stub
		return null;
	}

}
