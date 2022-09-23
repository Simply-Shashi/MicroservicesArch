package com.Airline.Admin.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Airline.Admin.Model.PassengerDto;

@FeignClient(name="Passenger",url="http://localhost:9091/airlin")
public class FeignProxy {
	@DeleteMapping("/delete/{PassengerId}")
	public String deletePassengerProfile(@PathVariable("PassengerId")int PassengerId);
	
}
