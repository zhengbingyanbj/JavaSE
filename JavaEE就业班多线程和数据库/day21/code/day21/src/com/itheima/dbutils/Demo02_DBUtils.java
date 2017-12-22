package com.itheima.dbutils;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itheima.bean.Category;
import com.itheima.c3p0.utils.C3P0Utils;

/*
 * 使用DBUtils完成查询
 * QueryRunner
 * 		构造方法 
 * 			QueryRunner() 空参构造需要我们自己获取连接对象 来维护连接
 * 					      如果使用空参构造创建对向  调用方法时 需要自己传入连接
 * 			QueryRunner(DataSource dataSource) 带参构造 连接对象就不需要我们来管了
 * 											如果使用带参构造创建对象 ，调用方法时 ，不需要传入连接
 * 		方法 
 * 			 T	query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params)
 * 			 T	query(String sql, ResultSetHandler<T> rsh, Object... params)
 * 				
 *           参数  
 *           	Connection con:连接对象 通过c3p0获取
 *           	String sql:sql语句支持占位符
 *           	ResultSetHandler<T> rsh:结果集处理的接口 ，方法的参数是接口，只能传入其实现类对象 传入不同的实现类对象 返回不同的结果
 *           	Object... params:为占位符赋值 	
 * 		
 */
public class Demo02_DBUtils {

	public static void main(String[] args) throws SQLException {
		method7();
	}
	/*
	 * ArrayHandler 查询结果集的第一条记录 将其封装到一个Object[]中
	 * 
	 * 一般都是查询一条结果时使用
	 * 
	 * 查询cid=3的记录
	 */
	public static void method1() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category where cid = ?";
		Object[] objs = qr.query(sql, new ArrayHandler(), 100);//如果没有查询到结果 返回空数组
		System.out.println(Arrays.toString(objs));
	}
	/*
	 * ArrayListHandler 将结果集中每条记录都封装到一个Object[]中
	 * 将多个Object[]放入一个集合中
	 * 
	 * 查询多条记录时使用
	 * 
	 * 查询所有分类
	 */
	public static void method2() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category";
		List<Object[]> list = qr.query(sql, new ArrayListHandler());//没有数据返回空集合
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}
	/*
	 * BeanHandler 将结果集的第一条记录封装到一个指定的JavaBean对象中
	 * 需要在构造方法中指定要封装到哪中类型的JavaBean对象中 如果想封装到Person对象中 就给Person.class
	 * 
	 * 查询一条记录时使用 
	 * 
	 * 
	 * 查询cid=3的记录
	 */
	public static void method3() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category where cid = ?";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class), 3);
		System.out.println(c);
	}
	
	/*
	 * BeanListHandler 将结果集的每条记录封装到一个指定的JavaBean对象中
	 * 将多个对象封装到一个List集合中
	 * 
	 * 查询多条记录时使用
	 * 
	 * 查询所有分类
	 */
	public static void method4() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category";
		List<Category> list = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : list) {
			System.out.println(category);
		}
	}
	
	/*
	 * ColumnListHandler 将结果集中指定列的数据存放到一个List集合中
	 * ColumnListHandler() 默认第一列
	 * ColumnListHandler(int index) 第几列
	 * ColumnListHandler(String 列名)
	 * 
	 * 查询单列数据时使用
	 * 
	 * 获取所有分类名称的List集合
	 */
	public static void method5() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category";
		List<String> list =qr.query(sql, new ColumnListHandler<String>("cname"));
		
		System.out.println(list);
	}
	
	/*
	 * ScalarHandler 用于单个数据 比如查询记录数
	 * 
	 * 查询分类表有多少条记录
	 */
	public static void method6() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select count(*) from category";
		long i = qr.query(sql, new ScalarHandler<Long>());
		System.out.println(i);
	}
	/*
	 * MapHandler 将结果集的第一条记录封装到一个Map集合中
	 * Map<String,Object>
	 * String key : 列名
	 * Object value: 列值
	 * 
	 * 查询一条记录时使用
	 * 
	 * 
	 */
	public static void method7() throws SQLException{
		//创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category where cid = ?";
		Map<String, Object> map = qr.query(sql, new MapHandler(), 3);
		
//		for(String key : map.keySet()){
//			System.out.println(key+" "+ map.get(key));
//		}
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key+" "+ map.get(key));
		}
	}
	
	
	
}









