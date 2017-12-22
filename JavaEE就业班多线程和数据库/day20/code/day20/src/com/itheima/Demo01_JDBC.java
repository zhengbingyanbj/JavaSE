package com.itheima;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * 1.ע������
 * 		��֪jvmʹ�õ����ĸ����ݿ�����
 * 2.��ȡ����
 * 		��ȡ�����ݿ�����Ӷ���
 * 		java.sql.Connection �ӿ�
 * 		Mysql����ʵ���˴˽ӿ�
 * 3.��ȡִ��sql������
 * 		java.sql.Statement �ӿ�
 * 		Mysql����ʵ���˴˽ӿ�
 * 4.ִ��sql��� ���ؽ��
 * 		��������� 
 * 		java.sql.ResultSet �ӿ�
 * 		Mysql����ʵ���˴˽ӿ�
 * 5.��������
 * 6.�ͷ���Դ
 */
public class Demo01_JDBC {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		/*
		 * ע������ 
		 * java.sql.DriverManager 
		 * 		static void registerDriver(Driver driver) ע������ 
		 * 		���� 
		 * 			java.sql.Driver:����һ���ӿڣ������Ĳ����ǽӿ� ֻ�ܴ���ʵ�������
		 * 							MySql����ʵ��������ӿ� com.mysql.jdbc.Driver
		 * 							����ֱ�Ӵ���˶���
		 * 
		 */
		//����д ���� ע������������
//		DriverManager.registerDriver(new Driver());
		//����дҲ����  Ӳ����
//		new Driver();
		//�Ƽ�д��
		Class.forName("com.mysql.jdbc.Driver");
		/*
		 * ��ȡ����
		 * java.sql.DriverManager 
		 * 		static Connection getConnection(String url, String user, String password) ��ȡ����
		 * 		����ֵ���� 
		 * 			java.sql.Connection:����һ���ӿڣ������ķ���ֵ�����ǽӿڣ��������һ���᷵����ʵ�������
		 * 							    MySql����ʵ��������ӿ� 
		 * 		����  
		 * 			url: jdbc:mysql://ip:3306/���ݿ���
		 * 			user:�û���  root
		 * 			password: ����  root
		 */
		String url="jdbc:mysql://127.0.0.1:3306/day20";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url, user, password);
//		System.out.println(con);
		
		/*
		 * ��ȡStatement����
		 * java.sql.Connection
		 * 		 Statement createStatement() 
		 * 		 ����ֵ����:	
		 * 			java.sql.Statement�������ķ���ֵ�����ǽӿڣ��������һ���᷵������ӿڵ�ʵ�������
		 * 
		 */
		Statement stat = con.createStatement();
		/*
		 * java.sql.Statement
		 * 		 int executeUpdate(String sql) ִ��sql��� ����ֻ��ִ�� �� ɾ �� ���ص���Ӱ�������
		 * 
		 */
		String sql = "UPDATE category SET cname='�߲�' WHERE cid = 3";
		int row = stat.executeUpdate(sql);
		System.out.println(row);
		//������ 
//		if(row>0){
//			System.out.println("�޸ĳɹ�");
//		}
		
		//�ͷ���Դ
		stat.close();
		con.close();
		
		
	}
}













