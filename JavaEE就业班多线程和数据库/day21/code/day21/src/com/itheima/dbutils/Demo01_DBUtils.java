package com.itheima.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.c3p0.utils.C3P0Utils;

/*
 * 使用DBUtils完成数据库的增 删 改
 * 
 * QueryRunner 
 * 		构造方法 
 * 			QueryRunner() 空参构造需要我们自己获取连接对象 来维护连接
 * 					      如果使用空参构造创建对向  调用方法时 需要自己传入连接
 * 			QueryRunner(DataSource dataSource) 带参构造 连接对象就不需要我们来管了
 * 											如果使用带参构造创建对象 ，调用方法时 ，不需要传入连接
 * 		方法 
 * 			update(Connection conn, String sql, Object... params)  使用空参构造创建对象 调用这个方法  进行增删改
 * 			update(String sql, Object... params) 使用带参构造创建对象时 调用这个方法 进行 增删改
 * 
 * 			参数  
 * 				Connection conn:连接对象 可以通过c3p0utils获取
 * 				String sql ： sql语句 可以使用占位符
 * 			    Object...params:为?占位符赋值
 * 
 */
public class Demo01_DBUtils {

	public static void main(String[] args) throws SQLException {
		method2();
	}
	//使用空参构造方法
	public static void method1() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner();
		//调用update方法
		Connection con = C3P0Utils.getConnection();
		
		String sql = "update category set cname=? where cid = ?";
		//执行sql语句
		int row = qr.update(con, sql, "蔬菜",3);
		System.out.println(row);
		//关闭资源
		DbUtils.closeQuietly(con);
//		con.close();
//		C3P0Utils.close(con, null, null);
	}
	public static void method2() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "update category set cname=? where cid = ?";
		Object[] objs = {"化妆品",3};
		qr.update(sql, objs);
	}
}











