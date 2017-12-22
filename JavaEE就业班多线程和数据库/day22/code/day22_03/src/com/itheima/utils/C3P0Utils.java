package com.itheima.utils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mysql.fabric.xmlrpc.base.Data;

/*
 * ��ȡ���Ӷ���
 * javax.sql.DataSource  �ӿ� 
 * 		Connection getConnection()  ����
 * 
 * ��c3p0���ӳ��� ��һ����ʵ���˴˽ӿ�
 * ComboPooledDataSource һ������д getConnection���� 
 * ����ֻ��Ҫ����ComboPooledDataSource���� ���� getConnection�����Ϳ��Ի�ȡ�����Ӷ���
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
			throw new RuntimeException("��ȡ���ӳض���ʧ��"+e);
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
			throw new RuntimeException("��ȡ����ʧ��"+e);
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
