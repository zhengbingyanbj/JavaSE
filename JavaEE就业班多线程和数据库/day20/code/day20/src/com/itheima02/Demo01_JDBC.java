package com.itheima02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.itheima.utils.JDBCUtils;

/*
 * 演示 sql注入攻击
 */
public class Demo01_JDBC {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码:");
		String password = sc.nextLine();
		
		//使用工具类 获取到连接对象
		Connection con = JDBCUtils.getConnection();
		//获取执行sql语句对象
		Statement stat = con.createStatement();
		//执行sql语句
		String sql = "SELECT * FROM users WHERE username='"+username+"' AND PASSWORD ='"+password+"'";
		System.out.println(sql);
		ResultSet rs = stat.executeQuery(sql);
		if(rs.next()){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败！");
		}
		
		
		JDBCUtils.close(con, stat, rs);
		
		
		
	}
}
