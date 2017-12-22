package com.itheima.service;

import com.itheima.dao.AccountDao;
import com.itheima.utils.ConnectionManager;

public class AccountService {
	/**
	 * ת�˷��� 
	 * @param outer ת����
	 * @param inner ��Ǯ��
	 * @param money ���
	 */
	public void transfer(String outer,String inner,double money){
		
		AccountDao dao = new AccountDao();
		try {
			ConnectionManager.begin();
			
			dao.out( outer, money);
			
			System.out.println(1/0);
			dao.in(inner, money);
			
			ConnectionManager.commit();
			System.out.println("ת�˳ɹ�");
		} catch (Exception e) {
			ConnectionManager.rollBack();
			System.out.println("ת��ʧ��"+e);
		}finally {
			ConnectionManager.close();
		}
		
	}
}
