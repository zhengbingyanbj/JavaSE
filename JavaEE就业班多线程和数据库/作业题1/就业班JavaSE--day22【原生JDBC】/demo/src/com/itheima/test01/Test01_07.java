package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01_07 {
	// ��idΪ2���û�����������Ϊ"��˽�"
	public static void main(String[] args) {
		// ���Ӷ���
		Connection conn = null;
		// SQL������
		Statement state = null;
		try {
			String name = "��˽�";
			int id = 2;
			// ���ݿ��ַ
			String url = "jdbc:mysql:///mydb";
			// �û���
			String user = "root";
			// ����
			String password = "123456";
			// ע�����ݿ�����
			Class.forName("com.mysql.jdbc.Driver");
			// �������ݿⲢ������Ӷ���
			conn = DriverManager.getConnection(url, user, password);
			// ���SQL������
			state = conn.createStatement();
			// Ҫִ�е�sql���
			String sql = "update stu set name='"+name+"' where id="+id+";";
			// ִ��sql���
			int row = state.executeUpdate(sql);
			System.out.println(row);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			try {
				if(state != null)
					state.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
