package com.railway.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railway.Exception.ResourceNotFoundException;
import com.railway.model.RegisterModel;
import com.railway.service.RegisterService;


/**
 * The Class RegisterController.
 */
@RestController
@CrossOrigin(origins = { "http://localhost:4200" })
public class RegisterController {

	/** The Constant LOGGER. */
	private final static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

	
	/** The register service. */
	@Autowired
	private RegisterService registerService;
	
	/**
	 * Login.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/auth")
	public ResponseEntity<Object> login(@RequestBody RegisterModel model) {
		LOGGER.info("Start - login");
		String loginStatus = this.registerService.checkLogin(model);
		if (loginStatus.equals("Password") || loginStatus.equals("Username")) {
			Map<String, String> message = new HashMap<String, String>();
			message.put("role", loginStatus);
			LOGGER.info("End - login");
			return new ResponseEntity<Object>(message, HttpStatus.BAD_REQUEST);
		} else {
			String role = loginStatus.substring(9, loginStatus.length());
			Map<String, String> message = new HashMap<String, String>();
			message.put("role", role);
			LOGGER.info("End - login");
			return new ResponseEntity<Object>(message, HttpStatus.OK);
			
		}
	}
	
	/**
	 * Forgot user id.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/forgotUserId")
	public ResponseEntity<Object> forgotUserId(@RequestBody RegisterModel model) {
		LOGGER.info("Start - forgotUserId");
		String userId = this.registerService.getUserId(model);
		if (!userId.equals("")) {
			Map<String, String> message = new HashMap<String, String>();
			message.put("userId", userId);
			LOGGER.info("End - forgotUserId");
			return ResponseEntity.ok(message);
		} else {
			LOGGER.info("End - forgotUserId");
			throw new ResourceNotFoundException("User ID not found");
		}
	}
	
	
	/**
	 * Forgot password.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/forgotPassword")
	public ResponseEntity<Object> forgotPassword(@RequestBody RegisterModel model) {
		
		LOGGER.info("Start - forgotPassword");
		boolean status = this.registerService.forgotPassword(model);
		if (status) {
			LOGGER.info("End - forgotPassword");
			return new ResponseEntity<Object>(HttpStatus.OK);
		} else {
			LOGGER.info("End - forgotPassword");
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	/**
	 * Password.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/Password")
	public ResponseEntity<Object> Password(@RequestBody RegisterModel model) {
		LOGGER.info("Start - Password");
		String userId = this.registerService.getUserId(model);
		if (!userId.equals("")) {
			Map<String, String> message = new HashMap<String, String>();
			message.put("userId", userId);
			LOGGER.info("End - Password");
			return ResponseEntity.ok(message);
			
		} else {
			LOGGER.info("End - Password");
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}
	
	/**
	 * Post password.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PutMapping("/UserPassword")
	public ResponseEntity<Object> postPassword(@RequestBody RegisterModel model) {
		LOGGER.debug("Start - postPassword");
		try {
			boolean status = registerService.postUserPassword(model);
			if (!status) {
				throw new Exception();
			}
			LOGGER.debug("End - postPassword");
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			LOGGER.debug("End - postPassword");
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}
	
	

}