package com.itheima.test01;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import com.itheima.utils.DBCPUtils;

public class Test01_08 {
	public static void main(String[] args) throws Exception {
		// �õ�����Դ����
		DataSource ds = DBCPUtils.getDataSource();
		// ����SQL���ж���
		QueryRunner qr = new QueryRunner(ds);
		// ִ�и��²���
		int row = qr.update("update user set gender=?,address=? where id=?","��","����",2);
		System.out.println(row);
	}
}
