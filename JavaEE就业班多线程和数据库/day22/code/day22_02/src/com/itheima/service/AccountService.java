package com.itheima.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;

import com.itheima.dao.AccountDao;
import com.itheima.utils.C3P0Utils;

public class AccountService {
	/**
	 * ת�˷��� 
	 * @param outer ת����
	 * @param inner ��Ǯ��
	 * @param money ���
	 */
	public void transfer(String outer,String inner,double money){
		//����dao��
		AccountDao dao = new AccountDao();
		Connection con = C3P0Utils.getConnection();
		try {
			//��������
			con.setAutoCommit(false);
			
			
			dao.out(con,outer, money);
			System.out.println(1/0);
			dao.in(con,inner, money);
			
			con.commit();
			
			System.out.println("ת�˳ɹ�");
		} catch (Exception e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("ת��ʧ��"+e);
		}finally {
			DbUtils.closeQuietly(con);
		}
	
	}
}
