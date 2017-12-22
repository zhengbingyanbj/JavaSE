package cn.itcast.level03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class demo2 {
	public static void main(String[] args) {
		try {
			//加载数据驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建数据库连接 使用DriverManager
			
			//编写执行的sql语句
					
			//编译sql语句,使用PreparedStatement预编译对象
			PreparedStatement pstat = conn.prepareStatement(carsql);
			//设置汽车的价格范围
			
			//设置汽车的车型
			pstat.setString(2, "紧凑型SUV");
			//返回结果集使用ResultSet 接收
			
			//循环打印查询出来的数据信息
			while(rs.next()){
				//打印查询出来数据的数量
				
				System.out.println(count);
			}
			//关闭连接	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
