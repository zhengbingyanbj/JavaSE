package com.itheima.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01_10 {

	/*
	 使用PreparedStatement对象完成数据库的增删改查
	1.添加一个学生到学生表
	2.删除id=1的学生信息
	3.修改id=2学生的姓名为”jack”
	4.查询所有的学生信息
	 */
	public static void main(String[] args) throws Exception{
		//addStudent();
		//deleteStudent();
		//updateStudent();
		findAllStudent();
	}
	
	// 1.添加一个学生到学生表
	public static void addStudent() throws Exception{
		// 获得连接对象
		Connection conn = JdbcUtil.getConnection();
		// 创建PreparedStatement对象
		PreparedStatement ps = conn.prepareStatement("insert into stu(name,gender) values('jack','男')");
		// 执行添加操作
		int row = ps.executeUpdate();
		System.out.println(row);
		// 关闭资源
		JdbcUtil.close(conn, ps);
	}
	
	// 2.删除id=1的学生信息
	public static void deleteStudent() throws Exception{
		// 获得连接对象
		Connection conn = JdbcUtil.getConnection();
		// 创建PreparedStatement对象
		PreparedStatement ps = conn.prepareStatement("delete from stu where id = ? ");
		// 设置参数
		ps.setInt(1, 1);
		// 执行添加操作
		int row = ps.executeUpdate();
		System.out.println(row);
		// 关闭资源
		JdbcUtil.close(conn, ps);
	}
	
	// 3.修改id=2学生的姓名为”jack”
	public static void updateStudent() throws Exception{
		// 获得连接对象
		Connection conn = JdbcUtil.getConnection();
		// 创建PreparedStatement对象
		PreparedStatement ps = conn.prepareStatement("update stu set name = ? where id = ?");
		// 设置参数
		ps.setString(1, "jack");
		ps.setInt(2, 2);
		// 执行添加操作
		int row = ps.executeUpdate();
		System.out.println(row);
		// 关闭资源
		JdbcUtil.close(conn, ps);
	}
	
	// 4.查询所有的学生信息
	public static void findAllStudent() throws Exception{
		// 获得连接对象
		Connection conn = JdbcUtil.getConnection();
		// 创建PreparedStatement对象
		PreparedStatement ps = conn.prepareStatement("select * from stu;");
		// 执行查询操作
		ResultSet rs = ps.executeQuery();
		// 循环获得每一条查询记录
		while(rs.next()) {
			// 获得学号
			int id = rs.getInt("id");
			// 获得姓名
			String name = rs.getString("name");
			// 获得性别
			String gender = rs.getString("gender");
			System.out.println("学号：" + id + ",姓名：" + name + ",性别：" + gender);
		}
		// 关闭资源
		JdbcUtil.close(conn, ps,rs);
	}
}
