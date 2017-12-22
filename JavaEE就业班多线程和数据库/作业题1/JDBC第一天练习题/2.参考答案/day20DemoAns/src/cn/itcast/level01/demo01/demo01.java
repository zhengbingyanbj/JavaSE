package cn.itcast.level01.demo01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class demo01 {
	public static void main(String[] args) throws Exception {
		//0、导入数据库驱动的jar包
		//1、注册驱动
		DriverManager.registerDriver(new Driver());
		//2、获得连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbwork", "root", "root");
		//3、获得执行sql对象
		Statement statement = conn.createStatement();
		//4、执行sql语句
		String sql = "select * from student";
		ResultSet rs = statement.executeQuery(sql);//将虚拟表的数据封装到ResultSet对象中
		//5、接受返回结果 --- 取出数据
		while(rs.next()){
			System.out.println(rs.getString("id")+"----"+rs.getString("name"));
		}
		//6、释放资源
		rs.close();
		statement.close();
		conn.close();
	}
}
