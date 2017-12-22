package com.itheima.test01;

public class Test01_09 {
	/*
	 * 定义一个数据库工具类JdbcUtil，用来简化数据库操作出现的重复代码。
		创建类JdbcUtil包含3个方法：
		1) 可以把几个字符串定义成常量
		2) public static Connection getConnection() 得到数据库的连接
		3) 在静态代码块中注册驱动，只需注册一次即可。无需放在getConnection()方法中
		4) public static void close(Connection conn,Statement stmt,ResultSet rs) 关闭所有打开的资源
		5)public static void close(Connection conn,Statement stmt) 关闭没有结果集的资源，可以调用上面的方法。
	 */
}
