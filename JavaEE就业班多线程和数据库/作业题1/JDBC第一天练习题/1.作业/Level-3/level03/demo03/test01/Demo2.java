package cn.itcast.level03.demo03.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo2 {
	public static void main(String[] args) {
			try {
				//加载mysql驱动
					Class.forName("com.mysql.jdbc.Driver");
				//创建数据库连接
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day31", "root", "root");
				//编写sql语句
				
				//编译sql语句,使用PreparedStatement预编译对象
					PreparedStatement pstat = conn.prepareStatement(carsql);
				//设置sql语句中的第一个值车的名称
					pstat.setString(1, "宝马3系");
				//设置sql语句中的第二个值车的厂家
					pstat.setString(2, "宝马");
				
				//执行sql语句，并返回插入的数量
				int addCount = pstat.executeUpdate();
				//打印插入汽车的个数
				System.out.println("删除汽车个数: "+addCount);
				
				//关闭lianjie 要求使用JDBCUtils关闭连接
				
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
