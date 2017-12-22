package com.itheima.test01;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import com.itheima.utils.DBCPUtils;

public class Test01_08 {
	public static void main(String[] args) throws Exception {
		// 得到数据源对象
		DataSource ds = DBCPUtils.getDataSource();
		// 创建SQL运行对象
		QueryRunner qr = new QueryRunner(ds);
		// 执行更新操作
		int row = qr.update("update user set gender=?,address=? where id=?","男","深圳",2);
		System.out.println(row);
	}
}
