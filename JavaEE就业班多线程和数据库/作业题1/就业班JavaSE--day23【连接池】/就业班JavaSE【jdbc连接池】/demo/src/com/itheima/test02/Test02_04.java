package com.itheima.test02;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.test01.User;
import com.itheima.utils.C3P0Utils;

public class Test02_04 {
	public static void main(String[] args)  throws SQLException {
		test01();
		test02();
	}
	
	 // 2.定义一个方法：查询用户表中用户记录的数量。
	public static void test02() throws SQLException{
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		 Long count = qr.query("select count(*) from user", new ScalarHandler<Long>());
		 System.out.println("一共有用户：" + count);
	}
	
	// 1.定义一个方法：查询用户表的所有用户记录并将每一条记录封装成JavaBean对象存放到集合中。
	public static void test01() throws SQLException{
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 查询所有用户
		List<User> users = qr.query("select * from user", new BeanListHandler<>(User.class));
		for (User user : users) {
			System.out.println(user);
		}
	}
}
