package com.it.dao;

import java.sql.SQLException;

public interface UserDao {
	
	/**
	 * 检查用户名是否存在
	 * @param username
	 * @return true:存在, false: 不存在
	 */
	boolean checkUserName(String username) throws SQLException;
}
