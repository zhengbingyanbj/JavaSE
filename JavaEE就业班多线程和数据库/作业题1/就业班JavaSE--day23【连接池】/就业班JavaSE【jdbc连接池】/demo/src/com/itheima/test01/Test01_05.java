package com.itheima.test01;

import java.sql.Connection;
import java.util.Properties;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.BasicDataSourceFactory;

public class Test01_05 {
	
	public static void main(String[] args) throws Exception {
		Properties prop = new Properties();
		prop.load(Test01_05.class.getResourceAsStream("/dbcp.properties"));
		// 1.创建连接池
		BasicDataSource ds = (BasicDataSource) BasicDataSourceFactory.createDataSource(prop);
		// 2.获取连接
		for (int i = 1; i <= 10; i++) {
			Connection conn = ds.getConnection();
			System.out.println(conn.hashCode());
		}
	}
}
