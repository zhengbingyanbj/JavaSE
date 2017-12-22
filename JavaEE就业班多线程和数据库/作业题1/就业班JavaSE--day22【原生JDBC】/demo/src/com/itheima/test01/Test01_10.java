package com.itheima.test01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test01_10 {

	/*
	 ʹ��PreparedStatement����������ݿ����ɾ�Ĳ�
	1.���һ��ѧ����ѧ����
	2.ɾ��id=1��ѧ����Ϣ
	3.�޸�id=2ѧ��������Ϊ��jack��
	4.��ѯ���е�ѧ����Ϣ
	 */
	public static void main(String[] args) throws Exception{
		//addStudent();
		//deleteStudent();
		//updateStudent();
		findAllStudent();
	}
	
	// 1.���һ��ѧ����ѧ����
	public static void addStudent() throws Exception{
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ����PreparedStatement����
		PreparedStatement ps = conn.prepareStatement("insert into stu(name,gender) values('jack','��')");
		// ִ����Ӳ���
		int row = ps.executeUpdate();
		System.out.println(row);
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
	
	// 2.ɾ��id=1��ѧ����Ϣ
	public static void deleteStudent() throws Exception{
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ����PreparedStatement����
		PreparedStatement ps = conn.prepareStatement("delete from stu where id = ? ");
		// ���ò���
		ps.setInt(1, 1);
		// ִ����Ӳ���
		int row = ps.executeUpdate();
		System.out.println(row);
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
	
	// 3.�޸�id=2ѧ��������Ϊ��jack��
	public static void updateStudent() throws Exception{
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ����PreparedStatement����
		PreparedStatement ps = conn.prepareStatement("update stu set name = ? where id = ?");
		// ���ò���
		ps.setString(1, "jack");
		ps.setInt(2, 2);
		// ִ����Ӳ���
		int row = ps.executeUpdate();
		System.out.println(row);
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
	
	// 4.��ѯ���е�ѧ����Ϣ
	public static void findAllStudent() throws Exception{
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ����PreparedStatement����
		PreparedStatement ps = conn.prepareStatement("select * from stu;");
		// ִ�в�ѯ����
		ResultSet rs = ps.executeQuery();
		// ѭ�����ÿһ����ѯ��¼
		while(rs.next()) {
			// ���ѧ��
			int id = rs.getInt("id");
			// �������
			String name = rs.getString("name");
			// ����Ա�
			String gender = rs.getString("gender");
			System.out.println("ѧ�ţ�" + id + ",������" + name + ",�Ա�" + gender);
		}
		// �ر���Դ
		JdbcUtil.close(conn, ps,rs);
	}
}
