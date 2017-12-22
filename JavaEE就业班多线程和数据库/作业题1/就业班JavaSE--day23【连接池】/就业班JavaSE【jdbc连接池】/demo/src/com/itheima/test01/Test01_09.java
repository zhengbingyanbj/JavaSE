package com.itheima.test01;

import java.sql.SQLException;

import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.DBCPUtils;
public class Test01_09 {
	public static void main(String[] args) throws SQLException {
		// 得到数据源对象
		DataSource ds = DBCPUtils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 执行删除操作
		int row = qr.update("delete from user where id = ?",3);
		System.out.println(row);
	}
}
