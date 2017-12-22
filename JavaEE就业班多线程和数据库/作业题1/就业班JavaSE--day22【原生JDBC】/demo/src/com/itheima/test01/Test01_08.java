package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01_08 {

	/*
	 * 1.确保数据库中有2条以上的记录，查询所有的学员信息，输出到控制台
	 */
	public static void main(String[] args) throws Exception {
		// 连接对象
		Connection conn = null;
		// SQL语句对象
		Statement state = null;
		// 查询结果集
		ResultSet resultSet = null;
		try {
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
			String sql = "select * from stu";
			// 执行sql语句
			resultSet = state.executeQuery(sql);
			while(resultSet.next()) {
				// 根据列号获得字段值
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String gender = resultSet.getString(3);
				System.out.println("学号："+id + " 姓名：" + name + "  性别：" + gender);
				System.out.println("-----------------------");
				// 根据列名获得字段值
				id = resultSet.getInt("id");
				name = resultSet.getString("name");
				name = resultSet.getString("gender");
				System.out.println("学号："+id + " 姓名：" + name + "  性别：" + gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// 释放资源
			try {
				if(resultSet != null)
					resultSet.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
