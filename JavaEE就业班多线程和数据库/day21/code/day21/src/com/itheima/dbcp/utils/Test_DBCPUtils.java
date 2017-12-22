package com.itheima.dbcp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/*
 * ʹ��DBCPUtils��ȡ����
 * 
 * ��ѯ������� cid = 3�ļ�¼ ���ҽ��������ݷ���һ��Object������
 */
public class Test_DBCPUtils {

	public static void main(String[] args) throws SQLException {
		//ͨ��DBCPUtils��ȡ����
		Connection con = DBCPUtils.getConnection();
		//��ȡִ��sql���Ķ���
		String sql = "select * from category where cid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		//Ϊ?��ֵ
		ps.setObject(1, 3);
		
		ResultSet rs = ps.executeQuery();
		
		Object[] objs = new Object[2];
		
		while(rs.next()){
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			
			objs[0]=cid;
			objs[1]=cname;
		}
		
		System.out.println(Arrays.toString(objs));
		
		DBCPUtils.close(con, ps, rs);
		
	}
}
