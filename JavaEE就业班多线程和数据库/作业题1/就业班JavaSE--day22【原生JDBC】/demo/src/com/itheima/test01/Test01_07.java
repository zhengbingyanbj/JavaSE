package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01_07 {
	// 将id为2的用户，姓名更新为"猪八戒"
	public static void main(String[] args) {
		// 连接对象
		Connection conn = null;
		// SQL语句对象
		Statement state = null;
		try {
			String name = "猪八戒";
			int id = 2;
			// 数据库地址
			String url = "jdbc:mysql:///mydb";
			// 用户名
			String user = "root";
			// 密码
			String password = "123456";
			// 注册数据库驱动
			Class.forName("com.mysql.jdbc.Driver");
			// 连接数据库并获得连接对象
			conn = DriverManager.getConnection(url, user, password);
			// 获得SQL语句对象
			state = conn.createStatement();
			// 要执行的sql语句
			String sql = "update stu set name='"+name+"' where id="+id+";";
			// 执行sql语句
			int row = state.executeUpdate(sql);
			System.out.println(row);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				if(state != null)
					state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
