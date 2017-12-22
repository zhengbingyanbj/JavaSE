package com.itheima.dbcp.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

/*
 * 使用DBCPUtils获取连接
 * 
 * 查询分类表中 cid = 3的记录 并且将这条数据放入一个Object数组中
 */
public class Test_DBCPUtils {

	public static void main(String[] args) throws SQLException {
		//通过DBCPUtils获取连接
		Connection con = DBCPUtils.getConnection();
		//获取执行sql语句的对象
		String sql = "select * from category where cid = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		//为?赋值
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
