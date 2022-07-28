package com.railway.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.railway.model.RegisterModel;


/**
 * The Class RegisterMapper.
 */
public class RegisterMapper implements RowMapper<RegisterModel> {

	
	/* 
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 */
	@Override
	public RegisterModel mapRow(ResultSet resultSet, int i) throws SQLException {

		RegisterModel register = new RegisterModel();
		register.setFirstName(resultSet.getString("first_name"));
		register.setLastName(resultSet.getString("last_name"));
		register.setDob(resultSet.getDate("dob"));
		register.setGender(resultSet.getString("gender"));
		register.setUsername(resultSet.getString("username"));
		register.setContactNumber(resultSet.getString("contact_number"));
		register.setPassword(resultSet.getString("password"));
		register.setAns1(resultSet.getString("ans1"));
		register.setAns2(resultSet.getString("ans2"));
		register.setAns3(resultSet.getString("ans3"));

		return register;

	}
}
