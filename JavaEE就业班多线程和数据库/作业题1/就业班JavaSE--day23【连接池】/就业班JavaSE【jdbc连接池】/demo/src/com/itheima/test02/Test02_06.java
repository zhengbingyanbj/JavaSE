package com.itheima.test02;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import com.itheima.utils.C3P0Utils;

public class Test02_06 {
	public static void main(String[] args)throws SQLException{
		test01();
		test02();
	}
//	1.定义一个方法：查询用户表获取第一条用户记录并封装成Map集合(key是字段名称，value是字段值)。
	public static void test01() throws SQLException{
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		Map<String,Object> map = qr.query("select * from user", new MapHandler());
		System.out.println(map);
	}
//	2.定义一个方法：查询用户表获取所有用户记录并返回一个集合，集合中存放的都是Map对象，一个Map对象封装对应一个用户记录。
	public static void test02() throws SQLException{
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		List<Map<String,Object>> list = qr.query("select * from user", new MapListHandler());
		// 遍历集合
		for (Map<String, Object> map : list) {
			System.out.println(map);
		}
	}
}
