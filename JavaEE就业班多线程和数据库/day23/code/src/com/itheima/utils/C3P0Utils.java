package com.itheima.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.fabric.xmlrpc.base.Data;

/*
 * 获取连接对象
 * javax.sql.DataSource  接口 
 * 		Connection getConnection()  抽象
 * 
 * 对c3p0连接池中 有一个类实现了此接口
 * ComboPooledDataSource 一定会重写 getConnection方法 
 * 我们只需要创建ComboPooledDataSource对象 调用 getConnection方法就可以获取到连接对象
 * 
 */
public class C3P0Utils {
	private static ComboPooledDataSource dataSource;
	static{
		try {
			dataSource= new ComboPooledDataSource();
//			dataSource.setDriverClass("com.mysql.jdbc.Driver");
//			dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/day21");
//			dataSource.setUser("root");
//			dataSource.setPassword("root");
		} catch (Exception e) {
			throw new RuntimeException("获取连接池对象失败"+e);
		}
		
		
	}
	public static DataSource getDataSource(){
		return dataSource;
	}
	
	
	
	
	public static Connection getConnection(){
		try {

			Connection con = dataSource.getConnection();
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
