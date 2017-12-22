package com.itheima.test01;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class Test01_04 {
	public static void main(String[] args) throws SQLException {
		// �������ӳض���
		BasicDataSource ds = new BasicDataSource();
		// �������ݿ����Ӳ���
		ds.setUsername("root");
		ds.setPassword("123456");
		ds.setUrl("jdbc:mysql:///day08");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		
		// �������Ӳ���
		ds.setInitialSize(5);
		ds.setMaxActive(10);
		// ������ʱ��
		ds.setMaxWait(2000);
		ds.setMaxIdle(5);
		
		// ������Ӷ���
		for (int i = 0; i < 10 ; i++) {
			Connection conn = ds.getConnection();
			System.out.println("��" + (i + 1) + "��:" + conn.hashCode());
		}
	}
}
