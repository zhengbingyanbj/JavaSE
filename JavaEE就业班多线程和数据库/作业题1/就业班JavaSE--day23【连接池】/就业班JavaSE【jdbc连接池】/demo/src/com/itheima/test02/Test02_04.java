package com.itheima.test02;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.test01.User;
import com.itheima.utils.C3P0Utils;

public class Test02_04 {
	public static void main(String[] args)  throws SQLException {
		test01();
		test02();
	}
	
	 // 2.����һ����������ѯ�û������û���¼��������
	public static void test02() throws SQLException{
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		 Long count = qr.query("select count(*) from user", new ScalarHandler<Long>());
		 System.out.println("һ�����û���" + count);
	}
	
	// 1.����һ����������ѯ�û���������û���¼����ÿһ����¼��װ��JavaBean�����ŵ������С�
	public static void test01() throws SQLException{
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ��ѯ�����û�
		List<User> users = qr.query("select * from user", new BeanListHandler<>(User.class));
		for (User user : users) {
			System.out.println(user);
		}
	}
}
