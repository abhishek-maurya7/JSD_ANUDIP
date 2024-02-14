package com.travelplanner.sbtp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.travelplanner.sbtp.entity.HotelList;

//Repository to get predefined method of JpaRepository for entity HotelList
public interface HotelListRepository extends JpaRepository<HotelList, Integer>{
	
	//custom query using JPQL
	//fetching hotel list as per city
	@Query("Select hl from HotelList hl where hl.city = ?1")
	List<HotelList>findByCity(String city); 
	
	@Query("Select chl from HotelList chl where chl.price > ?1 and chl.price < ?2")
	List<HotelList>findByPrice(long price);
}
