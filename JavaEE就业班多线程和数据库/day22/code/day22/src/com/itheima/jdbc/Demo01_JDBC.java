package com.itheima.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.utils.JDBCUtils;

/*
 * 使用原生态JDBC完成转账案例
 * 
 * 事务指的是逻辑上的一组操作,组成这组操作的各个单元要么全都成功,要么全都失败.
 * 事务作用：保证在一个事务中多次操作要么全都成功,要么全都失败.
 * 一组操作:必须在同一个连接下的多次操作
 * 
 * 事务 
 * 	   开启事务: 开启事务后 下面的所有操作都属于我当前的事务
 * 	   提交事务: 将事务提交 数据永久保存数据库
 *   回滚:将数据恢复到开启事务之前的状态
 *   
 * 开启事务 
 * 		java.sql.Connection 接口
 * 			setAutoCommit(boolean b)
 * 			参数  
 * 				boolean b:mysql本身就默认自动开启事务 只不过自动事务针对的是一条sql语句
 * 						  而我们现在要多条sql开启事务  需要 关闭mysql自动事务 开启手动事务
 * 						 b为true 自动事务    b为false 关闭自动事务 开启手动事务
 * 提交事务  
 * 		   void commit() 提交事务 
 * 
 * 回滚 
 * 		   void rollback() 回滚
 * 
 * 
 */
public class Demo01_JDBC {

	public static void main(String[] args) {
		//获取连接对象
		Connection con = JDBCUtils.getConnection();
		Statement stat = null;
		try {
			//开启事务
			con.setAutoCommit(false);
			
			//获取执行sql语句的对象
			stat = con.createStatement();
			//执行sql语句
			String sql = "update account set money = money -5000 where name='liuyan'";
			int i = stat.executeUpdate(sql);
			
			System.out.println(1/0);
			
			sql = "update account set money = money +5000 where name='tangyan'";
			int j = stat.executeUpdate(sql);
			//处理结果
			if(i>0 && j>0){
				System.out.println("转账成功");
			}
			
			//提交事务
			con.commit();
		
		} catch (Exception e) {
			
			try {
				//如果出现异常回滚
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println("转账失败"+e);
		}finally {
			JDBCUtils.close(con, stat, null);
		}
		
	}
}
