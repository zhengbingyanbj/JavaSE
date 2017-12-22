package com.itheima.test01;

import java.sql.Connection;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Test01_01 {
	
	public static void main(String[] args) throws Exception {
		// 获得连接池对象
		ComboPooledDataSource ds = new ComboPooledDataSource();
		// 设置数据库连接参数
		// 设置用户名
		ds.setUser("root");
		// 设置密码
		ds.setPassword("123456");
		// 设置数据库连接URL
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/day08");
		// 设置数据库驱动你
		ds.setDriverClass("com.mysql.jdbc.Driver");
		
		// 设置连接池参数
		// 设置初始连接数
		ds.setInitialPoolSize(5);
		// 设置最大连接数
		ds.setMaxPoolSize(10);
		// 设置最大空闲时间:毫秒
		ds.setMaxIdleTime(2000);
		// 设置最大等待时间
		ds.setCheckoutTimeout(1000);
		
		// 获得连接对象
		for (int i = 0; i < 10; i++) {
			Connection conn = ds.getConnection();
			System.out.println("第" + (i + 1) + "个:" + conn);
		}
	}
}
