package com.railway.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.railway.model.Help;


/**
 * The Class HelpMapper.
 */
public class HelpMapper implements RowMapper<Help> {

		/* 
		 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
		 */
		@Override
		public Help mapRow(ResultSet resultSet, int i) throws SQLException {

			Help help = new Help();
			help.setUsername(resultSet.getString("username"));
			help.setIssue(resultSet.getString("issue"));
			help.setProblem(resultSet.getString("problem"));
			return help;

		}
}


