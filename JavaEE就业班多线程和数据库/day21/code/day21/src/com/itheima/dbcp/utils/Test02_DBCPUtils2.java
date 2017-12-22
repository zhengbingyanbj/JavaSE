package com.itheima.dbcp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.bean.Category;

/*
 * ��ѯ������� cid=3�ļ�¼ ���õ������ݷ�װ��һ��Category�Ķ�����
 */
public class Test02_DBCPUtils2 {

	public static void main(String[] args) throws SQLException {
		//��ȡ���Ӷ���
		Connection con = DBCPUtils2.getConnection();
		//��ȡִ��sql���Ķ���
		String sql = "select * from category where cid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setObject(1, 3);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			
			//�����ݷ�װ��������
			Category c = new Category(cid, cname);
			System.out.println(c);
		}
		
		DBCPUtils2.close(con, ps, rs);
	}
}
