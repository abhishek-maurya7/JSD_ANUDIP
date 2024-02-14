package com.travelplanner.sbtp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelplanner.sbtp.entity.HotelList;
import com.travelplanner.sbtp.repository.HotelListRepository;
import com.travelplanner.sbtp.service.HotelListService;


//business logic for entity beans
@Service
public class HotelListServiceImpl implements HotelListService {
	@Autowired
	HotelListRepository hlrepo;
	
	//Using findAll() method of JpsRepository to fetch all list of hotel
	@Override
	public List<HotelList> fetchHotelDetails() {		
		return hlrepo.findAll();
	}

	//using findByCity() of hotelList repository to fetch list as per city
	@Override
	public List<HotelList> fetchHotelDetails1(String city) {
		return hlrepo.findByCity(city);
	}
}
