package com.qigong.iocdemo;

import org.springframework.stereotype.Component;

@Component
public class CtripBookingService implements BookingService {

	public void bookFlight() {
		System.out.println("book fight by Ctrip!");
	}
}
