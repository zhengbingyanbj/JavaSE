package com.itheima.test02;

import java.util.Arrays;
import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import com.itheima.utils.C3P0Utils;

public class Test02_01 {
	
	public static void main(String[] args) throws Exception {
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ��ѯ�����û�����
		Object[] users = qr.query("select * from user", new ArrayHandler());
		System.out.println(Arrays.toString(users));
	}
}
