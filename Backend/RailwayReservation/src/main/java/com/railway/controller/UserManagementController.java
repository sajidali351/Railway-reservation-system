package com.railway.controller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.railway.model.TrainDetails;
import com.railway.model.UserSignUp;
import com.railway.service.SignUpService;
import com.railway.service.UserServiceImpl;


/**
 * The Class UserManagementController.
 */
@RestController
@CrossOrigin(origins =  "http://localhost:4200")
@RequestMapping("/user")
public class UserManagementController {
	
	/** The Constant LOGGER. */
	private final static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);
	
	/**  Autowired SignUpService Object *. */
	@Autowired
	private SignUpService signUpService;

	/**  Autowired UserServiceImpl Object *. */
	@Autowired
	private UserServiceImpl userServiceImpl;

	/**
	 *  This Method Is Used To Add User Details *.
	 *
	 * @param userSignUp the user sign up
	 * @return the string
	 */
	@PostMapping("/signup")
	public String saveUser(@RequestBody UserSignUp userSignUp) {
		LOGGER.info("Start - signup");
		try {
			this.signUpService.addUser(userSignUp);
			LOGGER.info("End - signup");			
			return "User Added Successfully " + userSignUp;
		} catch (Exception e) {
			LOGGER.info("End - signup");
			e.printStackTrace();
		}
		LOGGER.info("Failed - signup");
		return "Operation Failed";
	}

	/**
	 *  This Method Is Used To Display All Users *.
	 *
	 * @return the list
	 */
	@GetMapping("/allusers")
	public List<UserSignUp> findAllUsers() {
		LOGGER.info("Start - find all user");
		LOGGER.info("End - find all user");
		return signUpService.getuser();
	}

	/**
	 *  This Method Is Used To Update Users By Id *.
	 *
	 * @param userSignUp the user sign up
	 * @param id the id
	 * @return the string
	 */
	@PutMapping("/update")
	public String updateUser(@RequestBody UserSignUp userSignUp, @RequestParam int id) {
		LOGGER.info("Start - update");
		this.signUpService.updateUser(id, userSignUp);
		LOGGER.info("End - update");
		return "Updated User with id " + id;
	}

	/**
	 *  This Method Is Used To Delete Users By Id *.
	 *
	 * @param id the id
	 * @return the string
	 */
	@DeleteMapping("/delete")
	public String deleteUser(@RequestParam int id) {
		LOGGER.info("Start - delete");
		this.signUpService.deleteUser(id);
		LOGGER.info("End - delete");
		return "Deleted User With id " + id;
	}
	

	/**
	 *  This Method Is Used To Display All Trains Available For The Users *.
	 *
	 * @return the all details
	 */
	@GetMapping("/alltrains")
	public List<TrainDetails> getAllDetails() {
		LOGGER.info("Start - all train");
		LOGGER.info("End - all train");
		return userServiceImpl.getAllDetails();
		
	}

	/**
	 *  This Method Is Used To See The Status Of Train Using PNRNO *.
	 *
	 * @param pnrNo the pnr no
	 * @return the status
	 */
	@GetMapping("/status")
	public String getStatus(@RequestParam long pnrNo) {
		LOGGER.info("Start - status");
		return userServiceImpl.pnrStatus(pnrNo);
	}

	/**
	 *  This Method Is Used To Display Train Details Using TrainNo *.
	 *
	 * @param trainNo the train no
	 * @return the details by train no
	 */
	@GetMapping("/trainNo")
	public TrainDetails getDetailsByTrainNo(@RequestParam Integer trainNo) {
		LOGGER.info("Start - train no");
		LOGGER.info("End - train no");
		return userServiceImpl.getDetailsByTrainNo(trainNo);
	}

	/**
	 * This Method Is Used To Display Train Details Using Source And Destination.
	 *
	 * @param sourceStation the source station
	 * @param destinationStation the destination station
	 * @return the train details by start station
	 */
	@GetMapping("/route/{sourceStation}/{destinationStation}")
	public List<TrainDetails> getTrainDetailsByStartStation(@PathVariable String sourceStation,
			@PathVariable String destinationStation) {
		LOGGER.info("Start - Route");
		LOGGER.info("End - Route");		
		return userServiceImpl.getTrainDetailsByEndPoints(sourceStation, destinationStation);
	}

}
