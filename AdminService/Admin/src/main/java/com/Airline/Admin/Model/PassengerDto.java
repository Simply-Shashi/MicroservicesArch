package com.Airline.Admin.Model;

public class PassengerDto {
	int airlineId;
	int PassengerId;
	int Password;
	String FirstName;
	String LastName;
	String Address;
	int mobileNumber;
	String emailId;
	public PassengerDto(int PassengerId, int Password, String FirstName, String LastName, String Address,
			int mobileNumber, String emailId) {
		super();
		this.airlineId = airlineId;
		this.PassengerId = PassengerId;
		this.Password = Password;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
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
	public void setPassengerId(int PassengerId) {
		this.PassengerId = PassengerId;
	}
	public int getPassword() {
		return Password;
	}
	public void setPassword(int Password) {
		this.Password = Password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		Address = Address;
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
