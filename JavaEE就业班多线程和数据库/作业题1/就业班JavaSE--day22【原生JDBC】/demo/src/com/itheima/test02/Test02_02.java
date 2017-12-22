package com.itheima.test02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.itheima.test01.JdbcUtil;

public class Test02_02 {
	// 1.编写方法，通过ID查询指定学号的学生信息，并封装成Student对象返回。
	public static void main(String[] args) {
		Student stu = findStudentById(3);
		System.out.println(stu);
	}
	
	// 根据id查询学生信息
	public static Student findStudentById(int id) {
		String sql = "select id,name,gender from stu where id = ? ";
		// 得到连接对象
		Connection conn = JdbcUtil.getConnection();
		// 创建PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		// 创建学生对象
		Student s = new Student();
		try {
			ps = conn.prepareStatement(sql);
			// 设置参数并执行
			ps.setInt(1, id);
			rs = ps.executeQuery();
			// 指针下移
			rs.next();
			// 封装数据
			s.setId(rs.getInt("id"));
			s.setName(rs.getString("name"));
			s.setGender(rs.getString("gender"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return s;
	}
}