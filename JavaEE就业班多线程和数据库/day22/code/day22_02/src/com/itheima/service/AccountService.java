package com.itheima.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;

import com.itheima.dao.AccountDao;
import com.itheima.utils.C3P0Utils;

public class AccountService {
	/**
	 * 转账方法 
	 * @param outer 转出人
	 * @param inner 收钱人
	 * @param money 金额
	 */
	public void transfer(String outer,String inner,double money){
		//创建dao层
		AccountDao dao = new AccountDao();
		Connection con = C3P0Utils.getConnection();
		try {
			//开启事务
			con.setAutoCommit(false);
			
			
			dao.out(con,outer, money);
			System.out.println(1/0);
			dao.in(con,inner, money);
			
			con.commit();
			
			System.out.println("转账成功");
		} catch (Exception e) {
			
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("转账失败"+e);
		}finally {
			DbUtils.closeQuietly(con);
		}
	
	}
}
