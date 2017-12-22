package com.itheima.dbcp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itheima.bean.Category;

/*
 * 查询分类表中 cid=3的记录 将得到的数据封装到一个Category的对象中
 */
public class Test02_DBCPUtils2 {

	public static void main(String[] args) throws SQLException {
		//获取连接对象
		Connection con = DBCPUtils2.getConnection();
		//获取执行sql语句的对象
		String sql = "select * from category where cid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setObject(1, 3);
		
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			
			//将数据封装到对象中
			Category c = new Category(cid, cname);
			System.out.println(c);
		}
		
		DBCPUtils2.close(con, ps, rs);
	}
}
