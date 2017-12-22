package com.itheima.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import com.itheima.utils.C3P0Utils;

public class Test01_10 {
	public static void main(String[] args) throws Exception{
		// ����Դ����
		DataSource ds = C3P0Utils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ��ѯ�û�����
		List<User> list = qr.query("select username,gender from user", 
				new ResultSetHandler<List<User>>() {
			@Override
			public List<User> handle(ResultSet rs) throws SQLException {
				// �������ϴ���û�����
				List<User> users = new ArrayList<User>();
				while(rs.next()){
					// ����û���
					String username = rs.getString("username");
					// ����Ա�
					String gender = rs.getString("gender");
					System.out.println(username + gender);
					// �����û�����
					User u = new User(0,username,gender,null);
					users.add(u);
				}
				return users;
			}
		});
	}
}
