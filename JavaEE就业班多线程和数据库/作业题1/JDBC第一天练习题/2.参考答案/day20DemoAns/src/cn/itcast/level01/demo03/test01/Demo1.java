package cn.itcast.level01.demo03.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo1 {
	public static void main(String[] args) {
			try {
				//加载mysql驱动
					Class.forName("com.mysql.jdbc.Driver");
				//创建数据库连接
					Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbwork", "root", "root");
				//编写sql语句
					String carsql="insert into car (cname,company,grade,price) values(?,?,?,?)";
				//编译sql语句,使用PreparedStatement预编译对象
					PreparedStatement pstat = conn.prepareStatement(carsql);
				//设置sql语句中的第一个值车的名称
					pstat.setString(1, "宝马3系");
				//设置sql语句中的第二个值车的厂家
					pstat.setString(2, "宝马");
				//设置sql语句中的第三个值车的车型
					pstat.setString(3, "中型车");
				//设置sql语句中的第三个值车的价格
					pstat.setDouble(4, 28.3);
				//执行sql语句，并返回插入的数量
				int addCount = pstat.executeUpdate();
				//打印插入汽车的个数
				System.out.println("添加汽车个数: "+addCount);
				
				//关闭lianjie
				pstat.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
