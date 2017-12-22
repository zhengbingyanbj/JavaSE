package com.itheima.test01;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import com.itheima.utils.C3P0Utils;

public class Test01_07 {
	public static void main(String[] args) throws Exception {
		createTable();
		insert();
	}
	
	/*
	 * 创建用户表
	 */
	public static void createTable() throws Exception{
		// 创建用户表Sql
		String sql01 = "create table user(id int primary key auto_increment,"
				+ "username varchar(20) unique not null,"
				+ "gender varchar(2),"
				+ "address varchar(30));";
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行创表SQL语句
		qr.update(sql01);
	}
	/*
	 * 向用户表添加多条用户记录。
	 */
	public static void insert() throws SQLException{
		// 得到数据源对象
		DataSource ds = C3P0Utils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 要执行的SQL语句
		String sql = "insert into user(username,gender,address) values('jack','男','广州'),('rose','女','北京'),('lily','女','天津')";
		// 执行插入操作
		int row = qr.update(sql);
		
		System.out.println(row);
	}
}
