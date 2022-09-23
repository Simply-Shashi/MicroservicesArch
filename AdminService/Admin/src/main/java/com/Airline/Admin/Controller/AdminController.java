package com.Airline.Admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Airline.Admin.Model.Admin;
import com.Airline.Admin.Model.PassengerDto;
import com.Airline.Admin.service.AdminService;

@RestController
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	AdminService service;
	
	@GetMapping("/all")
	public List<Admin> getAll(){
		return service.findAllFlight();
	}
	
	@GetMapping("/search/Passenger/{airline}")
	public List<PassengerDto>searchByAirline(@PathVariable("airlineId") String airlineId){
		return service.findByAirline(airlineId);
	}
	
	@DeleteMapping("/search/Passenger")
	
	

}
