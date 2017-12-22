package com.itheima.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.Product;
import com.itheima.utils.C3P0Utils;
import com.itheima.utils.ConnectionManager;

public class ProductDao {

	/**
	 * 查询所有
	 * 
	 * @return list集合中存放product对象
	 * @throws SQLException
	 */
	public List<Product> findAll() throws SQLException {
		// 创建QueryRunner对象 构造方法中传入连接池对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from products ";
		List<Product> list = qr.query(sql, new BeanListHandler<Product>(Product.class));
		return list;

	}

	/**
	 * 根据id查询数据
	 * 
	 * @param pid
	 *            传入的id
	 * @return
	 * @throws SQLException
	 */
	public Product findById(int pid) throws SQLException {
		// 创建QueryRunner对象 构造方法中传入连接池对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from products where pid = ?";
		Product p = qr.query(sql, new BeanHandler<Product>(Product.class), pid);
		return p;
	}
	/**
	 * 根据name查询数据
	 * @param pname 商品名
	 * @return
	 * @throws SQLException 
	 */
	public Product findByName(String pname) throws SQLException {
		// 创建QueryRunner对象 构造方法中传入连接池对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "select * from products where pname = ?";
		Product p = qr.query(sql, new BeanHandler<Product>(Product.class), pname);
		return p;
		
	}

	/**
	 * 将商品添加到数据库
	 * @param p
	 * @throws SQLException 
	 */
	public void addProduct(Product p) throws SQLException {
		// 创建QueryRunner对象 构造方法中传入连接池对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "insert into products(pname,price,flag,category_id) values(?,?,?,?) ";
		Object[] params = {p.getPname(),p.getPrice(),p.getFlag(),p.getCategory_id()};
		qr.update(sql, params);
	}
	
	
	/**
	 * 修改商品方法
	 * @param p
	 * @throws SQLException 
	 */
	public void updateProduct(Product p) throws SQLException {
		// 创建QueryRunner对象 构造方法中传入连接池对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "update products set pname=?,price=?,category_id=? where pid = ?";
		Object[] params= {p.getPname(),p.getPrice(),p.getCategory_id(),p.getPid()};
		qr.update(sql, params);
		
	}
	/**
	 * dao根据id删除商品方法
	 * @param pid
	 * @throws SQLException 
	 */
//	public void deleteById(int pid) throws SQLException {
//		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
//		String sql = "delete from products where pid = ?";
//		qr.update(sql, pid);
//		
//	}
	public void deleteById(int pid) throws SQLException {
		QueryRunner qr = new QueryRunner();
		
		Connection con = ConnectionManager.getConnection();
		String sql = "delete from products where pid = ?";
		qr.update(con,sql, pid);
		
	}
	/**
	 * 开发版批量删除
	 * @param ids
	 * @throws SQLException 
	 */
	public void deleteAll(Set<Integer> ids) throws SQLException {
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		String sql = "delete from products where pid in(";
		StringBuilder sb = new StringBuilder(sql);
		for(int i = 0 ; i< ids.size();i++){
			sb.append("?");
			if(i!=ids.size()-1){
				sb.append(",");
			}
		}
		sb.append(")");
		System.out.println(sb.toString());
		
		qr.update(sb.toString(), ids.toArray());
	}
}


















