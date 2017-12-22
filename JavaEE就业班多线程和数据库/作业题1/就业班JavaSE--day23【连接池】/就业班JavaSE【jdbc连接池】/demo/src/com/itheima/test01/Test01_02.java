package com.itheima.test01;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Test01_02 {
	public static void main(String[] args) throws Exception {
		// test01();
		test02();
	}
	
	// ʹ��Ĭ������(default-config)
	public static void test01() throws Exception{
		// ������ӳض���
		ComboPooledDataSource ds = new ComboPooledDataSource();
		// ������Ӷ���
		for (int i = 0; i < 10; i++) {
			Connection conn = ds.getConnection();
			System.out.println("��" + (i + 1) + "��:" + conn);
			if(i == 3){
				// �����Ӷ���Ż����ӳ�
				conn.close();
			}
		}	
	}
	
	// ʹ����������(named-config)
	public static void test02() throws Exception{
		// ������ӳض���
		ComboPooledDataSource ds = new ComboPooledDataSource("pkxing-config");
		// ������Ӷ���
		for (int i = 0; i < 10; i++) {
			Connection conn = ds.getConnection();
			System.out.println("��" + (i + 1) + "��:" + conn);
		}
	}
}
