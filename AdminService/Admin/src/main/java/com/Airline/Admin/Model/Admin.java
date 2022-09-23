package com.Airline.Admin.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import java.sql.Time;

@Entity
@Table(name="Flights")
public class Admin {
	@Id
	int flightId;
	
	@Column
	int airlineId;
	
	@Column 
	String airlineName;
	
	@Column 
	String fromLocation;
	
	@Column
	String toLocation;
	
	@Column
	Time departureTime;
	
	@Column
	Time arrivalTime;
	
	@Column
	Time duration;
	
	@Column 
	int totalSeats;

	
	
	public Admin(int flightId, int airlineId, String airlineName, String fromLocation, String toLocation,
			Time departureTime, Time arrivalTime, Time duration, int totalSeats) {
		super();
		this.flightId = flightId;
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.duration = duration;
		this.totalSeats = totalSeats;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getFromLocation() {
		return fromLocation;
	}

	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}

	public String getToLocation() {
		return toLocation;
	}

	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Time getDuration() {
		return duration;
	}

	public void setDuration(Time duration) {
		this.duration = duration;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	
	
	

}
