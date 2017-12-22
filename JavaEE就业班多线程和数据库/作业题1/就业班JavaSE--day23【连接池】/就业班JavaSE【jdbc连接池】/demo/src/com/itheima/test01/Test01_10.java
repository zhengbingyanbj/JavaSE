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
		// 数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 查询用户数据
		List<User> list = qr.query("select username,gender from user", 
				new ResultSetHandler<List<User>>() {
			@Override
			public List<User> handle(ResultSet rs) throws SQLException {
				// 创建集合存放用户对象
				List<User> users = new ArrayList<User>();
				while(rs.next()){
					// 获得用户名
					String username = rs.getString("username");
					// 获得性别
					String gender = rs.getString("gender");
					System.out.println(username + gender);
					// 创建用户对象
					User u = new User(0,username,gender,null);
					users.add(u);
				}
				return users;
			}
		});
	}
}
