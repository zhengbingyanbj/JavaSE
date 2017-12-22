package com.itheima.test02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.test01.JdbcUtil;

public class Test02_03 {
	// 1.编写方法，通过ID删除指定学号的学生，并且返回删除的行数。
	public static void main(String[] args) {
		System.out.println(deleteStuById(3));
	}
	
	public static int deleteStuById(int id) {
		String sql = "delete from stu where id = ? ";
		// 得到连接对象
		Connection conn = JdbcUtil.getConnection();
		// 创建PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		int row = 0;
		try {
			ps = conn.prepareStatement(sql);
			// 设置参数并执行
			ps.setInt(1, id);
			// 执行删除操作
			row = ps.executeUpdate();
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return row;
	}
}
