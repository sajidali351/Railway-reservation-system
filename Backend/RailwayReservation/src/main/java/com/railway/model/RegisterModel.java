package com.railway.model;

import java.util.Date;


/**
 * The Class RegisterModel.
 */
public class RegisterModel {

	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The dob. */
	private Date dob;
	
	/** The gender. */
	private String gender;
	
	/** The contact number. */
	private String contactNumber;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/** The ans 1. */
	private String ans1;
	
	/** The ans 2. */
	private String ans2;
	
	/** The ans 3. */
	private String ans3;


	/**
	 * Gets the ans 1.
	 *
	 * @return the ans 1
	 */
	public String getAns1() {
		return ans1;
	}

	/**
	 * Sets the ans 1.
	 *
	 * @param ans1 the new ans 1
	 */
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}

	/**
	 * Gets the ans 2.
	 *
	 * @return the ans 2
	 */
	public String getAns2() {
		return ans2;
	}

	/**
	 * Sets the ans 2.
	 *
	 * @param ans2 the new ans 2
	 */
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}

	/**
	 * Gets the ans 3.
	 *
	 * @return the ans 3
	 */
	public String getAns3() {
		return ans3;
	}

	/**
	 * Sets the ans 3.
	 *
	 * @param ans3 the new ans 3
	 */
	public void setAns3(String ans3) {
		this.ans3 = ans3;
	}

	/**
	 * Instantiates a new register model.
	 */
	public RegisterModel() {
		super();
	}

	/**
	 * Instantiates a new register model.
	 *
	 * @param firstName the first name
	 * @param lastName the last name
	 * @param dob the dob
	 * @param gender the gender
	 * @param contactNumber the contact number
	 * @param username the username
	 * @param password the password
	 */
	public RegisterModel(String firstName, String lastName, Date dob, String gender, String contactNumber,
			String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.username = username;
		this.password = password;
	}

	/**
	 * Gets the first name.
	 *
	 * @return the first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name.
	 *
	 * @param firstName the new first name
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param lastName the new last name
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Gets the dob.
	 *
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * Sets the dob.
	 *
	 * @param dob the new dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	/**
	 * Gets the gender.
	 *
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * Sets the gender.
	 *
	 * @param gender the new gender
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the contact number.
	 *
	 * @return the contact number
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * Sets the contact number.
	 *
	 * @param contactNumber the new contact number
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
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
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegisterModel [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender="
				+ gender + ", contactNumber=" + contactNumber + ", username=" + username + ", password=" + password
				+ ", ans1=" + ans1 + ", ans2=" + ans2 + ", ans3=" + ans3 + "]";
	}

}
