package com.itheima.c3p0.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.itheima.bean.Category;

/*
 * 获取分类表中所有的数据  将每条记录封装到一个category对象中
 * 将多个category对象封装到一个集合中
 */
public class Test_C3P0Utils {

	public static void main(String[] args) throws SQLException {
		//使用c3p0工具类获取连接
		Connection con = C3P0Utils.getConnection();
		//获取执行sql语句的对象
		String sql = "select * from category";
		PreparedStatement ps = con.prepareStatement(sql);
		//执行sql返回结果
		ResultSet rs = ps.executeQuery();
		
		//创建集合用来存储所有category对象
		List<Category> list =new ArrayList<Category>();
		
		while(rs.next()){
			
			int cid = rs.getInt("cid");
			String cname = rs.getString("cname");
			//将数据封装到对象中
			Category c = new Category(cid, cname);
			//将对象添加到集合中
			list.add(c);
		}
		
		System.out.println(list);
		
		
		C3P0Utils.close(con, ps, rs);
	}
}
