package com.Airline.Passenger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Airline.Passenger.model.Passenger;
import com.Airline.Passenger.repo.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	PassengerRepository repo;

	@Override
	public List<Passenger> displayAll(){
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deletePassenger(int PassengerId) {
		// TODO Auto-generated method stub
		repo.deleteById(PassengerId);
		return "Passenger Removed";
	}

	@Override
	public Passenger insertPassenger(Passenger passenger) {
		// TODO Auto-generated method stub
		return repo.save(passenger);
	}
	

}
