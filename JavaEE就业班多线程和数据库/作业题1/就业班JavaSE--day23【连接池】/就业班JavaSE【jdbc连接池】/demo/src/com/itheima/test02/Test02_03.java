package com.itheima.test02;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import com.itheima.test01.User;
import com.itheima.utils.C3P0Utils;

public class Test02_03 {
	public static void main(String[] args) throws SQLException {
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 查询所有用户
		User user = qr.query("select * from user", new BeanHandler<User>(User.class));
		System.out.println(user);
	}
}
