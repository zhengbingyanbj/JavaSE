package com.itheima02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.itheima.utils.JDBCUtils;

/*
 * PreparedStatement �����ɾ��
 */
public class Demo03_JDBC {

	public static void main(String[] args) throws SQLException {
		//ʹ��JDBC������ ��ȡ���Ӷ���
		Connection con = JDBCUtils.getConnection();
		//��ȡԤ����sql���Ķ���
		String sql = "update category set cname=? where cid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		//Ϊ?��ֵ
		ps.setObject(1, "��ױƷ");
		ps.setObject(2, 3);
		
		//ִ��sql���
		int row = ps.executeUpdate();
		System.out.println(row);
		
		JDBCUtils.close(con, ps, null);
	}
}
