package com.itheima.test02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.itheima.test01.JdbcUtil;

public class Test02_02 {
	// 1.��д������ͨ��ID��ѯָ��ѧ�ŵ�ѧ����Ϣ������װ��Student���󷵻ء�
	public static void main(String[] args) {
		Student stu = findStudentById(3);
		System.out.println(stu);
	}
	
	// ����id��ѯѧ����Ϣ
	public static Student findStudentById(int id) {
		String sql = "select id,name,gender from stu where id = ? ";
		// �õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ����PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		// ����ѧ������
		Student s = new Student();
		try {
			ps = conn.prepareStatement(sql);
			// ���ò�����ִ��
			ps.setInt(1, id);
			rs = ps.executeQuery();
			// ָ������
			rs.next();
			// ��װ����
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