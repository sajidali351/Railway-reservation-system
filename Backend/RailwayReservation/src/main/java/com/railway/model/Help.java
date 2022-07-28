package com.railway.model;


/**
 * The Class Help.
 */
public class Help {
	
	/** The username. */
	private String username;
	
	/** The issue. */
	private String issue;
	
	/** The problem. */
	private String problem;
	
	
	
	/**
	 * Instantiates a new help.
	 */
	public Help() {
	}
	
	
	/**
	 * Instantiates a new help.
	 *
	 * @param username the username
	 * @param issue the issue
	 * @param problem the problem
	 */
	public Help(String username, String issue, String problem) {
		super();
		this.username = username;
		this.issue = issue;
		this.problem = problem;
	}

	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param username the new username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
	/**
	 * Gets the issue.
	 *
	 * @return the issue
	 */
	public String getIssue() {
		return issue;
	}
	
	/**
	 * Sets the issue.
	 *
	 * @param issue the new issue
	 */
	public void setIssue(String issue) {
		this.issue = issue;
	}
	
	/**
	 * Gets the problem.
	 *
	 * @return the problem
	 */
	public String getProblem() {
		return problem;
	}
	
	/**
	 * Sets the problem.
	 *
	 * @param problem the new problem
	 */
	public void setProblem(String problem) {
		this.problem = problem;
	}
	
	

}
