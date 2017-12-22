package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test01_03 {
	/*
	 * 加载MySQL数据库驱动并获得一个数据类库连接对象，将连接对象输出到控制台。
	 */
	public static void main(String[] args) throws Exception {
		// 数据库地址
		String url = "jdbc:mysql://localhost:3306/mydb";
		// 用户名
		String user = "root";
		// 密码
		String password = "123456";
		// 注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 连接数据库并获得连接对象
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
}
