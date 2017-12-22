package com.itheima.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {
	//1 创建连接池
	private static DataSource dataSource;
	// 编写固定代码
	static{
		try {
			//1) 加载properties文件，获得Properties对象
			InputStream is = 
DBCPUtils.class.getClassLoader().getResourceAsStream("dbcp.properties");
			Properties prop = new Properties();
			prop.load(is);
			//2) 通过工厂，创建连接池
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 获得数据库(连接池)
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
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}