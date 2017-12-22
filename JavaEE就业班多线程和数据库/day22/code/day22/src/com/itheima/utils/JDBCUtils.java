package com.itheima.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
 * JDBC的工具类
 * 
 * 获取数据库连接的方法
 */
public class JDBCUtils {
	
	private static String url;
	private static String username;
	private static String password;
	private static String className;

	private JDBCUtils() {
	}
	
	static{
		
		try {
			init();
			// 注册驱动
			Class.forName(className);
		} catch (Exception e) {
			throw new RuntimeException("注册驱动失败"+e);
		}
		
	}
	
	
	public static void init() throws IOException{
		//创建集合对象
		Properties p = new Properties();
		InputStream in = JDBCUtils.class.getClassLoader().getResourceAsStream("config.properties");
		//加载配置文件
		p.load(in);
		// 获取连接
		url = p.getProperty("url");
		username = p.getProperty("username");
		password = p.getProperty("password");
		className = p.getProperty("className");
	}
	
	

	public static Connection getConnection() {
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			return con;
		} catch (Exception e) {
			throw new RuntimeException("获取连接失败"+e);
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
