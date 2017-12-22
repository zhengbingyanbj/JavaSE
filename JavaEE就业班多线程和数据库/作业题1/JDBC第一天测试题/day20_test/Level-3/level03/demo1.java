package cn.itcast.level03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class demo1 {
	public static void main(String[] args) {
		try {
			//加载数据驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建数据库连接 使用DriverManager
			
			//编写执行的sql语句
			
			//编译sql语句,使用PreparedStatement预编译对象
			PreparedStatement pstat = conn.prepareStatement(carsql);
			//设置汽车的车型
			
			//设置汽车的价格范围区间
			pstat.setDouble(2, 10);
			//设置汽车的价格范围区间
			
			//返回结果集使用ResultSet 接收
			ResultSet rs = pstat.executeQuery();
			//循环打印查询出来的数据信息
			
				//获取汽车的id
				int id = rs.getInt("id");
				//获取汽车的名称
				
				//获取汽车的厂家
				String company = rs.getString("company");
				//获取汽车的车系
				
				//获取汽车的价格
				double price = rs.getDouble("price");
				//打印汽车信息
				System.out.println(id +"\t"+ cname +"\t"+ company +"\t"+ grade +"\t"+ price);
			}
			//关闭数据库连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
