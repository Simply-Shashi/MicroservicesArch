package com.Airline.Passenger.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Airline.Passenger.model.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{
	@Query("select p from Passenger p where p.PassengerId=?1")
	public List<Passenger> searchPassengerByPassengerId(int PassengerId);
	

}
