package cn.itcast.demo1;

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
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbwork", "root", "root");
			//编写执行的sql语句
			String carsql="SELECT * FROM car WHERE grade LIKE ? AND price BETWEEN ? AND ?";
			//编译sql语句,使用PreparedStatement预编译对象
			PreparedStatement pstat = conn.prepareStatement(carsql);
			//设置汽车的车型
			pstat.setString(1, "紧凑型%");
			//设置汽车的价格范围区间
			pstat.setDouble(2, 10);
			//设置汽车的价格范围区间
			pstat.setDouble(3, 20);
			//返回结果集使用ResultSet 接收
			ResultSet rs = pstat.executeQuery();
			//循环打印查询出来的数据信息
			while(rs.next()){
				//获取汽车的id
				int id = rs.getInt("cid");
				//获取汽车的名称
				String cname = rs.getString("cname");
				//获取汽车的厂家
				String company = rs.getString("company");
				//获取汽车的车系
				String grade = rs.getString("grade");
				//获取汽车的价格
				double price = rs.getDouble("price");
				//打印汽车信息
				System.out.println(id +"\t"+ cname +"\t"+ company +"\t"+ grade +"\t"+ price);
			}
			//关闭数据库连接
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
