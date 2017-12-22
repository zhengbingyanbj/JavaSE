package com.itheima;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * 1.注册驱动
 * 		告知jvm使用的是哪个数据库驱动
 * 2.获取连接
 * 		获取与数据库的连接对象
 * 		java.sql.Connection 接口
 * 		Mysql驱动实现了此接口
 * 3.获取执行sql语句对象
 * 		java.sql.Statement 接口
 * 		Mysql驱动实现了此接口
 * 4.执行sql语句 返回结果
 * 		结果集对象 
 * 		java.sql.ResultSet 接口
 * 		Mysql驱动实现了此接口
 * 5.处理结果集
 * 6.释放资源
 */
public class Demo01_JDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * 注册驱动 
		 * java.sql.DriverManager 
		 * 		static void registerDriver(Driver driver) 注册驱动 
		 * 		参数 
		 * 			java.sql.Driver:这是一个接口，方法的参数是接口 只能传其实现类对象
		 * 							MySql驱动实现了这个接口 com.mysql.jdbc.Driver
		 * 							可以直接传入此对象
		 * 
		 */
		//这样写 不好 注册了两次驱动
//		DriverManager.registerDriver(new Driver());
		//这样写也不好  硬编码
//		new Driver();
		//推荐写法
		Class.forName("com.mysql.jdbc.Driver");
		/*
		 * 获取连接
		 * java.sql.DriverManager 
		 * 		static Connection getConnection(String url, String user, String password) 获取连接
		 * 		返回值类型 
		 * 			java.sql.Connection:这是一个接口，方法的返回值类型是接口，这个方法一定会返回其实现类对象
		 * 							    MySql驱动实现了这个接口 
		 * 		参数  
		 * 			url: jdbc:mysql://ip:3306/数据库名
		 * 			user:用户名  root
		 * 			password: 密码  root
		 */
		String url="jdbc:mysql://127.0.0.1:3306/day20";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url, user, password);
//		System.out.println(con);
		
		/*
		 * 获取Statement对象
		 * java.sql.Connection
		 * 		 Statement createStatement() 
		 * 		 返回值类型:	
		 * 			java.sql.Statement：方法的返回值类型是接口，这个方法一定会返回这个接口的实现类对象
		 * 
		 */
		Statement stat = con.createStatement();
		/*
		 * java.sql.Statement
		 * 		 int executeUpdate(String sql) 执行sql语句 但是只能执行 增 删 改 返回的是影响的行数
		 * 
		 */
		String sql = "UPDATE category SET cname='蔬菜' WHERE cid = 3";
		int row = stat.executeUpdate(sql);
		System.out.println(row);
		//处理结果 
//		if(row>0){
//			System.out.println("修改成功");
//		}
		
		//释放资源
		stat.close();
		con.close();
		
		
	}
}













