package com.itheima.test02;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import com.itheima.utils.C3P0Utils;

public class Test02_02 {
	public static void main(String[] args) throws SQLException {
		// 获得数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 查询所有用户数据
		List<Object[]> users = qr.query("select * from user", new ArrayListHandler());
		// 遍历集合
		for (Object[] objArr : users) {
			System.out.println(Arrays.toString(objArr));
		}
	}
}