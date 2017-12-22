package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test01_08 {

	/*
	 * 1.ȷ�����ݿ�����2�����ϵļ�¼����ѯ���е�ѧԱ��Ϣ�����������̨
	 */
	public static void main(String[] args) throws Exception {
		// ���Ӷ���
		Connection conn = null;
		// SQL������
		Statement state = null;
		// ��ѯ�����
		ResultSet resultSet = null;
		try {
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
			String sql = "select * from stu";
			// ִ��sql���
			resultSet = state.executeQuery(sql);
			while(resultSet.next()) {
				// �����кŻ���ֶ�ֵ
				int id = resultSet.getInt(1);
				String name = resultSet.getString(2);
				String gender = resultSet.getString(3);
				System.out.println("ѧ�ţ�"+id + " ������" + name + "  �Ա�" + gender);
				System.out.println("-----------------------");
				// ������������ֶ�ֵ
				id = resultSet.getInt("id");
				name = resultSet.getString("name");
				name = resultSet.getString("gender");
				System.out.println("ѧ�ţ�"+id + " ������" + name + "  �Ա�" + gender);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			// �ͷ���Դ
			try {
				if(resultSet != null)
					resultSet.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
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
