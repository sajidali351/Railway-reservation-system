package com.railway.model;
 import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The Class UserModel.
 */
@Entity
@Table(name = "user") 
public class UserModel {
	
	/** The Id. */
	@Id
	private String Id;
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/**
	 * Instantiates a new user model.
	 */
	public UserModel() {
		
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
	public  void setUsername(String username) {
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
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	
	
}
