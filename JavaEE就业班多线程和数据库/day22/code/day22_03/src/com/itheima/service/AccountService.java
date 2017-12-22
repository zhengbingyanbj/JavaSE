package com.itheima.service;

import com.itheima.dao.AccountDao;
import com.itheima.utils.ConnectionManager;

public class AccountService {
	/**
	 * 转账方法 
	 * @param outer 转出人
	 * @param inner 收钱人
	 * @param money 金额
	 */
	public void transfer(String outer,String inner,double money){
		
		AccountDao dao = new AccountDao();
		try {
			ConnectionManager.begin();
			
			dao.out( outer, money);
			
			System.out.println(1/0);
			dao.in(inner, money);
			
			ConnectionManager.commit();
			System.out.println("转账成功");
		} catch (Exception e) {
			ConnectionManager.rollBack();
			System.out.println("转账失败"+e);
		}finally {
			ConnectionManager.close();
		}
		
	}
}
