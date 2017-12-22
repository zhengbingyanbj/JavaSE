package com.itheima.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	//连接池
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource(); 
	
	/**
	 * 获得数据源(连接池)
	 * @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	/**
	 * 获得连接
	 * @return
	 * @throws SQLException 
	 */
	public static Connection getConnection(){
		//将从连接池中获得连接
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
