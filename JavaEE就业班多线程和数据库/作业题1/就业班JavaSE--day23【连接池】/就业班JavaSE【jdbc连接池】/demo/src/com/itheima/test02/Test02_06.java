package com.itheima.test02;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.itheima.utils.C3P0Utils;

public class Test02_06 {
	public static void main(String[] args)throws SQLException{
		test01();
		test02();
	}
//	1.����һ����������ѯ�û����ȡ��һ���û���¼����װ��Map����(key���ֶ����ƣ�value���ֶ�ֵ)��
	public static void test01() throws SQLException{
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		Map<String,Object> map = qr.query("select * from user", new MapHandler());
		System.out.println(map);
	}
//	2.����һ����������ѯ�û����ȡ�����û���¼������һ�����ϣ������д�ŵĶ���Map����һ��Map�����װ��Ӧһ���û���¼��
	public static void test02() throws SQLException{
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		List<Map<String,Object>> list = qr.query("select * from user", new MapListHandler());
		// ��������
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}
}
