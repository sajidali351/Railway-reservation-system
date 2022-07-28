package com.railway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railway.model.Help;
import com.railway.service.HelpService;


/**
 * The Class HelpController.
 */
@RestController
@CrossOrigin("http://localhost:4200")
public class HelpController {
	
	/** The help service. */
	@Autowired
	private HelpService helpService;
	
	/**
	 * Post help.
	 *
	 * @param model the model
	 * @return the response entity
	 */
	@PostMapping("/UserHelp")
	public ResponseEntity<Object> postHelp(@RequestBody Help model) {
		try {
			boolean status = helpService.postHelp(model);
			if (!status) {
				throw new Exception();
			}
			return new ResponseEntity<Object>(model, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
		}
	}

	/**
	 * Gets the all help.
	 *
	 * @return the all help
	 */
	@GetMapping("/getHelp")
	public ResponseEntity<Object> getAllHelp() {
		return new ResponseEntity<Object>(this.helpService.getAllHelp(), HttpStatus.OK);
	}


}
