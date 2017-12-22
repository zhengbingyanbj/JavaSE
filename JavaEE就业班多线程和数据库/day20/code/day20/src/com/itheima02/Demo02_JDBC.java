package com.itheima02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.itheima.utils.JDBCUtils;

/*
 * 防止sql注入攻击
 * 
 * java.sql.Connection 
 * 		PreparedStatement prepareStatement(String sql) 获取预编译sql语句的对象
 * 
 * PreparedStatement
 * 		setObject(int 第几个?号,Object 给?赋的值 )
 * 		executeQuery() 执行查询
 * 
 * 	
 */
public class Demo02_JDBC {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名:");
		String username = sc.nextLine();
		System.out.println("请输入密码:");
		String password = sc.nextLine();
		
		//使用工具类 获取到连接对象
		Connection con = JDBCUtils.getConnection();
		//使用?号占位符进行站位
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD =?";
		//获取对象
		PreparedStatement ps = con.prepareStatement(sql);
		//为?号赋值
		ps.setObject(1, username);
		ps.setObject(2, password);
		//执行sql语句
		ResultSet rs = ps.executeQuery();
		
		
		
//		//获取执行sql语句对象
//		Statement stat = con.createStatement();
//		//执行sql语句
//		String sql = "SELECT * FROM users WHERE username='"+username+"' AND PASSWORD ='"+password+"'";
//		System.out.println(sql);
//		ResultSet rs = stat.executeQuery(sql);
		if(rs.next()){
			System.out.println("登录成功！");
		}else{
			System.out.println("登录失败！");
		}
		
		
		JDBCUtils.close(con, ps, rs);
		
		
		
	}
}
