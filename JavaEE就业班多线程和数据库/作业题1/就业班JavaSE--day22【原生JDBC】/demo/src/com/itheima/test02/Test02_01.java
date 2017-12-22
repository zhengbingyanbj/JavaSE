package com.itheima.test02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.itheima.test01.JdbcUtil;

public class Test02_01 {
	/*
	模拟用户登录：需求如下
		1.创建一张用户表(id,name,password)
		2.添加几条用户记录
		3.从键盘上输入用户和密码，拼接SQL语句
		4.使用Statement执行SQL语句。
		以上所有的操作要求使用JDBC相关API完成。
	 */
	public static void main(String[] args) throws Exception {
		// 创建用户表
		//createUserTable();
		// 插入用户数据
		// insertUserData();
		// 用户登录
		 login();
	}
	
	/*
	 * 用户登录
	 */
	private static void login() {
		//1.要求用户输入用户名和密码
		System.out.println("请输入用户名：");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		//调用登录的方法
		login(name, password);
	}

	
	/**
	 * 通过访问数据库来判断是否登录成功
	 * @param name
	 * @param password
	 */
	public static void login(String name, String password) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from user where name='" + name + "' and password='" + password + "'";
		System.out.println(sql);
		try {
			//1.得到连接
			conn = JdbcUtil.getConnection();
			//2. 创建语句对象
			stmt = conn.createStatement();
			//3. 查询数据库得到结果集
			rs = stmt.executeQuery(sql);
			//4. 查看是否有结果集
			if (rs.next()) {
				//通过列名读取
				System.out.println("欢迎您！" + rs.getString("name"));
			} else {
				System.out.println("用户名或密码不正确");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stmt, rs);
		}
	}
	
	/*
	 * 插入用户数据
	 */
	private static void insertUserData() {
		// 连接对象
		Connection conn = null;
		// SQL语句对象
		Statement state = null;
		try {
			// 获得连接对象
			conn = JdbcUtil.getConnection();
			// 创建SQL语句对象
			state = conn.createStatement();
			// 执行SQL语句
			int row = state.executeUpdate("insert into user(name,password) values"
					+ "('张三','123456'),"
					+ "('李四','123');");
			System.out.println("插入了" +row+"条记录");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 关闭资源
			JdbcUtil.close(conn, state);
		}
	}

	/*
	 * 创建用户表
	 */
	private static void createUserTable() {
		// 连接对象
		Connection conn = null;
		// SQL语句对象
		Statement state = null;
		try {
			// 获得连接对象
			conn = JdbcUtil.getConnection();
			// 创建SQL语句对象
			state = conn.createStatement();
			// 执行创表语句
			int row = state.executeUpdate("create table user(id int primary key auto_increment,"
					+ "name varchar(20) unique,"
					+ "password varchar(20))");
			System.out.println(row);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 关闭资源
			JdbcUtil.close(conn, state);
		}
	}
}
