package com.itheima.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.utils.ConnectionManager;

public class ProductService {

	/**
	 * service层查询所有功能
	 * @return list集合
	 */
	public List<Product> findAll(){
		ProductDao dao = new ProductDao();
		List<Product> list=null;
		try {
			list = dao.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	/**
	 * service层根据id查询的方法
	 * @param pid 用户输入的id
	 * @return
	 */
	public Product findById(int pid) {
		ProductDao dao = new ProductDao();
		Product p = null;
		try {
			p = dao.findById(pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	/**
	 * Service层 根据商品名称查询商品
	 * @param pname 用户输入的商品名
	 * @return
	 */
	public Product findByName(String pname) {
		ProductDao dao = new ProductDao();
		Product p = null;
		try {
			p = dao.findByName(pname);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	/**
	 * service层 添加商品
	 * @param p
	 */
	public void addProduct(Product p) {
		ProductDao dao = new ProductDao();
		try {
			dao.addProduct(p);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	/**
	 * service层 修改商品
	 * @param p
	 */
	public void updateProduct(Product p) {
		ProductDao dao = new ProductDao();
		try {
			dao.updateProduct(p);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * service层 根据id删除商品
	 * @param pid
	 */
	public void deleteById(int pid) {
		
		ProductDao dao = new ProductDao();
		try {
			dao.deleteById(pid);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * service层批量删除方法
	 * @param ids
	 */
	public void deleteAll(Set<Integer> ids) {
		ProductDao dao = new ProductDao();
		try {
			//开启事务
			ConnectionManager.begin();
			
			for(int id : ids){
				dao.deleteById(id);
			}
			
			ConnectionManager.commit();
		} catch (Exception e) {
			ConnectionManager.rollBack();
		}finally{
			ConnectionManager.close();
		}
		
	}
	
	/*
	 * 开发版的批量删除
	 */
	public void deleteAll2(Set<Integer> ids) {
		ProductDao dao = new ProductDao();
		try {
			dao.deleteAll(ids);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}









