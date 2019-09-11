package com.it.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.it.dao.UserDao;
import com.it.uitl.JDBCUtil02;


public class UserDaoImpl implements UserDao {

	@Override
	public boolean checkUserName(String username) throws SQLException {
		QueryRunner qr = new QueryRunner(JDBCUtil02.getDataSource());
		String sql = "select count(*) from users where username = ?";
		Long result = (Long)qr.query(sql, new ScalarHandler(), username);
		return result>0;
	}

}
