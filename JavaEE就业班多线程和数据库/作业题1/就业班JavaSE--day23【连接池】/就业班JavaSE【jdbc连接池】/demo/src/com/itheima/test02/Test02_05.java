package com.itheima.test02;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;

import com.itheima.utils.C3P0Utils;

public class Test02_05 {
	public static void main(String[] args) throws SQLException {
		test01();
		test02();
	}
	/* 2.����һ����������ѯ�û�����������û���������Ϣ������һ��Map����(Map���ϵ�
				key���û�id��value��ÿһ���û�����Ϣ��Ҳ��һ��Map���ϡ�)
				*/
	public static void test02() throws SQLException{
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		//��������¼��װ��Map<ĳ������,Map<�ֶ���,�ֶ�ֵ>>��KeyedHandler<ĳ�е�����>
		Map<Integer,Map<String,Object>> users = qr.query("select  * from user",
				new KeyedHandler<Integer>("id"));
		// ����map����
		for(Entry<Integer,Map<String,Object>> entry:users.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	// 1.����һ����������ѯ�û�����������û������ִ�ŵ������С�
	public static void test01() throws SQLException{
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ��ѯĳһ�У���װ��List<�ֶ�����>
		List<String> usernames = qr.query("select id,username,gender from user",
				new ColumnListHandler<String>("username"));
		for (String username : usernames) {
			System.out.println(username);
		}
	}
}
