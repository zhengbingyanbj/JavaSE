package com.itheima.test02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.itheima.test01.JdbcUtil;

public class Test02_04 {
	// 1.��д��������ѯѧ�������е�ѧ������װ��List<Student>����
	public static void main(String[] args)  {
		List<Student> students = getStudents();
		for (Student student : students) {
			System.out.println(student);
		}
	}
	
	public static List<Student> getStudents() {
		String sql = "select id,name,gender from stu";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		//2. ����PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<Student> students = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			//3. ��Ϊû�в���������ֱ������
			rs = ps.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				//��װ����
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
