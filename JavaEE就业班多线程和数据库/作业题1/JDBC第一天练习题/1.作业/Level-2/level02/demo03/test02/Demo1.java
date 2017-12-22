package cn.itcast.level02.demo03.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Demo1 {
	public static void main(String[] args) {
		try {
			//加载mysql驱动
			
			//创建数据库连接
			
			//编写sql语句
			
			//编译sql语句,使用PreparedStatement预编译对象
			
			//设置sql语句中的第一个值车的名称
				
			//设置sql语句中的第二个值车的厂家
			
			//设置sql语句中的第三个值车的车型

			//执行sql语句
			
			//打印修改汽车的个数
			
			//关闭lianjie
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("修改汽车系列失败");
		}
}
}
