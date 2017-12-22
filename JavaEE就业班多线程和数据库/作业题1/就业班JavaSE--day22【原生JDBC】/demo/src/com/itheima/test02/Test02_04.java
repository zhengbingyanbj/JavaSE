package com.itheima.test02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itheima.test01.JdbcUtil;

public class Test02_04 {
	// 1.编写方法，查询学生表所有的学生，封装成List<Student>返回
	public static void main(String[] args)  {
		List<Student> students = getStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public static List<Student> getStudents() {
		String sql = "select id,name,gender from stu";
		//1.得到连接对象
		Connection conn = JdbcUtil.getConnection();
		//2. 创建PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<Student> students = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			//3. 因为没有参数，所以直接运行
			rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				//封装数据
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setGender(rs.getString("gender"));
				students.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return students;
	}
}
