package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test01_05 {
	// ͨ��������Statement����ִ��һ��������䣺����һ��ѧ����(id���������Ա�) 
	public static void main(String[] args) throws Exception {
		// �������ݿ����
		String url = "jdbc:mysql://localhost:3306/mydb";
		String user = "root";
		String password = "123456";
		// ע�����ݿ�����
		Class.forName("com.mysql.jdbc.Driver"); 
		// ������ݿ����Ӷ���
		Connection conn = DriverManager.getConnection(url, user, password);
		// ���statement����
		Statement stmt = conn.createStatement();
		// ����SQL���
		String sql = "create table stu("
				+ " id int primary key auto_increment,"
				+ " name varchar(20),"
				+ " gender varchar(2));";
		// ִ�д���SQL���
		int row = stmt.executeUpdate(sql);
	      // ddl�Ĳ�����Ӱ������
	    System.out.println(row);
	   System.out.println("����ѧ����ɹ�");
	}
	
}
