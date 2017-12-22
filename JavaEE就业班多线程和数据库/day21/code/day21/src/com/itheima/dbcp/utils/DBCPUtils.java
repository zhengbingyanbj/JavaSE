package com.itheima.dbcp.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.dbcp.BasicDataSource;

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
