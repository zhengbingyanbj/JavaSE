package com.itheima.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	 // �������ݿ��URL
	  private static final String URL = "jdbc:mysql://localhost:3306/mydb";
	  // ���ݿ��û���
	  private static final String USER = "root";
	  // ���ݿ�����
	  private static final String PASSWORD = "123456";
	  // ����������
	  private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";

	  /**
	   * ֻע����������һ�ξͿ���(��̬�������)
	   */
	  static {
	    try {
	      // ע������
	      Class.forName(DRIVER_CLASS);
	    } catch (ClassNotFoundException e) {
	      e.printStackTrace();
	    }
	  }

	  /**
	   * ��ȡ���ӷ���
	   * 
	   * @return
	   */
	public static Connection getConnection() {
		try {
			// ��ȡ����
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			return conn;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * �ر���Դ�������ȹر�ResultSet���ٹر�Statement�����ر�Connection��
	 */
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
	  try {
	    if (rs != null) {
	      rs.close();
	    }
	  } catch (SQLException e) {
	    e.printStackTrace();
	  }
	  try {
	    if (stmt != null) {
	      stmt.close();
	    }
	  } catch (SQLException e) {
	    e.printStackTrace();
	  }
	  try {
	    if (conn != null) {
	      conn.close();
	    }
	  } catch (SQLException e) {
	    e.printStackTrace();
	  }
	}

	  /**
	   * �ر�ֻ��2������ķ���
	   */
	  public static void close(Connection conn, Statement stmt) {
	    close(conn, stmt, null);
	  }
}
