package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;

public class Test01_03 {
	/*
	 * ����MySQL���ݿ����������һ������������Ӷ��󣬽����Ӷ������������̨��
	 */
	public static void main(String[] args) throws Exception {
		// ���ݿ��ַ
		String url = "jdbc:mysql://localhost:3306/mydb";
		// �û���
		String user = "root";
		// ����
		String password = "123456";
		// ע�����ݿ�����
		Class.forName("com.mysql.jdbc.Driver");
		// �������ݿⲢ������Ӷ���
		Connection conn = DriverManager.getConnection(url, user, password);
		System.out.println(conn);
	}
}
