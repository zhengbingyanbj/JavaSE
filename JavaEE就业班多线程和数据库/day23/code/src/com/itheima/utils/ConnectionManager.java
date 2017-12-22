package com.itheima.utils;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionManager {
	
	private static ThreadLocal<Connection> t = new ThreadLocal<Connection>();//con1

	/*
	 * ��֤һ���û�ÿ�λ�ȡ�����Ӷ���ͬһ��
	 * ��֤��ͬ�û����ܻ�ȡ��ͬ������
	 */
	public static Connection getConnection(){
		Connection con = t.get();
		if(con == null){
			//�����ӳ��л�ȡһ������
			Connection con1 = C3P0Utils.getConnection();
			//�����ӷ��뵽����
			t.set(con1);
			
			//�����ӷ���
			return con1;
		}
		
		return con;
		
	}
	
	//��������
	public static void begin(){
		try {
			getConnection().setAutoCommit(false);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//�ύ����
	public static void commit(){
		try {
			getConnection().commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void rollBack(){
		try {
			getConnection().rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void close(){
		try {
			
			
			getConnection().close();
			//���������������
			t.remove();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
