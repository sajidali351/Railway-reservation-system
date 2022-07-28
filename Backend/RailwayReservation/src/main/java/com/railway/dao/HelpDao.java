package com.railway.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.railway.mapper.HelpMapper;
import com.railway.model.Help;


/**
 * The Class HelpDao.
 */
@Repository
public class HelpDao {
	
	/** The view help. */
	private final String VIEW_HELP = "select * from help";
	
	/** The insert help. */
	private final String INSERT_HELP = "insert into help values(?,?,?);";
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	/**
	 * Insert feedback.
	 *
	 * @param help the help
	 * @return true, if successful
	 */
	public boolean insertFeedback(Help help) {
		if (jdbcTemplate.update(INSERT_HELP, help.getUsername(), help.getIssue(), help.getProblem()) != 0) {
			return true;
		}
		return false;
	}

	/**
	 * Gets the all feedback.
	 *
	 * @return the all feedback
	 */
	public List<Help> getAllFeedback() {
		return this.jdbcTemplate.query(VIEW_HELP, new HelpMapper());
	}


}
