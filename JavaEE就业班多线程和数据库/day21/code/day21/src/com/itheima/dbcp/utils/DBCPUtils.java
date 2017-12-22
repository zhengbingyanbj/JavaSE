package com.itheima.dbcp.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

/*
 * ��ȡ���Ӷ���
 * �淶  javax.sql.DataSource�ӿ� 
 * 		Connection getConnection();
 * �κ����ӳض���Ҫʵ�ִ˽ӿ�
 * ����DBCP���ӳ���˵ ʵ�ִ˽ӿڵ�����
 * BasicDataSource ����ֻ��Ҫ����BasicDataSource���� 
 * ������ʵ�ֵ�getConnection�����Ϳ��Ի�ȡ����
 * 
 * ע����Ҫ���� 4������Ҫ�� 
 * ע������ �õ���  com.mysql.jdbc.Driver
 * �������ݿ��url jdbc:mysql://localhost:3306/day21
 * ���ݿ��û���  username   root
 * ���ݿ�����   password    root 
 * 
 */
public class DBCPUtils {
	
	private static BasicDataSource dataSource;
	
	static{
		
		dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/day21");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		
//		dataSource.setInitialSize(10);
	}

	public static Connection getConnection(){
		try {
			Connection con = dataSource.getConnection();
			return con ;
		} catch (Exception e) {
			throw new RuntimeException("��ȡ����ʧ�ܣ�"+e);
		}
		
		
	}
	
	public static void  close(Connection con ,Statement stat ,ResultSet rs){
		try {
			if(con!=null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			if(stat!=null)
				stat.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(rs!=null)
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
