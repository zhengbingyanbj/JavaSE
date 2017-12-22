package com.itheima.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.C3P0Utils;

/*
 * ʹ�����ӳ� �� DBUtils���ת�˰���
 * QueryRunner 
 * 		���췽�� 
 * 			QueryRunner() ���÷���ʱ ��Ҫ�Լ���ȡ���� ��������
 * 			QueryRunner(DataSource ds) ��Ҫ�������ӳض��� ������Ҫ�������������� 
 * 									        ���÷���ʱ ����Ҫ������ 
 * 	��ʼ���� ��Ҫ ���Ӷ���  ��ֻ��ѡ�ÿղι��췽��
 * 
 * try{
 * 	��������
 *  �ύ����
 * }catch(){
 *   �ع�
 * 
 * }
 * 
 */
public class Demo01_DBUtils {

	public static void main(String[] args)  {
		Connection con = C3P0Utils.getConnection();
		try {
			//�������� 
			con.setAutoCommit(false);
			
			//����QueryRunner���� ʹ�ÿղι��� 
			QueryRunner qr = new QueryRunner();
		
			String sql = "update account set money = money - ? where name = ?";
			int i= qr.update(con,sql,5000,"liuyan");
			
			System.out.println(1/0);
			
			
			sql = "update account set money = money + ? where name = ?";
			int j= qr.update(con,sql,5000,"tangyan");
			
			if(i>0 && j>0){
				System.out.println("ת�˳ɹ�");
			}
			
			//�ύ����
//			con.commit();
			DbUtils.commitAndCloseQuietly(con);
		} catch (Exception e) {
			
//			try {
////				con.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			
			DbUtils.rollbackAndCloseQuietly(con);
			System.out.println("ת��ʧ��"+e);
		}
//		finally {
//			C3P0Utils.close(con, null, null);
//		}
		
		
		
		
	}
}




















