package com.itheima.test03;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.utils.C3P0Utils;

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
		
		// 1.��Ӳ�������
		// addDept();
		
		// 2.���Ա������
		// addEmployees();
		
		// 3.�޸�id=2��Ա������Ϊ16000
		// updateSalary(2, 16000);
		
		// 4.�������Ա����Ϣ
		/*List<Employee> employees = findAllEmployee();
		for (Employee employee : employees) {
			System.out.println(employee);
		} */
		
		// 5. ��ѯָ��������Ա����Ϣ
		/*Employee e = findEmployeeByName("����ϼ");
		System.out.println(e);*/
		
		
		// 6.ɾ��nameΪ����ϼ��Ա��
		// System.out.println(deleteByName("����ϼ"));
		
		// 7.��д������ѯ��������Ա���Ĺ��ʲ�����ڿ���̨
		// querySalarys();
		
		// 8.��ѯ���ʴ���10000��Ա��
		/*List<Employee> employees = findEmployeeBySalary(10000);
		for (Employee employee : employees) {
			System.out.println(employee);
		}*/
		
		// 9.��д������ѯָ�����ŵ�����Ա����Ϣ������List<Employee>����
		List<Employee> employees = findEmployeeByDeptName("�з���");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	// 9.��д������ѯָ�����ŵ�����Ա����Ϣ������List<Employee>����
	public static List<Employee> findEmployeeByDeptName(String deptName) throws SQLException {
		// Ҫִ�е�SQL���
		String sql = "select * from employee where deptid in("
				+ "select id from dept where dept_name = ?"
				+ ");";
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ��sql��䲢���ؽ��
		return qr.query(sql, new BeanListHandler<>(Employee.class),deptName);
	}
	
	// 8.��д��������һ�����ʲ����������ڲ�ѯ���ʴ��ڵ��ڴ���Ĺ��ʵ�Ա����
	// ���ط�����������Ա����ϢList<Employee>���ϡ�
	public static List<Employee> findEmployeeBySalary(double salary) throws SQLException {
		// Ҫִ�е�SQL���
		String sql = "select * from employee where salary >= ?";
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ��sql��䲢���ؽ��
		return qr.query(sql, new BeanListHandler<>(Employee.class),salary);
	}
	
	// 7.��д������ѯ��������Ա���Ĺ��ʲ�����ڿ���̨�������ʽ���£�
	public static void  querySalarys() throws SQLException {
		//Ҫִ�е�SQL���
		String sql = "select salary,name from employee where name like'��%' ";
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ��SQL��䲢��÷��ؽ��
		List<Employee> list = qr.query(sql, new BeanListHandler<>(Employee.class));
		// ��������
		for (Employee employee : list) {
			System.out.println(employee.getName() + "=" + employee.getSalary());
		}
	}
	
	// 6.��д��������Ա������ɾ��ָ����Ա����Ϣ��
	public static boolean deleteByName(String name) throws SQLException{
		// Ҫִ�е�SQL���
		String sql = "delete from employee where name = ?";
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ��SQL��䲢��÷��ؽ��
		int row = qr.update(sql, name);
		return row == 1;
	}
	
	// 5.��д������ѯָ��������Ա����Ϣ������Employee����
	public static Employee findEmployeeByName(String name) throws SQLException{
		// Ҫִ�е�SQL���
		String sql = "select * from employee where name = ? " ;
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ��SQL��䲢��÷��ؽ��
		return qr.query(sql,new BeanHandler<>(Employee.class),name);
	}
	
	// 4.��д������ѯָ��ְλ����Ա������Ϣ������List<Employee>���ϡ�
	public static List<Employee> findAllEmployee() throws SQLException {
		// Ҫִ�е�SQL���
		String sql = "select * from employee";
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ��sql��䲢���ؽ��
		return qr.query(sql, new BeanListHandler<>(Employee.class));
	}
	
	// 3.��д��������һ��Ա����ź͹������������������ڽ�ָ����ŵ�Ա�������޸�Ϊ�µĹ��ʡ�
	public static void updateSalary(int id,double salary)  throws Exception {
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// Sql���
		String sql = "update employee set salary = ? where id = ?;";
		// ִ��SQL���
		int row = qr.update(sql,salary,id);
		System.out.println("������"+row+"�м�¼");
	}
	
	// ��Ӷ���Ա������
	public static void addEmployees() throws Exception{
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// SQL���
		String sql = "insert into employee(name,gender,post,salary,edate,deptid) "
				+ "values('����','��','Java�з�����ʦ',9000,'2016-10-10',1),"
				+ "('����ϼ','Ů','���۾���',15000,'2015-06-15',2),"
				+ "('����','��','��Ʒ����',10000,'2014-12-11',3),"
				+ "('������','��','Android�з�����ʦ',8000,'2017-05-26',1);";
		// ִ��SQL���
		int row = qr.update(sql);
		System.out.println("������"+row+"�м�¼");
	}
		
		
	// ��Ӷ����������
	public static void addDept() throws Exception{
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ�е�SQL���
		String sql = "insert into dept(dept_name) values(?),(?),(?);";
		// ִ�����
		int row = qr.update(sql, new Object[]{"�з���","���۲�","��Ʒ��"});
		System.out.println("������"+row+"�м�¼");
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
		
		// ����QueryRunner����
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// ִ�д���SQL���
		qr.update(sql01);
		qr.update(sql02);
	}
}
