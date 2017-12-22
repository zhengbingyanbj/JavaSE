package com.itheima.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DBCPUtils {
	//1 �������ӳ�
	private static DataSource dataSource;
	// ��д�̶�����
	static{
		try {
			//1) ����properties�ļ������Properties����
			InputStream is = 
DBCPUtils.class.getClassLoader().getResourceAsStream("dbcp.properties");
			Properties prop = new Properties();
			prop.load(is);
			//2) ͨ���������������ӳ�
			dataSource = BasicDataSourceFactory.createDataSource(prop);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * ������ݿ�(���ӳ�)
	 * @return
	 */
	public static DataSource getDataSource(){
		return dataSource;
	}
	/**
	 * �������
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