package com.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.Repository.UserSignUpRepository;
import com.railway.model.UserSignUp;


/**
 * The Class SignUpService.
 */
@Service
public class SignUpService {
	
	/** * Autowired User SignUp Repository **. */
	@Autowired
	private UserSignUpRepository userSignUpRepository;

	/**
	 * * Method For Adding Data **.
	 *
	 * @param userSignUp the user sign up
	 */
	public void addUser(UserSignUp userSignUp) {
		userSignUpRepository.save(userSignUp);
	}

	/**
	 * * Method For Listing The Data **.
	 *
	 * @return the user
	 */
	public List<UserSignUp> getuser() {
		List<UserSignUp> s = (List<UserSignUp>) userSignUpRepository.findAll();
		return s;
	}

	/**
	 * * Method For Updating The Data **.
	 *
	 * @param id the id
	 * @param userSignUp the user sign up
	 */
	public void updateUser(int id, UserSignUp userSignUp) {
		userSignUpRepository.save(userSignUp);
	}

	/**
	 * * Method For Deleting The Data **.
	 *
	 * @param id the id
	 */
	public void deleteUser(int id) {
		userSignUpRepository.deleteById(id);
	}

}
