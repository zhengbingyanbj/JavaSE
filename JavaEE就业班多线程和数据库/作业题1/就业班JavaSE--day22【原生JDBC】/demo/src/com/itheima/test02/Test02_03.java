package com.itheima.test02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.test01.JdbcUtil;

public class Test02_03 {
	// 1.��д������ͨ��IDɾ��ָ��ѧ�ŵ�ѧ�������ҷ���ɾ����������
	public static void main(String[] args) {
		System.out.println(deleteStuById(3));
	}
	
	public static int deleteStuById(int id) {
		String sql = "delete from stu where id = ? ";
		// �õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ����PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		int row = 0;
		try {
			ps = conn.prepareStatement(sql);
			// ���ò�����ִ��
			ps.setInt(1, id);
			// ִ��ɾ������
			row = ps.executeUpdate();
			System.out.println("ɾ���ɹ�");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return row;
	}
}
