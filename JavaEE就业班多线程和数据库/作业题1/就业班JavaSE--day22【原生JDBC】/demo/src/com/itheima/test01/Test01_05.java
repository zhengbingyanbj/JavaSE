package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test01_05 {
	// 通过代码获得Statement对象并执行一条创表语句：创建一张学生表(id，姓名，性别) 
	public static void main(String[] args) throws Exception {
		// 连接数据库参数
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "123456";
		// 注册数据库驱动
		Class.forName("com.mysql.jdbc.Driver"); 
		// 获得数据库连接对象
		Connection conn = DriverManager.getConnection(url, user, password);
		// 获得statement对象
		Statement stmt = conn.createStatement();
		// 创表SQL语句
		String sql = "create table stu("
				+ " id int primary key auto_increment,"
				+ " name varchar(20),"
				+ " gender varchar(2));";
		// 执行创表SQL语句
		int row = stmt.executeUpdate(sql);
	      // ddl的操作不影响行数
	    System.out.println(row);
	   System.out.println("创建学生表成功");
	}
	
}
