package com.itheima02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.utils.JDBCUtils;

/*
 * PreparedStatement ��ɲ�ѯ
 */
public class Demo04_JDBC {

	public static void main(String[] args) throws SQLException {
		Connection con = JDBCUtils.getConnection();
		String sql = "select * from category";
		PreparedStatement ps = con.prepareStatement(sql);
		//ִ��sql
		ResultSet rs = ps.executeQuery();
		//��������
		while(rs.next()){
			System.out.println(rs.getInt("cid")+" "+ rs.getString("cname"));
		}
		
		
		JDBCUtils.close(con, ps, rs);
	}
}
