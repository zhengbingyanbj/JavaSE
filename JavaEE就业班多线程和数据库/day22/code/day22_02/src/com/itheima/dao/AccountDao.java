package com.itheima.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.C3P0Utils;

public class AccountDao {

	/**
	 * 转出人转钱
	 * @param outer  转出人
	 * @param money  转出的金额
	 * @throws SQLException 
	 */
	public void out(Connection con ,String outer ,double money) throws SQLException{
		//创建QueryRuner对象
		QueryRunner qr = new QueryRunner();
//		Connection con = C3P0Utils.getConnection();
		
		String sql = "update account set money = money -? where name = ?";
		Object[] params = {money,outer};
		qr.update(con, sql, params);
		
	}
	/**
	 * 收钱人收钱
	 * @param inner  收钱人
	 * @param money  收入的金额
	 * @throws SQLException 
	 */
	public void in(Connection con ,String inner,double money) throws SQLException{
		QueryRunner qr = new QueryRunner();
//		Connection con = C3P0Utils.getConnection();
		String sql = "update account set money = money +? where name = ?";
		Object[] params = {money,inner};
		qr.update(con, sql, params);
		
	}
}
