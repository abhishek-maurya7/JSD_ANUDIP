package com.travelplanner.sbtp.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.travelplanner.sbtp.entity.Bookings;
import com.travelplanner.sbtp.exception.BookingIdNotFoundException;
import com.travelplanner.sbtp.repository.BookingsRepository;
import com.travelplanner.sbtp.service.BookingsService;

@Service
public class BookingsServiceImpl  implements BookingsService{
	
	@Autowired
	BookingsRepository bRepo;
	
	@Override
	public Bookings registerBookings(Bookings bookings) {
		return bRepo.save(bookings);
	}

	@Override
	public void removeBookings(int bid) {
		bRepo.findById(bid).orElseThrow(() -> new BookingIdNotFoundException("Enter id is incorrect bookingid, please check"));
       bRepo.deleteById(bid);
		
	}

	@Override
	public Bookings fetchBookingsDetail(int bid) {
		return bRepo.findById(bid).orElseThrow(() -> new BookingIdNotFoundException("Enter id is incorrect bookingid, please check"));
		
	}

}