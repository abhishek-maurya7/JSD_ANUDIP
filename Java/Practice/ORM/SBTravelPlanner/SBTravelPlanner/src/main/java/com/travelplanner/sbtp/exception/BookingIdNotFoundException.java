package com.travelplanner.sbtp.exception;

public class BookingIdNotFoundException  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public BookingIdNotFoundException(String message) {
		super(message);
	}
	
	
}