package com.railway.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.railway.model.RegisterModel;


/**
 * The Class RegisterDao.
 */
@Repository
public class RegisterDao {

	/** The login. */
	private final String LOGIN = "select password from user where username = ? ";
	
	/** The get role. */
	private final String GET_ROLE = "select role from User where username = ?";
	
	/** The update password. */
	private final String UPDATE_PASSWORD = "update User set password=? where username=? ";
	
	/** The userid. */
	private final String USERID = "select username from Forget_User where ans1 =? and ans2=? and ans3=? ";
	
	/** The forgot password. */
	private final String FORGOT_PASSWORD = "select username from Forget_User where username = ? and ans1 = ? and ans2 = ? and ans3 = ?;";
	
	/** The jdbc template. */
	@Autowired
	private JdbcTemplate jdbcTemplate;

	/**
	 * Check login.
	 *
	 * @param user the user
	 * @return the string
	 */
	public String checkLogin(RegisterModel user) {
		String loginStatus;
		try {
			String password = this.jdbcTemplate.queryForObject(LOGIN, String.class, new Object[] { user.getUsername() });
			if (password.equals(user.getPassword())) {
				loginStatus = "Logged In";
				String role = this.jdbcTemplate.queryForObject(GET_ROLE, String.class,
						new Object[] { user.getUsername() });
				loginStatus += role;
				System.out.println(loginStatus);
			} else {
				loginStatus = "Password";
			}
			
		} catch (Exception e) {
			loginStatus = "Username";
		}
		return loginStatus;
	}
	
	/**
	 * Update password.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean updatePassword(RegisterModel user) {
		if (jdbcTemplate.update(UPDATE_PASSWORD, user.getPassword(), user.getUsername()) != 0) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * Forgot password.
	 *
	 * @param user the user
	 * @return true, if successful
	 */
	public boolean forgotPassword(RegisterModel user) {
		boolean status;
		try {
			this.jdbcTemplate.queryForObject(FORGOT_PASSWORD, String.class,
					new Object[] { user.getUsername(), user.getAns1(), user.getAns2(), user.getAns3() });
			status = true;
		} catch (Exception e) {
			status = false;
		}
		return status;
		
	}
	
	/**
	 * User id.
	 *
	 * @param user the user
	 * @return the string
	 */
	public String userId(RegisterModel user) {
		String username = "";
		try {
			username = this.jdbcTemplate.queryForObject(USERID, String.class,
					new Object[] { user.getAns1(), user.getAns2(), user.getAns3() });
		} catch (Exception e) {

		}

		return username;
	}

}