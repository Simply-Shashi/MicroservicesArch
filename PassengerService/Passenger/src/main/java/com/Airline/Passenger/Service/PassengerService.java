package com.Airline.Passenger.Service;

import java.util.List;

import com.Airline.Passenger.model.Passenger;

public interface PassengerService {
	public List<Passenger> displayAll();
	public String deletePassenger(int PassengerId);
    public Passenger insertPassenger(Passenger pass);
}
