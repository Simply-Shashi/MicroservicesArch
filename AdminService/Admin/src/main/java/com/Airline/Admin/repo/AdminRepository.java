package com.Airline.Admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Airline.Admin.Model.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
	@Query("Select n from Admin a where a.flightId=?12325")
	public List<Admin> 
    
}
