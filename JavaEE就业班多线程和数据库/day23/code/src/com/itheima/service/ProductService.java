package com.itheima.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Set;

import com.itheima.dao.ProductDao;
import com.itheima.domain.Product;
import com.itheima.utils.ConnectionManager;

public class ProductService {

	/**
	 * service���ѯ���й���
	 * @return list����
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
	 * service�����id��ѯ�ķ���
	 * @param pid �û������id
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
	 * Service�� ������Ʒ���Ʋ�ѯ��Ʒ
	 * @param pname �û��������Ʒ��
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
	 * service�� �����Ʒ
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
	 * service�� �޸���Ʒ
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
	 * service�� ����idɾ����Ʒ
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
	 * service������ɾ������
	 * @param ids
	 */
	public void deleteAll(Set<Integer> ids) {
		ProductDao dao = new ProductDao();
		try {
			//��������
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
	 * �����������ɾ��
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









