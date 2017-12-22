package cn.itcast.level01.demo03.test03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo1 {
	public static void main(String[] args) {
		try {
			//加载mysql驱动
			Class.forName("com.mysql.jdbc.Driver");
			//创建数据库连接
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbwork", "root", "root");
			//编写sql语句
			String carsql="SELECT company, COUNT(*) FROM car WHERE price > ? GROUP BY company";
			//编译sql语句,使用PreparedStatement预编译对象
			PreparedStatement pstat = conn.prepareStatement(carsql);
			//设置sql语句中的统计价格的数量
			pstat.setDouble(1, 10);
			//返回rs结果集
			ResultSet rs = pstat.executeQuery();
			//打印查询出来的汽车厂商信息
			while(rs.next()){
				//获取厂商信息
				String company = rs.getString("company");
				//获取厂商数量
				int count = rs.getInt(2);
				//打印厂商信息和数量
				System.out.println(company +"\t"+ count);
			}
			rs.close();
			pstat.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
