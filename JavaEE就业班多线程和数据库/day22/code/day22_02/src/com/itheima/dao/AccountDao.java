package com.itheima.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.C3P0Utils;

public class AccountDao {

	/**
	 * ת����תǮ
	 * @param outer  ת����
	 * @param money  ת���Ľ��
	 * @throws SQLException 
	 */
	public void out(Connection con ,String outer ,double money) throws SQLException{
		//����QueryRuner����
		QueryRunner qr = new QueryRunner();
//		Connection con = C3P0Utils.getConnection();
		
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
	public void in(Connection con ,String inner,double money) throws SQLException{
		QueryRunner qr = new QueryRunner();
//		Connection con = C3P0Utils.getConnection();
		String sql = "update account set money = money +? where name = ?";
		Object[] params = {money,inner};
		qr.update(con, sql, params);
		
	}
}
