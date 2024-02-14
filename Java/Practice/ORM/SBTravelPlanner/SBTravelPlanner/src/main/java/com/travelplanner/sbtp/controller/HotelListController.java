package com.travelplanner.sbtp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.travelplanner.sbtp.entity.HotelList;
import com.travelplanner.sbtp.service.HotelListService;

//controller for all incoming requests on  hotellist entity
@RestController
public class HotelListController {
	
	@Autowired
	HotelListService hs;
	
	//get mapping to fetch all hotels
	@GetMapping("/getHotelList")
	public List<HotelList> getHotels() {
		return hs.fetchHotelDetails();
	}
	
	//get mapping with parameter for list list as per city
	@GetMapping("/getHotelsByCity/{city}")
	public List<HotelList> getHotelListByCity(@PathVariable("city") String city) {
		return hs.fetchHotelDetails1(city);
	}
}