package cn.itcast.demo1;

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
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbwork", "root", "root");
			//编写执行的sql语句
			String carsql="SELECT COUNT(*) FROM car WHERE price < ? AND grade=?";
			//编译sql语句,使用PreparedStatement预编译对象
			PreparedStatement pstat = conn.prepareStatement(carsql);
			//设置汽车的价格范围
			pstat.setDouble(1, 20);
			//设置汽车的车型
			pstat.setString(2, "紧凑型SUV");
			//返回结果集使用ResultSet 接收
			ResultSet rs = pstat.executeQuery();
			//循环打印查询出来的数据信息
			while(rs.next()){
				//打印查询出来数据的数量
				int count = rs.getInt(1);
				System.out.println(count);
			}
			//关闭连接	
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
