package com.railway.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.dao.RegisterDao;
import com.railway.model.RegisterModel;


/**
 * The Class RegisterService.
 */
@Service
public class RegisterService {

	/** The register dao. */
	@Autowired
	private RegisterDao registerDao;

	/**
	 * Check login.
	 *
	 * @param user the user
	 * @return the string
	 */
	public String checkLogin(RegisterModel user) {
		return this.registerDao.checkLogin(user);
	}
	
	/**
	 * Gets the user id.
	 *
	 * @param user the user
	 * @return the user id
	 */
	public String getUserId(RegisterModel user) {
		return this.registerDao.userId(user);
	}

	/**
	 * Forgot password.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean forgotPassword(RegisterModel user) {
		return this.registerDao.forgotPassword(user);
	}
	
	/**
	 * Post user password.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean postUserPassword(RegisterModel user) {
		return this.registerDao.updatePassword(user);
	}


	
}
