package com.travelplanner.sbtp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.travelplanner.sbtp.entity.Customer;

//repository to get predefined methods of 
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	//custom query
}
