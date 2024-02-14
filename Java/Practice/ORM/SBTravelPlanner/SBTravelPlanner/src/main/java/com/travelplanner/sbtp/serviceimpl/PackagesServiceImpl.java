package com.travelplanner.sbtp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travelplanner.sbtp.entity.Packages;
import com.travelplanner.sbtp.repository.PackagesRepository;
import com.travelplanner.sbtp.service.PackagesService;

@Service
public class PackagesServiceImpl implements PackagesService {
	@Autowired
	PackagesRepository pRepo;
	
	@Override
	public List<Packages> fetchPackagesDetails() {
		return pRepo.findAll();
	}

	@Override
	public List<Packages> fetchpackageDetails1(String city) {
		return pRepo.findByCityy(city);
	}
}
