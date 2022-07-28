package com.railway.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.railway.model.TrainDetails;
import com.railway.service.AdminServiceImpl;

/**
 * The Class AdminController.
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin")
public class AdminController {
	
	/** The Constant LOGGER. */
	private final static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

	
	/** The admin service impl. */
	@Autowired
	private AdminServiceImpl adminServiceImpl;
    	
	/**
	 * To Search All Train Details For Admin*.
	 *
	 * @return the all details
	 */
	@GetMapping("/all")
	public List<TrainDetails> getAllDetails() {
		LOGGER.info("Start - all");
		LOGGER.info("End - all");
		return adminServiceImpl.getAllDetails();
	}
	
	/**
	 * To Search Trains Using TrainNo For Admin*.
	 *
	 * @param trainNo the train no
	 * @return the details by train no
	 */
	@GetMapping("/find/{trainNo}")
	public TrainDetails getDetailsByTrainNo(@PathVariable Integer trainNo) {
		LOGGER.info("Start - find");
		LOGGER.info("End - find");
		return adminServiceImpl.getDetailsByTrainNo(trainNo);
	}

	
	/**
	 * Adds the train details.
	 *
	 * @param trainDetails the train details
	 * @return the string
	 */
	@PostMapping("/addtrain")
	public String addTrainDetails(@RequestBody TrainDetails trainDetails) {
		LOGGER.info("Start - add train");
		adminServiceImpl.addTrainDetails(trainDetails);
		LOGGER.info("End - add train");
		return ("Added Train Details With Train Number - " + trainDetails.getTrainNo() + " Successfully..!!");
	}
	
	/**
	 * To Update Trains Using TrainNo & TrainDetails For Admin*.
	 *
	 * @param trainNo the train no
	 * @param trainDetails the train details
	 * @return the string
	 */
	@PutMapping("/update/{trainNo}")
	public String updateTrainDetails(@PathVariable Integer trainNo,
			@Valid @RequestBody TrainDetails trainDetails) {
		LOGGER.info("Start - update train");
		adminServiceImpl.updateTrainDetails(trainNo, trainDetails);
		LOGGER.info("End - update train");
		return ("Updated Train Details With Train No -" + trainDetails.getTrainNo() + " Successfully..!!");
	}
    
	/**
	 * To Delete Trains Using TrainNo For Admin*.
	 *
	 * @param trainNo the train no
	 * @return the string
	 */
	@DeleteMapping("/delete/{trainNo}")
	public String deleteTrainDetails(@PathVariable Integer trainNo) {
		LOGGER.info("Start - delete train");
		adminServiceImpl.deleteTrainDetails(trainNo);
		LOGGER.info("End - delete train");
		return ("Removed Train Details With Train No -" + trainNo);
	}

	/**
	 * Update The No Of Seats Based On The No Of Passengers That Booked Ticket*.
	 *
	 * @param trainNo the train no
	 * @param noOfPassengers the no of passengers
	 */
	@GetMapping("/updateSeats/{trainNo}/{noOfPassengers}")
	public void updateSeats(@PathVariable int trainNo,@PathVariable int noOfPassengers)
	{
		LOGGER.info("Start - update Seat train");
		TrainDetails currentTrain=adminServiceImpl.getDetailsByTrainNo(trainNo);
		int initialSeats=currentTrain.getNoOfSeats();
		int finalSeats=initialSeats-noOfPassengers;
		currentTrain.setNoOfSeats(finalSeats);
		adminServiceImpl.updateTrainDetails(trainNo, currentTrain);
		LOGGER.info("End - update Seat train");
	}

}
