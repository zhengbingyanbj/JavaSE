package com.itheima;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.utils.JDBCUtils;

/*
 * ʹ��JDBC������ݿ�Ĳ�ѯ
 */
public class Demo02_JDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//ע������
		Class.forName("com.mysql.jdbc.Driver");
		//��ȡ����
		String url="jdbc:mysql://127.0.0.1:3306/day20";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url,user,password);
		//��ȡִ��sql���Ķ���
		Statement stat = con.createStatement();
		/*
		 * java.sql.Statement
		 * 		 ResultSet executeQuery(String sql) ִ��sql��� ֻ��ִ�в�ѯ
		 * 		 ����ֵ���� 
		 * 			java.sql.ResultSet:�ӿ�  �����ķ���ֵ�����ǽӿ� ��һ���᷵�ش˽ӿڵ�ʵ�������
		 * 							   ����� 
		 * 
		 */
		String sql = "select * from category";
		ResultSet rs = stat.executeQuery(sql);
		/*
		 * java.sql.ResultSet
		 * 		
		 * 		boolean next()  �жϵ�ǰ���Ƿ������� ������򷵻�true û�� ����false
		 * 		
		 * 		xxx getXxx(int �ڼ���)
		 * 		xxx getXxx(String ����) �Ƽ�
		 * 		
		 * 
		 */
		while(rs.next()){
			//��ȡ����
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			System.out.println(cid + " " + cname);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		
		
	}
}
