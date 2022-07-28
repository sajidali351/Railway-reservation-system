package com.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.dao.HelpDao;
import com.railway.model.Help;


/**
 * The Class HelpService.
 */
@Service
public class HelpService {
	
	/** The help dao. */
	@Autowired
	private HelpDao helpDao;

	/**
	 * Post help.
	 *
	 * @param help the help
	 * @return true, if successful
	 */
	public boolean postHelp(Help help) {
		return helpDao.insertFeedback(help);
	}

	/**
	 * Gets the all help.
	 *
	 * @return the all help
	 */
	public List<Help> getAllHelp() {
		return this.helpDao.getAllFeedback();
	}

}
