package com.itheima02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itheima.utils.JDBCUtils;

/*
 * PreparedStatement 完成增删改
 */
public class Demo03_JDBC {

	public static void main(String[] args) throws SQLException {
		//使用JDBC工具类 获取连接对象
		Connection con = JDBCUtils.getConnection();
		//获取预编译sql语句的对象
		String sql = "update category set cname=? where cid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		//为?赋值
		ps.setObject(1, "化妆品");
		ps.setObject(2, 3);
		
		//执行sql语句
		int row = ps.executeUpdate();
		System.out.println(row);
		
		JDBCUtils.close(con, ps, null);
	}
}
