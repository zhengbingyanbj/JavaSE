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
 * ʹ��DBUtils��ɲ�ѯ
 * QueryRunner
 * 		���췽�� 
 * 			QueryRunner() �ղι�����Ҫ�����Լ���ȡ���Ӷ��� ��ά������
 * 					      ���ʹ�ÿղι��촴������  ���÷���ʱ ��Ҫ�Լ���������
 * 			QueryRunner(DataSource dataSource) ���ι��� ���Ӷ���Ͳ���Ҫ����������
 * 											���ʹ�ô��ι��촴������ �����÷���ʱ ������Ҫ��������
 * 		���� 
 * 			 T	query(Connection conn, String sql, ResultSetHandler<T> rsh, Object... params)
 * 			 T	query(String sql, ResultSetHandler<T> rsh, Object... params)
 * 				
 *           ����  
 *           	Connection con:���Ӷ��� ͨ��c3p0��ȡ
 *           	String sql:sql���֧��ռλ��
 *           	ResultSetHandler<T> rsh:���������Ľӿ� �������Ĳ����ǽӿڣ�ֻ�ܴ�����ʵ������� ���벻ͬ��ʵ������� ���ز�ͬ�Ľ��
 *           	Object... params:Ϊռλ����ֵ 	
 * 		
 */
public class Demo02_DBUtils {

	public static void main(String[] args) throws SQLException {
		method7();
	}
	/*
	 * ArrayHandler ��ѯ������ĵ�һ����¼ �����װ��һ��Object[]��
	 * 
	 * һ�㶼�ǲ�ѯһ�����ʱʹ��
	 * 
	 * ��ѯcid=3�ļ�¼
	 */
	public static void method1() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category where cid = ?";
		Object[] objs = qr.query(sql, new ArrayHandler(), 100);//���û�в�ѯ����� ���ؿ�����
		System.out.println(Arrays.toString(objs));
	}
	/*
	 * ArrayListHandler ���������ÿ����¼����װ��һ��Object[]��
	 * �����Object[]����һ��������
	 * 
	 * ��ѯ������¼ʱʹ��
	 * 
	 * ��ѯ���з���
	 */
	public static void method2() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category";
		List<Object[]> list = qr.query(sql, new ArrayListHandler());//û�����ݷ��ؿռ���
		for (Object[] objects : list) {
			System.out.println(Arrays.toString(objects));
		}
	}
	/*
	 * BeanHandler ��������ĵ�һ����¼��װ��һ��ָ����JavaBean������
	 * ��Ҫ�ڹ��췽����ָ��Ҫ��װ���������͵�JavaBean������ ������װ��Person������ �͸�Person.class
	 * 
	 * ��ѯһ����¼ʱʹ�� 
	 * 
	 * 
	 * ��ѯcid=3�ļ�¼
	 */
	public static void method3() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category where cid = ?";
		Category c = qr.query(sql, new BeanHandler<Category>(Category.class), 3);
		System.out.println(c);
	}
	
	/*
	 * BeanListHandler ���������ÿ����¼��װ��һ��ָ����JavaBean������
	 * ����������װ��һ��List������
	 * 
	 * ��ѯ������¼ʱʹ��
	 * 
	 * ��ѯ���з���
	 */
	public static void method4() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category";
		List<Category> list = qr.query(sql, new BeanListHandler<Category>(Category.class));
		for (Category category : list) {
			System.out.println(category);
		}
	}
	
	/*
	 * ColumnListHandler ���������ָ���е����ݴ�ŵ�һ��List������
	 * ColumnListHandler() Ĭ�ϵ�һ��
	 * ColumnListHandler(int index) �ڼ���
	 * ColumnListHandler(String ����)
	 * 
	 * ��ѯ��������ʱʹ��
	 * 
	 * ��ȡ���з������Ƶ�List����
	 */
	public static void method5() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from category";
		List<String> list =qr.query(sql, new ColumnListHandler<String>("cname"));
		
		System.out.println(list);
	}
	
	/*
	 * ScalarHandler ���ڵ������� �����ѯ��¼��
	 * 
	 * ��ѯ������ж�������¼
	 */
	public static void method6() throws SQLException{
		//����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select count(*) from category";
		long i = qr.query(sql, new ScalarHandler<Long>());
		System.out.println(i);
	}
	/*
	 * MapHandler ��������ĵ�һ����¼��װ��һ��Map������
	 * Map<String,Object>
	 * String key : ����
	 * Object value: ��ֵ
	 * 
	 * ��ѯһ����¼ʱʹ��
	 * 
	 * 
	 */
	public static void method7() throws SQLException{
		//����QueryRunner����
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









