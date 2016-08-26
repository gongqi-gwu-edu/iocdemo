package com.qigong.iocdemo;

public class Boss {
	
	private BookingService bookingService;
	
	public Boss() {
		this.bookingService = new QunarBookingService();
	}

	public BookingService getBookingService() {
		return bookingService;
	}

	public void setBookingService(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public void goSomewhere() {
		bookingService.bookFlight();
	}
}
