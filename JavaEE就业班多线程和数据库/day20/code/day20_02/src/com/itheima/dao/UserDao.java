package com.itheima.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;

public class UserDao {
	/**
	 * �����û�����ѯ���ݿ�
	 * ������û��򷵻�
	 * ���û���򷵻�null
	 * @param username  �û���
	 * @return  user����
	 * @throws SQLException 
	 */
	public  User findByName(String username) throws SQLException{
		//��ȡ����
		Connection con = JDBCUtils.getConnection();
		//��ȡִ��sql����
		String sql = "select * from users where username=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setObject(1, username);
		
		//ִ��sql
		ResultSet rs = ps.executeQuery();
		//��������
		while(rs.next()){
			int uid = rs.getInt("uid");
			String username2 = rs.getString("username");
			String password = rs.getString("password");
			//����ѯ���������ݷ�װ��һ��������
			User u = new User(uid, username2, password);
			
			JDBCUtils.close(con, ps, rs);
			
			
			return u;
		}
		
		JDBCUtils.close(con, ps, rs);
		
		return null;
		
	}
	/**
	 * ����û������뵽���ݿ�
	 * @param username
	 * @param password
	 * @throws SQLException 
	 */
	public void addUser(String username,String password) throws SQLException{
		//��ȡ����
		Connection con = JDBCUtils.getConnection();
		String sql = "insert into users(username,password) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//��ֵ
		ps.setObject(1, username);
		ps.setObject(2, password);
		
		//ִ��
		int row = ps.executeUpdate();
		
		JDBCUtils.close(con, ps, null);
		
	}
	
	
}
