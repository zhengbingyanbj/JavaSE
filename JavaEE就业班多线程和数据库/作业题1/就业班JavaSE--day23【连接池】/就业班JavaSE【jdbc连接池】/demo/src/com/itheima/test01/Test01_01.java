package com.itheima.test01;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Test01_01 {
	
	public static void main(String[] args) throws Exception {
		// ������ӳض���
		ComboPooledDataSource ds = new ComboPooledDataSource();
		// �������ݿ����Ӳ���
		// �����û���
		ds.setUser("root");
		// ��������
		ds.setPassword("123456");
		// �������ݿ�����URL
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/day08");
		// �������ݿ�������
		ds.setDriverClass("com.mysql.jdbc.Driver");
		
		// �������ӳز���
		// ���ó�ʼ������
		ds.setInitialPoolSize(5);
		// �������������
		ds.setMaxPoolSize(10);
		// ����������ʱ��:����
		ds.setMaxIdleTime(2000);
		// �������ȴ�ʱ��
		ds.setCheckoutTimeout(1000);
		
		// ������Ӷ���
		for (int i = 0; i < 10; i++) {
			Connection conn = ds.getConnection();
			System.out.println("��" + (i + 1) + "��:" + conn);
		}
	}
}
