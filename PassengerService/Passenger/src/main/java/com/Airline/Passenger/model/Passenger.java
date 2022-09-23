package com.Airline.Passenger.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.MultiValueMap;

@Entity
@Table(name="passenger")
public class Passenger {
	
	@Id
	int airlineId;
	

	@Column
	int PassengerId;
	
	@Column
	int Password;
	
	@Column
	String FirstName;
	
	@Column
	String LastName;
	
	@Column
	String Address;
	
	@Column
	int mobileNumber;
	
	@Column
	String emailId;

	public Passenger(int airlineId, int passengerId, int password, String firstName, String lastName, String address, int mobileNumber,
			String emailId) {
		super();
		this.airlineId = airlineId;
		PassengerId = passengerId;
		Password = password;
		FirstName = firstName;
		LastName = lastName;
		Address = address;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}

	public int getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}

	public int getPassengerId() {
		return PassengerId;
	}

	public void setPassengerId(int passengerId) {
		PassengerId = passengerId;
	}

	public int getPassword() {
		return Password;
	}

	public void setPassword(int password) {
		Password = password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	

}
