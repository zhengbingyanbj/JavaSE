package com.itheima.dbcp.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

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
 * BasicDataSourceFacotry
 * 		static DataSource createDataSource(Properties p)
 * 
 */
public class DBCPUtils2 {
	
	private static DataSource dataSource;
	
	static{
		
		try {
			Properties p = new Properties();
			InputStream in = DBCPUtils2.class.getClassLoader().getResourceAsStream("dbcp-config.properties");
			p.load(in);
			dataSource = BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			throw new RuntimeException("���ӳش���ʧ��"+e);
		}
	
		
//		String className = p.getProperty("driverClassName");
//		String url = p.getProperty("url");
//		String username = p.getProperty("username");
//		String password = p.getProperty("password");
//		
//		
//		dataSource = new BasicDataSource();
//		dataSource.setDriverClassName(className);
//		dataSource.setUrl(url);
//		dataSource.setUsername(username);
//		dataSource.setPassword(password);
		
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
