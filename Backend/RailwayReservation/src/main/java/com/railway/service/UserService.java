package com.railway.service;

import java.util.List;

import com.railway.model.TrainDetails;


/**
 * The Interface UserService.
 */
public interface UserService {

	/**
	 * Gets the all details.
	 *
	 * @return the all details
	 */
	public List<TrainDetails> getAllDetails();
	
	/**
	 * Pnr status.
	 *
	 * @param pnrNo the pnr no
	 * @return the string
	 */
	public String pnrStatus(long pnrNo);
	
	/**
	 * Gets the details by train no.
	 *
	 * @param trainNo the train no
	 * @return the details by train no
	 */
	public TrainDetails getDetailsByTrainNo(int trainNo);
	
	/**
	 * Gets the train details by end points.
	 *
	 * @param sourceStation the source station
	 * @param destinationStation the destination station
	 * @return the train details by end points
	 */
	public List<TrainDetails> getTrainDetailsByEndPoints(String sourceStation,String destinationStation);

}

