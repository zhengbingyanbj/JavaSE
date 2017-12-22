package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.utils.JDBCUtils;

/*
 * ʹ��ԭ��̬JDBC���ת�˰���
 * 
 * ����ָ�����߼��ϵ�һ�����,�����������ĸ�����ԪҪôȫ���ɹ�,Ҫôȫ��ʧ��.
 * �������ã���֤��һ�������ж�β���Ҫôȫ���ɹ�,Ҫôȫ��ʧ��.
 * һ�����:������ͬһ�������µĶ�β���
 * 
 * ���� 
 * 	   ��������: ��������� ��������в����������ҵ�ǰ������
 * 	   �ύ����: �������ύ �������ñ������ݿ�
 *   �ع�:�����ݻָ�����������֮ǰ��״̬
 *   
 * �������� 
 * 		java.sql.Connection �ӿ�
 * 			setAutoCommit(boolean b)
 * 			����  
 * 				boolean b:mysql�����Ĭ���Զ��������� ֻ�����Զ�������Ե���һ��sql���
 * 						  ����������Ҫ����sql��������  ��Ҫ �ر�mysql�Զ����� �����ֶ�����
 * 						 bΪtrue �Զ�����    bΪfalse �ر��Զ����� �����ֶ�����
 * �ύ����  
 * 		   void commit() �ύ���� 
 * 
 * �ع� 
 * 		   void rollback() �ع�
 * 
 * 
 */
public class Demo01_JDBC {

	public static void main(String[] args) {
		//��ȡ���Ӷ���
		Connection con = JDBCUtils.getConnection();
		Statement stat = null;
		try {
			//��������
			con.setAutoCommit(false);
			
			//��ȡִ��sql���Ķ���
			stat = con.createStatement();
			//ִ��sql���
			String sql = "update account set money = money -5000 where name='liuyan'";
			int i = stat.executeUpdate(sql);
			
			System.out.println(1/0);
			
			sql = "update account set money = money +5000 where name='tangyan'";
			int j = stat.executeUpdate(sql);
			//������
			if(i>0 && j>0){
				System.out.println("ת�˳ɹ�");
			}
			
			//�ύ����
			con.commit();
		
		} catch (Exception e) {
			
			try {
				//��������쳣�ع�
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("ת��ʧ��"+e);
		}finally {
			JDBCUtils.close(con, stat, null);
		}
		
	}
}
