package com.itheima.c3p0.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itheima.bean.Category;

/*
 * ��ȡ����������е�����  ��ÿ����¼��װ��һ��category������
 * �����category�����װ��һ��������
 */
public class Test_C3P0Utils {

	public static void main(String[] args) throws SQLException {
		//ʹ��c3p0�������ȡ����
		Connection con = C3P0Utils.getConnection();
		//��ȡִ��sql���Ķ���
		String sql = "select * from category";
		PreparedStatement ps = con.prepareStatement(sql);
		//ִ��sql���ؽ��
		ResultSet rs = ps.executeQuery();
		
		//�������������洢����category����
		List<Category> list =new ArrayList<Category>();
		
		while(rs.next()){
			
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			//�����ݷ�װ��������
			Category c = new Category(cid, cname);
			//��������ӵ�������
			list.add(c);
		}
		
		System.out.println(list);
		
		
		C3P0Utils.close(con, ps, rs);
	}
}
