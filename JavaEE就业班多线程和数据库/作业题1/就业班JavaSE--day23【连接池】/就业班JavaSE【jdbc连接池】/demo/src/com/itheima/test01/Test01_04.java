package com.itheima.test01;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;

public class Test01_04 {
	public static void main(String[] args) throws SQLException {
		// 创建连接池对象
		BasicDataSource ds = new BasicDataSource();
		// 设置数据库连接参数
		ds.setUsername("root");
		ds.setPassword("123456");
		ds.setUrl("jdbc:mysql:///day08");
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		
		// 设置连接参数
		ds.setInitialSize(5);
		ds.setMaxActive(10);
		// 最大空闲时间
		ds.setMaxWait(2000);
		ds.setMaxIdle(5);
		
		// 获得连接对象
		for (int i = 0; i < 10 ; i++) {
			Connection conn = ds.getConnection();
			System.out.println("第" + (i + 1) + "个:" + conn.hashCode());
		}
	}
}
