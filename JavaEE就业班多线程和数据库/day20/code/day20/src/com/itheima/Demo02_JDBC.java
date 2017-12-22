package com.itheima;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.utils.JDBCUtils;

/*
 * 使用JDBC完成数据库的查询
 */
public class Demo02_JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接
		String url="jdbc:mysql://127.0.0.1:3306/day20";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url,user,password);
		//获取执行sql语句的对象
		Statement stat = con.createStatement();
		/*
		 * java.sql.Statement
		 * 		 ResultSet executeQuery(String sql) 执行sql语句 只能执行查询
		 * 		 返回值类型 
		 * 			java.sql.ResultSet:接口  方法的返回值类型是接口 ，一定会返回此接口的实现类对象
		 * 							   结果集 
		 * 
		 */
		String sql = "select * from category";
		ResultSet rs = stat.executeQuery(sql);
		/*
		 * java.sql.ResultSet
		 * 		
		 * 		boolean next()  判断当前行是否有数据 如果有则返回true 没有 返回false
		 * 		
		 * 		xxx getXxx(int 第几列)
		 * 		xxx getXxx(String 列名) 推荐
		 * 		
		 * 
		 */
		while(rs.next()){
			//获取数据
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			System.out.println(cid + " " + cname);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		
		
	}
}
