package com.itheima.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0Utils {
	//���ӳ�
	private static ComboPooledDataSource dataSource = new ComboPooledDataSource(); 
	
	/**
	 * �������Դ(���ӳ�)
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
		//�������ӳ��л������
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
