package com.railway.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/*
import com.RailwayReservationBookingService.exception.ResourceNotFoundException;
import com.RailwayReservationBookingService.model.UserDetails;
import com.RailwayReservationBookingService.repository.BookingRepository;*/

import com.railway.Exception.ResourceNotFoundException;
import com.railway.Repository.BookingRepository;
import com.railway.model.UserDetails;


/**
 * The Class BookingServiceImpl.
 */
@Service
public class BookingServiceImpl implements BookingService {

	/** The id. */
	int id;

	/** The booking repository. */
	@Autowired
	private BookingRepository bookingRepository;

	/* 
	 * @see com.railway.service.BookingService#getAll()
	 */
	@Override
	public List<UserDetails> getAll() {
		List<UserDetails> userDetails = new ArrayList<UserDetails>();
		bookingRepository.findAll().forEach(userDetails1 -> userDetails.add(userDetails1));
		System.out.println(userDetails);
		return userDetails;
	}

	/* 
	 * @see com.railway.service.BookingService#getUserDetailsById(long)
	 */
	@Override
	public UserDetails getUserDetailsById(long pnrNo) {
		List<UserDetails> userDetails = bookingRepository.findAll();
		for (UserDetails x : userDetails) {
			if (x.getPnrNo() == pnrNo) {
				
				id = x.getId();
			}
		}
		return bookingRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No ticket is booked with PNR Number : " + pnrNo));
	}

	/* 
	 * @see com.railway.service.BookingService#addUserBookingDetails(com.railway.model.UserDetails)
	 */
	@Override
	public String addUserBookingDetails(UserDetails userDetails) {
		bookingRepository.save(userDetails);

		return ("Your ticket id booked successfully...!!!  " + "Your pnr number is " + userDetails.getPnrNo()
				+ " Please proceed to payment....");
	}

	/* 
	 * @see com.railway.service.BookingService#deleteUserBookingDetails(long)
	 */
	@Override
	public String deleteUserBookingDetails(long pnrNo) {
		String msg = ("Your booking ticket with PNR Number : " + pnrNo + " is cancelled. "
				+ "Your payment amount will be credited to your account within 5 to 7 days..!!!");
		List<UserDetails> userDetails = bookingRepository.findAll();
		for (UserDetails x : userDetails) {
			if (x.getPnrNo() == pnrNo) {
				id = x.getId();
			}
		}
		UserDetails existingDetails = bookingRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Cannot delete as booking is not done with PNR Number : " + pnrNo));
		bookingRepository.delete(existingDetails);
		return msg;
	}


	
}
