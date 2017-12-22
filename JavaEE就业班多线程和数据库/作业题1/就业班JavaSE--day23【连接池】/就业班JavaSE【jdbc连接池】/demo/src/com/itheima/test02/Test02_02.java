package com.itheima.test02;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import com.itheima.utils.C3P0Utils;

public class Test02_02 {
	public static void main(String[] args) throws SQLException {
		// �������Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ��ѯ�����û�����
		List<Object[]> users = qr.query("select * from user", new ArrayListHandler());
		// ��������
		for (Object[] objArr : users) {
			System.out.println(Arrays.toString(objArr));
		}
	}
}