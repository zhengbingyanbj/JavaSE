package cn.itcast.level01.demo03.test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo2 {
	public static void main(String[] args) {
		try {
			//加载mysql驱动
			//创建数据库连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbwork", "root", "root");
			//编写sql语句
			String carsql="SELECT grade, MIN(price) FROM car GROUP BY grade";
			//编译sql语句,使用PreparedStatement预编译对象
			PreparedStatement pstat = conn.prepareStatement(carsql);
			//返回rs结果集
			ResultSet rs = pstat.executeQuery();
			//打印查询出来的汽车厂商信息
			while(rs.next()){
				//获取汽车车型
				String grade = rs.getString("grade");
				//获取汽车价格
				double minPrice = rs.getDouble(2);
				//打印汽车车型和价格
				System.out.println(grade +"\t"+ minPrice);
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
