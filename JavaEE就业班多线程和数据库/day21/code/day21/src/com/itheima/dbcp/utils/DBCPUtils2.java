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
 * 获取连接对象
 * 规范  javax.sql.DataSource接口 
 * 		Connection getConnection();
 * 任何连接池都需要实现此接口
 * 对于DBCP连接池来说 实现此接口的类是
 * BasicDataSource 我们只需要创建BasicDataSource对象 
 * 调用其实现的getConnection方法就可以获取连接
 * 
 * 注意需要设置 4个基本要素 
 * 注册驱动 用的类  com.mysql.jdbc.Driver
 * 连接数据库的url jdbc:mysql://localhost:3306/day21
 * 数据库用户名  username   root
 * 数据库密码   password    root 
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
			throw new RuntimeException("连接池创建失败"+e);
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
			throw new RuntimeException("获取连接失败！"+e);
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
