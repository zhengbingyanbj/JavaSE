package com.itheima.test03;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.itheima.test01.JdbcUtil;
import com.itheima.test02.Student;

public class Test03_01 {
	/*
	 1.�����ݿⴴ�����ű��Ա���������ֶ����£�
	���ű�����ֶ��У����ű�ţ���������(Ψһ�Ҳ���Ϊ��)
	Ա��������ֶ��У�Ա����ţ�Ա������(Ψһ�Ҳ���Ϊ��)��Ա���Ա�Ա��ְλ��Ա�����ʣ���ְ���ڡ����ű��(���)
	
	2.����Ӷ���������ݣ�����Ӷ���Ա������
	
	3.��д��������һ��Ա����ź͹������������������ڽ�ָ����ŵ�Ա�������޸�Ϊ�µĹ��ʡ�
	4.��д������ѯָ��ְλ����Ա������Ϣ������List<Employee>���ϡ�
	5.��д������ѯָ��������Ա����Ϣ������Employee����
	6.��д��������Ա������ɾ��ָ����Ա����Ϣ��
	7.��д������ѯ��������Ա���Ĺ��ʲ�����ڿ���̨�������ʽ���£�
		����=10000
		�ŷ�=20000
		��������������
	8.��д��������һ�����ʲ����������ڲ�ѯ���ʴ��ڵ��ڴ���Ĺ��ʵ�Ա�������ط�����������Ա����ϢList<Employee>���ϡ�
	9.��д������ѯָ�����ŵ�����Ա����Ϣ������List<Employee>����
	*/
	
	public static void main(String[] args)  throws Exception{
		// ������
		// createTable();
		
		// ��Ӳ�������
		// addDept();
		
		// ���Ա������
		// addEmployees();
		
		// �޸�id=2��Ա������Ϊ16000
		// updateSalary(2, 16000);
		
		// �������Ա����Ϣ
		/* List<Employee> employees = findAllEmployee();
		for (Employee employee : employees) {
			System.out.println(employee);
		} */
		
		/*
		Employee e = findEmployeeByName("����");
		System.out.println(e);
		*/
		
		// ɾ��nameΪ����ϼ��Ա��
		// System.out.println(deleteByName("����ϼ"));
		
		// 7.��д������ѯ��������Ա���Ĺ��ʲ�����ڿ���̨
		// querySalarys();
		
		// 8.��ѯ���ʴ���10000��Ա��
		/*List<Employee> employees = findEmployeeBySalary(20000);
		for (Employee employee : employees) {
			System.out.println(employee);
		}*/
		
		// 9.��д������ѯָ�����ŵ�����Ա����Ϣ������List<Employee>����
		List<Employee> employees = findEmployeeByDeptName("��Ʒ��");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	// 9.��д������ѯָ�����ŵ�����Ա����Ϣ������List<Employee>����
	public static List<Employee> findEmployeeByDeptName(String deptName) {
		String sql = "select * from employee where deptid in("
				+ "select id from dept where dept_name = ?"
				+ ");";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		//2. ����PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<>();
		try {
			//2. ����PreparedStatement
			ps = conn.prepareStatement(sql);
			//3.���ò���������
		    ps.setString(1, deptName);
			rs = ps.executeQuery();
			while(rs.next()) {
				// ����Ա������
				Employee e = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), 
						rs.getString("post"), rs.getDouble("salary"), rs.getDate("edate"), 
						rs.getInt("deptid"));
				// ��ӵ�������
				employees.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return employees;
	}
	
	// 8.��д��������һ�����ʲ����������ڲ�ѯ���ʴ��ڵ��ڴ���Ĺ��ʵ�Ա����
	// ���ط�����������Ա����ϢList<Employee>���ϡ�
	public static List<Employee> findEmployeeBySalary(double salary) {
		String sql = "select * from employee where salary >= ?";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		//2. ����PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<>();
		try {
			//2. ����PreparedStatement
			ps = conn.prepareStatement(sql);
			//3.���ò���������
			ps.setDouble(1, salary);
			rs = ps.executeQuery();
			while(rs.next()) {
				// ����Ա������
				Employee e = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), 
						rs.getString("post"), rs.getDouble("salary"), rs.getDate("edate"), 
						rs.getInt("deptid"));
				// ��ӵ�������
				employees.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return employees;
	}
	
	// 7.��д������ѯ��������Ա���Ĺ��ʲ�����ڿ���̨�������ʽ���£�
	public static void  querySalarys() {
		String sql = "select salary,name from employee where name like'��%' ";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		try {
			//2. ����PreparedStatement
			ps = conn.prepareStatement(sql);
			//3. ִ�в�ѯ����
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("name") + "=" + rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps,rs);
		}
	}
	
