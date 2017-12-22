package com.itheima.dbutils;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import com.itheima.utils.C3P0Utils;

/*
 * 使用连接池 和 DBUtils完成转账案例
 * QueryRunner 
 * 		构造方法 
 * 			QueryRunner() 调用方法时 需要自己获取连接 传入连接
 * 			QueryRunner(DataSource ds) 需要的是连接池对象 ，不需要我们来管理连接 
 * 									        调用方法时 不需要传连接 
 * 	开始事务 需要 连接对象  我只能选用空参构造方法
 * 
 * try{
 * 	开启事务
 *  提交事务
 * }catch(){
 *   回滚
 * 
 * }
 * 
 */
public class Demo01_DBUtils {

	public static void main(String[] args)  {
		Connection con = C3P0Utils.getConnection();
		try {
			//开启事务 
			con.setAutoCommit(false);
			
			//创建QueryRunner对象 使用空参构造 
			QueryRunner qr = new QueryRunner();
		
			String sql = "update account set money = money - ? where name = ?";
			int i= qr.update(con,sql,5000,"liuyan");
			
			System.out.println(1/0);
			
			
			sql = "update account set money = money + ? where name = ?";
			int j= qr.update(con,sql,5000,"tangyan");
			
			if(i>0 && j>0){
				System.out.println("转账成功");
			}
			
			//提交事务
//			con.commit();
			DbUtils.commitAndCloseQuietly(con);
		} catch (Exception e) {
			
//			try {
////				con.rollback();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			
			DbUtils.rollbackAndCloseQuietly(con);
			System.out.println("转账失败"+e);
		}
//		finally {
//			C3P0Utils.close(con, null, null);
//		}
		
		
		
		
	}
}




















