package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {

	/**
	 * 注册方法 
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException 
	 */
	public boolean register(String username,String password) throws SQLException{
		//验证用户是否存在
		//创建dao层对象
		UserDao dao = new UserDao();
		User u = dao.findByName(username);
		//如果对象不为null说明用户已存在
		if(u!=null){
			return false;
		}
		
		//如果对象为null 将用户名密码添加到数据库
		dao.addUser(username, password);
		return true;
	}
}
