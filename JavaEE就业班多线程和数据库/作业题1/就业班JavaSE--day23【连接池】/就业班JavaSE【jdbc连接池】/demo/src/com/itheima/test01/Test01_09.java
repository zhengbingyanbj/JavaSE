package com.itheima.test01;

import java.sql.SQLException;

import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.DBCPUtils;
public class Test01_09 {
	public static void main(String[] args) throws SQLException {
		// �õ�����Դ����
		DataSource ds = DBCPUtils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ִ��ɾ������
		int row = qr.update("delete from user where id = ?",3);
		System.out.println(row);
	}
}
