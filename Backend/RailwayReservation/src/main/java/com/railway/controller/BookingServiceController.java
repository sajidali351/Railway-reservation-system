package com.railway.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.railway.model.UserDetails;
import com.railway.service.BookingServiceImpl;

/**
 * The Class BookingServiceController.
 */
@Component
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/user")
public class BookingServiceController {
	
	/** The Constant LOGGER. */
	private final static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

	
	/** The booking service impl. */
	@Autowired
	private BookingServiceImpl bookingServiceImpl;

	/** The rest template. */
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@GetMapping("/all")
	public List<UserDetails> getAll() {
		LOGGER.info("Start - all");
		LOGGER.info("End - all");
		return bookingServiceImpl.getAll();
	}

	/**
	 * Gets the user details by id.
	 *
	 * @param pnrNo the pnr no
	 * @return the user details by id
	 */
	@GetMapping("/getDetailsByPnrNo")
	public UserDetails getUserDetailsById(@RequestParam long pnrNo) {
		LOGGER.info("Start - getDetailsByPnrNo");
		LOGGER.info("End - getDetailsByPnrNo");
		return bookingServiceImpl.getUserDetailsById(pnrNo);
	}

	/**
	 * Adds the user details.
	 *
	 * @param userDetails the user details
	 * @return the string
	 */
	@PostMapping("/book")
	public String addUserDetails(@Valid @RequestBody UserDetails userDetails) {
		
		LOGGER.info("Start - book");
		userDetails.setPnrNo();
		userDetails.setPayment("Pending");
		int trainNo = userDetails.getTrainNo();
		int noOfAdults = userDetails.getAdults();
		int noOfChildren = userDetails.getChildren();
		int totalPassengers = noOfAdults + noOfChildren;
		LOGGER.info("End - book");
		return bookingServiceImpl.addUserBookingDetails(userDetails);
	}

	/**
	 * Delete user details by id.
	 *
	 * @param pnrNo the pnr no
	 * @return the string
	 */
	@DeleteMapping("/cancel/{pnrNo}")
	public String deleteUserDetailsById(@PathVariable long pnrNo) {
		LOGGER.info("Start - cancel");
		LOGGER.info("End - cancel");		
		return bookingServiceImpl.deleteUserBookingDetails(pnrNo);
	}
	

}
