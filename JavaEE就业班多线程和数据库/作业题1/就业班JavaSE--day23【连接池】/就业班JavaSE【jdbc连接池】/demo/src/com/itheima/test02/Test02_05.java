package com.itheima.test02;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.KeyedHandler;

import com.itheima.utils.C3P0Utils;

public class Test02_05 {
	public static void main(String[] args) throws SQLException {
		test01();
		test02();
	}
	/* 2.定义一个方法，查询用户表，获得所有用户的所有信息，返回一个Map集合(Map集合的
				key是用户id，value是每一个用户的信息，也是一个Map集合。)
				*/
	public static void test02() throws SQLException{
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		//将多条记录封装成Map<某列类型,Map<字段名,字段值>>，KeyedHandler<某列的类型>
		Map<Integer,Map<String,Object>> users = qr.query("select  * from user",
				new KeyedHandler<Integer>("id"));
		// 遍历map集合
		for(Entry<Integer,Map<String,Object>> entry:users.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}
	// 1.定义一个方法，查询用户表，获得所有用户的名字存放到集合中。
	public static void test01() throws SQLException{
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 查询某一列，封装成List<字段类型>
		List<String> usernames = qr.query("select id,username,gender from user",
				new ColumnListHandler<String>("username"));
		for (String username : usernames) {
			System.out.println(username);
		}
	}
}
