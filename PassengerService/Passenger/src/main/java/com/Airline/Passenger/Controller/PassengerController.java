package com.Airline.Passenger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Airline.Passenger.Service.PassengerService;
import com.Airline.Passenger.model.Passenger;

@RestController
@RequestMapping("/Passenger")
public class PassengerController {
	@Autowired
	PassengerService service;
	
	@Value("${server.port}")
	public String port;
	
	@GetMapping("/all")
	public ResponseEntity<List<Passenger>> getAllPassenger(){
		return new ResponseEntity<>(service.displayAll(), HttpStatus.OK);}
	
	
	@DeleteMapping("/delete/{PassengerId}")
	public ResponseEntity<String> deletePassenger(@PathVariable("PassengerId")int PassengerId){
	      return new ResponseEntity(service.deletePassenger(PassengerId), HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<Passenger> savePassenger(Passenger passenger){
		return new ResponseEntity<>(service.insertPassenger(passenger), HttpStatus.CREATED);
	}
	
}
