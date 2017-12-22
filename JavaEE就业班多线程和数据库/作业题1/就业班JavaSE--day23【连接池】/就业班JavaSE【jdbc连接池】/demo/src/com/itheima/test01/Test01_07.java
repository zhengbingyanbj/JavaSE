package com.itheima.test01;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import com.itheima.utils.C3P0Utils;

public class Test01_07 {
	public static void main(String[] args) throws Exception {
		createTable();
		insert();
	}
	
	/*
	 * �����û���
	 */
	public static void createTable() throws Exception{
		// �����û���Sql
		String sql01 = "create table user(id int primary key auto_increment,"
				+ "username varchar(20) unique not null,"
				+ "gender varchar(2),"
				+ "address varchar(30));";
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ�д���SQL���
		qr.update(sql01);
	}
	/*
	 * ���û�����Ӷ����û���¼��
	 */
	public static void insert() throws SQLException{
		// �õ�����Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// Ҫִ�е�SQL���
		String sql = "insert into user(username,gender,address) values('jack','��','����'),('rose','Ů','����'),('lily','Ů','���')";
		// ִ�в������
		int row = qr.update(sql);
		
		System.out.println(row);
	}
}
