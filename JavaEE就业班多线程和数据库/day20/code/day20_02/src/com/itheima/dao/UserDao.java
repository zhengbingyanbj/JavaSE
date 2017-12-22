package com.itheima.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.domain.User;
import com.itheima.utils.JDBCUtils;

public class UserDao {
	/**
	 * 根据用户名查询数据库
	 * 如果有用户则返回
	 * 如果没有则返回null
	 * @param username  用户名
	 * @return  user对象
	 * @throws SQLException 
	 */
	public  User findByName(String username) throws SQLException{
		//获取连接
		Connection con = JDBCUtils.getConnection();
		//获取执行sql对象
		String sql = "select * from users where username=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setObject(1, username);
		
		//执行sql
		ResultSet rs = ps.executeQuery();
		//处理结果集
		while(rs.next()){
			int uid = rs.getInt("uid");
			String username2 = rs.getString("username");
			String password = rs.getString("password");
			//将查询出来的数据封装到一个对象中
			User u = new User(uid, username2, password);
			
			JDBCUtils.close(con, ps, rs);
			
			
			return u;
		}
		
		JDBCUtils.close(con, ps, rs);
		
		return null;
		
	}
	/**
	 * 添加用户名密码到数据库
	 * @param username
	 * @param password
	 * @throws SQLException 
	 */
	public void addUser(String username,String password) throws SQLException{
		//获取连接
		Connection con = JDBCUtils.getConnection();
		String sql = "insert into users(username,password) values(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		//赋值
		ps.setObject(1, username);
		ps.setObject(2, password);
		
		//执行
		int row = ps.executeUpdate();
		
		JDBCUtils.close(con, ps, null);
		
	}
	
	
}
