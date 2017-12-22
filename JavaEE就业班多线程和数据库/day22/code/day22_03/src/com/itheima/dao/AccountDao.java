package com.itheima.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.C3P0Utils;
import com.itheima.utils.ConnectionManager;

public class AccountDao {

	/**
	 * ת����תǮ
	 * @param outer  ת����
	 * @param money  ת���Ľ��
	 * @throws SQLException 
	 */
	public void out(String outer ,double money) throws SQLException{
		//����QueryRuner����
		QueryRunner qr = new QueryRunner();
//		Connection con = C3P0Utils.getConnection();
		Connection con = ConnectionManager.getConnection();
		String sql = "update account set money = money -? where name = ?";
		Object[] params = {money,outer};
		qr.update(con, sql, params);
		
	}
	/**
	 * ��Ǯ����Ǯ
	 * @param inner  ��Ǯ��
	 * @param money  ����Ľ��
	 * @throws SQLException 
	 */
	public void in(String inner,double money) throws SQLException{
		QueryRunner qr = new QueryRunner();
//		Connection con = C3P0Utils.getConnection();
		
		Connection con = ConnectionManager.getConnection();
		String sql = "update account set money = money +? where name = ?";
		Object[] params = {money,inner};
		qr.update(con, sql, params);
		
	}
}
