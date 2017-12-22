package com.itheima02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.itheima.utils.JDBCUtils;

/*
 * ��ֹsqlע�빥��
 * 
 * java.sql.Connection 
 * 		PreparedStatement prepareStatement(String sql) ��ȡԤ����sql���Ķ���
 * 
 * PreparedStatement
 * 		setObject(int �ڼ���?��,Object ��?����ֵ )
 * 		executeQuery() ִ�в�ѯ
 * 
 * 	
 */
public class Demo02_JDBC {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������û���:");
		String username = sc.nextLine();
		System.out.println("����������:");
		String password = sc.nextLine();
		
		//ʹ�ù����� ��ȡ�����Ӷ���
		Connection con = JDBCUtils.getConnection();
		//ʹ��?��ռλ������վλ
		String sql = "SELECT * FROM users WHERE username=? AND PASSWORD =?";
		//��ȡ����
		PreparedStatement ps = con.prepareStatement(sql);
		//Ϊ?�Ÿ�ֵ
		ps.setObject(1, username);
		ps.setObject(2, password);
		//ִ��sql���
		ResultSet rs = ps.executeQuery();
		
		
		
//		//��ȡִ��sql������
//		Statement stat = con.createStatement();
//		//ִ��sql���
//		String sql = "SELECT * FROM users WHERE username='"+username+"' AND PASSWORD ='"+password+"'";
//		System.out.println(sql);
//		ResultSet rs = stat.executeQuery(sql);
		if(rs.next()){
			System.out.println("��¼�ɹ���");
		}else{
			System.out.println("��¼ʧ�ܣ�");
		}
		
		
		JDBCUtils.close(con, ps, rs);
		
		
		
	}
}
