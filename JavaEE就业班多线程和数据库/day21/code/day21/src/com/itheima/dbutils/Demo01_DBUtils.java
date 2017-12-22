package com.itheima.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.c3p0.utils.C3P0Utils;

/*
 * ʹ��DBUtils������ݿ���� ɾ ��
 * 
 * QueryRunner 
 * 		���췽�� 
 * 			QueryRunner() �ղι�����Ҫ�����Լ���ȡ���Ӷ��� ��ά������
 * 					      ���ʹ�ÿղι��촴������  ���÷���ʱ ��Ҫ�Լ���������
 * 			QueryRunner(DataSource dataSource) ���ι��� ���Ӷ���Ͳ���Ҫ����������
 * 											���ʹ�ô��ι��촴������ �����÷���ʱ ������Ҫ��������
 * 		���� 
 * 			update(Connection conn, String sql, Object... params)  ʹ�ÿղι��촴������ �����������  ������ɾ��
 * 			update(String sql, Object... params) ʹ�ô��ι��촴������ʱ ����������� ���� ��ɾ��
 * 
 * 			����  
 * 				Connection conn:���Ӷ��� ����ͨ��c3p0utils��ȡ
 * 				String sql �� sql��� ����ʹ��ռλ��
 * 			    Object...params:Ϊ?ռλ����ֵ
 * 
 */
public class Demo01_DBUtils {

	public static void main(String[] args) throws SQLException {
		method2();
	}
	//ʹ�ÿղι��췽��
	public static void method1() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner();
		//����update����
		Connection con = C3P0Utils.getConnection();
		
		String sql = "update category set cname=? where cid = ?";
		//ִ��sql���
		int row = qr.update(con, sql, "�߲�",3);
		System.out.println(row);
		//�ر���Դ
		DbUtils.closeQuietly(con);
//		con.close();
//		C3P0Utils.close(con, null, null);
	}
	public static void method2() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "update category set cname=? where cid = ?";
		Object[] objs = {"��ױƷ",3};
		qr.update(sql, objs);
	}
}











