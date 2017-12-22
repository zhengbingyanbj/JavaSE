package cn.itcast.level01.demo03.test02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo2 {
	public static void main(String[] args) {
		try {
			//加载mysql驱动
			//创建数据库连接
			//编写sql语句 查询条件顺序 车系 
			//编译sql语句,使用PreparedStatement预编译对象
			//设置sql语句中的第一个值车的名称
				
			//设置sql语句中的第二个值车的厂家
			//设置sql语句中的第三个值车的车型

			//执行sql语句
			//打印插入汽车的个数
					//打印汽车编号
					//打印汽车名称
					//打印汽车厂家
					//打印汽车车型
					//打印汽车价格
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("修改汽车系列失败");
		}finally{
			//关闭lianjie 要求使用JDBCUtils
		}
}
}