	// 6.��д��������Ա������ɾ��ָ����Ա����Ϣ��
	public static boolean deleteByName(String name){
		String sql = "delete from employee where name = ?";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps  = null;
		try {
			//2. ����PreparedStatement
			ps = conn.prepareStatement(sql);
			//3.���ò���������
			ps.setString(1, name);
			int row = ps.executeUpdate();
			return row == 1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps);
		}
		return false;
	}
	
	// 5.��д������ѯָ��������Ա����Ϣ������Employee����
	public static Employee findEmployeeByName(String name){
		String sql = "select * from employee where name = ?";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		PreparedStatement ps  = null;
		ResultSet rs = null;
		try {
			//2. ����PreparedStatement
			ps = conn.prepareStatement(sql);
			//3.���ò���������
			ps.setString(1, name);
			rs = ps.executeQuery();
			rs.next();
			// ����Ա������
			Employee e = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), 
					rs.getString("post"), rs.getDouble("salary"), rs.getDate("edate"), 
					rs.getInt("deptid"));
			return e;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return null;
	}
	
	// 4.��д������ѯָ��ְλ����Ա������Ϣ������List<Employee>���ϡ�
	public static List<Employee> findAllEmployee() {
		String sql = "select * from employee";
		//1.�õ����Ӷ���
		Connection conn = JdbcUtil.getConnection();
		//2. ����PreparedStatement
		PreparedStatement ps  = null;
		ResultSet rs = null;
		List<Employee> employees = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			//3. ��Ϊû�в���������ֱ������
			rs = ps.executeQuery();
			while(rs.next()) {
				// ����Ա������
				Employee e = new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("gender"), 
						rs.getString("post"), rs.getDouble("salary"), rs.getDate("edate"), 
						rs.getInt("deptid"));
				// ��ӵ�������
				employees.add(e);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			JdbcUtil.close(conn, ps, rs);
		}
		return employees;
	}
	
	// 3.��д��������һ��Ա����ź͹������������������ڽ�ָ����ŵ�Ա�������޸�Ϊ�µĹ��ʡ�
	public static void updateSalary(int id,double salary)  throws Exception {
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// Sql���
		String sql = "update employee set salary = ? where id = ?;";
		// ���PreparedStatement����
		PreparedStatement ps = conn.prepareStatement(sql);
		// ���ò���
		ps.setDouble(1, salary);
		ps.setInt(2, id);
		// ִ��SQL���
		int row = ps.executeUpdate();
		System.out.println(row);
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
	
	// ��Ӷ���Ա������
	public static void addEmployees() throws Exception{
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// SQL���
		String sql = "insert into employee(name,gender,post,salary,edate,deptid) "
				+ "values('����','��','Java�з�����ʦ',9000,'2016-10-10',1),"
				+ "('����ϼ','Ů','���۾���',15000,'2015-06-15',2),"
				+ "('����','��','��Ʒ����',10000,'2014-12-11',3),"
				+ "('������','��','Android�з�����ʦ',8000,'2017-05-26',1);";
		// ���PreparedStatement����
		PreparedStatement ps = conn.prepareStatement(sql);
		// ִ��SQL���
		int row = ps.executeUpdate();
		System.out.println(row);
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
		
		
	// ��Ӷ����������
	public static void addDept() throws Exception{
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// SQL���
		String sql = "insert into dept(dept_name) values('�з���'),('���۲�'),('��Ʒ��');";
		// ���PreparedStatement����
		PreparedStatement ps = conn.prepareStatement(sql);
		// ִ��SQL���
		int row = ps.executeUpdate();
		System.out.println(row);
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
	
	/*
	 *  1.�����ݿⴴ�����ű��Ա���������ֶ����£�
	���ű�����ֶ��У����ű�ţ���������(Ψһ�Ҳ���Ϊ��)
	Ա��������ֶ��У�Ա����ţ�Ա������(Ψһ�Ҳ���Ϊ��)��Ա���Ա�Ա��ְλ��Ա�����ʣ���ְ���ڡ����ű��(���)
	 */
	public static void createTable() throws Exception{
		// �������ű�Sql
		String sql01 = "create table dept(id int primary key auto_increment,"
				+ "dept_name varchar(20) unique not null);";
		// ����Ա����Sql
		String sql02 = "create table employee(id int primary key auto_increment,"
				+ "name varchar(20) unique not null,"
				+ "gender varchar(2),"
				+ "post varchar(20),"
				+ "salary double,"
				+ "edate date,"
				+ "deptid int,"
				+ "constraint foreign key (deptid) references dept(id))";
		
		// ������Ӷ���
		Connection conn = JdbcUtil.getConnection();
		// ���PreparedStatement����
		Statement ps = conn.createStatement();
		// ����������ͬʱִ�ж���sql
		ps.addBatch(sql01);
		ps.addBatch(sql02);
		// �������ű��Ա����
		int[] row = ps.executeBatch();
		System.out.println(row.length);
		
		// �ر���Դ
		JdbcUtil.close(conn, ps);
	}
}
