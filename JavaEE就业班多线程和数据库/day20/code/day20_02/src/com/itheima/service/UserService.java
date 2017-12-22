package com.itheima.service;

import java.sql.SQLException;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

public class UserService {

	/**
	 * ע�᷽�� 
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException 
	 */
	public boolean register(String username,String password) throws SQLException{
		//��֤�û��Ƿ����
		//����dao�����
		UserDao dao = new UserDao();
		User u = dao.findByName(username);
		//�������Ϊnull˵���û��Ѵ���
		if(u!=null){
			return false;
		}
		
		//�������Ϊnull ���û���������ӵ����ݿ�
		dao.addUser(username, password);
		return true;
	}
}
