package com.itheima.test02;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import com.itheima.test01.JdbcUtil;

public class Test02_01 {
	/*
	ģ���û���¼����������
		1.����һ���û���(id,name,password)
		2.��Ӽ����û���¼
		3.�Ӽ����������û������룬ƴ��SQL���
		4.ʹ��Statementִ��SQL��䡣
		�������еĲ���Ҫ��ʹ��JDBC���API��ɡ�
	 */
	public static void main(String[] args) throws Exception {
		// �����û���
		//createUserTable();
		// �����û�����
		// insertUserData();
		// �û���¼
		 login();
	}
	
	/*
	 * �û���¼
	 */
	private static void login() {
		//1.Ҫ���û������û���������
		System.out.println("�������û�����");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		//���õ�¼�ķ���
		login(name, password);
	}

	
	/**
	 * ͨ���������ݿ����ж��Ƿ��¼�ɹ�
	 * @param name
	 * @param password
	 */
	public static void login(String name, String password) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from user where name='" + name + "' and password='" + password + "'";
		System.out.println(sql);
		try {
			//1.�õ�����
			conn = JdbcUtil.getConnection();
			//2. ����������
			stmt = conn.createStatement();
			//3. ��ѯ���ݿ�õ������
			rs = stmt.executeQuery(sql);
			//4. �鿴�Ƿ��н����
			if (rs.next()) {
				//ͨ��������ȡ
				System.out.println("��ӭ����" + rs.getString("name"));
			} else {
				System.out.println("�û��������벻��ȷ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, stmt, rs);
		}
	}
	
	/*
	 * �����û�����
	 */
	private static void insertUserData() {
		// ���Ӷ���
		Connection conn = null;
		// SQL������
		Statement state = null;
		try {
			// ������Ӷ���
			conn = JdbcUtil.getConnection();
			// ����SQL������
			state = conn.createStatement();
			// ִ��SQL���
			int row = state.executeUpdate("insert into user(name,password) values"
					+ "('����','123456'),"
					+ "('����','123');");
			System.out.println("������" +row+"����¼");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ر���Դ
			JdbcUtil.close(conn, state);
		}
	}

	/*
	 * �����û���
	 */
	private static void createUserTable() {
		// ���Ӷ���
		Connection conn = null;
		// SQL������
		Statement state = null;
		try {
			// ������Ӷ���
			conn = JdbcUtil.getConnection();
			// ����SQL������
			state = conn.createStatement();
			// ִ�д������
			int row = state.executeUpdate("create table user(id int primary key auto_increment,"
					+ "name varchar(20) unique,"
					+ "password varchar(20))");
			System.out.println(row);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// �ر���Դ
			JdbcUtil.close(conn, state);
		}
	}
}
