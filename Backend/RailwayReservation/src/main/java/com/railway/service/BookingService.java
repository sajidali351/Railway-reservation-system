package com.railway.service;

import java.util.List;

import com.railway.model.UserDetails;

/**
 * The Interface BookingService.
 */
public interface BookingService {
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<UserDetails> getAll();

	/**
	 * Gets the user details by id.
	 *
	 * @param pnrNo the pnr no
	 * @return the user details by id
	 */
	public UserDetails getUserDetailsById(long pnrNo);

	/**
	 * Adds the user booking details.
	 *
	 * @param userDetails the user details
	 * @return the string
	 */
	public String addUserBookingDetails(UserDetails userDetails);

	/**
	 * Delete user booking details.
	 *
	 * @param pnrNo the pnr no
	 * @return the string
	 */
	public String deleteUserBookingDetails(long pnrNo);
}
