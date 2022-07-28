package com.railway.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.railway.model.TrainDetails;


/**
 * The Interface AdminService.
 */
public interface AdminService 
{
	
	/**
	 * Gets the all details.
	 *
	 * @return the all details
	 */
	public List<TrainDetails> getAllDetails();
	
	/**
	 * Gets the details by train no.
	 *
	 * @param trainNo the train no
	 * @return the details by train no
	 */
	public TrainDetails getDetailsByTrainNo(int trainNo);
	
	/**
	 * Adds the train details.
	 *
	 * @param trainDetails the train details
	 */
	public void addTrainDetails(TrainDetails trainDetails);
	
	/**
	 * Update train details.
	 *
	 * @param trainNo the train no
	 * @param trainDetails the train details
	 * @return the train details
	 */
	public TrainDetails updateTrainDetails(int trainNo,TrainDetails trainDetails);
	
	/**
	 * Delete train details.
	 *
	 * @param trainNo the train no
	 * @return the response entity
	 */
	public ResponseEntity<TrainDetails> deleteTrainDetails(int trainNo);

}
