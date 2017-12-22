package com.itheima.test02;

import java.util.Arrays;
import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import com.itheima.utils.C3P0Utils;

public class Test02_01 {
	
	public static void main(String[] args) throws Exception {
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 查询所有用户数据
		Object[] users = qr.query("select * from user", new ArrayHandler());
		System.out.println(Arrays.toString(users));
	}
}
