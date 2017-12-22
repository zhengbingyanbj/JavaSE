package com.itheima.test03;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.utils.C3P0Utils;

public class Test03_01 {
	/*
	 1.在数据库创建部门表和员工表，包含字段如下：
	部门表包含字段有：部门编号，部门名称(唯一且不能为空)
	员工表包含字段有：员工编号，员工姓名(唯一且不能为空)，员工性别，员工职位，员工工资，入职日期。部门编号(外键)
	
	2.先添加多个部门数据，再添加多条员工数据
	
	3.编写方法接收一个员工编号和工资两个参数，方法内将指定编号的员工工资修改为新的工资。
	4.编写方法查询指定职位所有员工的信息，返回List<Employee>集合。
	5.编写方法查询指定姓名的员工信息，返回Employee对象。
	6.编写方法根据员工姓名删除指定的员工信息。
	7.编写方法查询所有姓张员工的工资并输出在控制台，输出格式如下：
		张三=10000
		张飞=20000
		…………………
	8.编写方法接收一个工资参数，方法内查询工资大于等于传入的工资的员工，返回符合条件所有员工信息List<Employee>集合。
	9.编写方法查询指定部门的所有员工信息，返回List<Employee>集合
	*/
	
	public static void main(String[] args)  throws Exception{
		// 创建表
		// createTable();
		
		// 1.添加部门数据
		// addDept();
		
		// 2.添加员工数据
		// addEmployees();
		
		// 3.修改id=2的员工工资为16000
		// updateSalary(2, 16000);
		
		// 4.获得所有员工信息
		/*List<Employee> employees = findAllEmployee();
		for (Employee employee : employees) {
			System.out.println(employee);
		} */
		
		// 5. 查询指定姓名的员工信息
		/*Employee e = findEmployeeByName("林青霞");
		System.out.println(e);*/
		
		
		// 6.删除name为林青霞的员工
		// System.out.println(deleteByName("林青霞"));
		
		// 7.编写方法查询所有姓张员工的工资并输出在控制台
		// querySalarys();
		
		// 8.查询工资大于10000的员工
		/*List<Employee> employees = findEmployeeBySalary(10000);
		for (Employee employee : employees) {
			System.out.println(employee);
		}*/
		
		// 9.编写方法查询指定部门的所有员工信息，返回List<Employee>集合
		List<Employee> employees = findEmployeeByDeptName("研发部");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	
	// 9.编写方法查询指定部门的所有员工信息，返回List<Employee>集合
	public static List<Employee> findEmployeeByDeptName(String deptName) throws SQLException {
		// 要执行的SQL语句
		String sql = "select * from employee where deptid in("
				+ "select id from dept where dept_name = ?"
				+ ");";
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行sql语句并返回结果
		return qr.query(sql, new BeanListHandler<>(Employee.class),deptName);
	}
	
	// 8.编写方法接收一个工资参数，方法内查询工资大于等于传入的工资的员工，
	// 返回符合条件所有员工信息List<Employee>集合。
	public static List<Employee> findEmployeeBySalary(double salary) throws SQLException {
		// 要执行的SQL语句
		String sql = "select * from employee where salary >= ?";
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行sql语句并返回结果
		return qr.query(sql, new BeanListHandler<>(Employee.class),salary);
	}
	
	// 7.编写方法查询所有姓张员工的工资并输出在控制台，输出格式如下：
	public static void  querySalarys() throws SQLException {
		//要执行的SQL语句
		String sql = "select salary,name from employee where name like'张%' ";
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行SQL语句并获得返回结果
		List<Employee> list = qr.query(sql, new BeanListHandler<>(Employee.class));
		// 遍历集合
		for (Employee employee : list) {
			System.out.println(employee.getName() + "=" + employee.getSalary());
		}
	}
	
	// 6.编写方法根据员工姓名删除指定的员工信息。
	public static boolean deleteByName(String name) throws SQLException{
		// 要执行的SQL语句
		String sql = "delete from employee where name = ?";
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行SQL语句并获得返回结果
		int row = qr.update(sql, name);
		return row == 1;
	}
	
	// 5.编写方法查询指定姓名的员工信息，返回Employee对象。
	public static Employee findEmployeeByName(String name) throws SQLException{
		// 要执行的SQL语句
		String sql = "select * from employee where name = ? " ;
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行SQL语句并获得返回结果
		return qr.query(sql,new BeanHandler<>(Employee.class),name);
	}
	
	// 4.编写方法查询指定职位所有员工的信息，返回List<Employee>集合。
	public static List<Employee> findAllEmployee() throws SQLException {
		// 要执行的SQL语句
		String sql = "select * from employee";
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行sql语句并返回结果
		return qr.query(sql, new BeanListHandler<>(Employee.class));
	}
	
	// 3.编写方法接收一个员工编号和工资两个参数，方法内将指定编号的员工工资修改为新的工资。
	public static void updateSalary(int id,double salary)  throws Exception {
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// Sql语句
		String sql = "update employee set salary = ? where id = ?;";
		// 执行SQL语句
		int row = qr.update(sql,salary,id);
		System.out.println("更新了"+row+"行记录");
	}
	
	// 添加多条员工数据
	public static void addEmployees() throws Exception{
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// SQL语句
		String sql = "insert into employee(name,gender,post,salary,edate,deptid) "
				+ "values('张三','男','Java研发工程师',9000,'2016-10-10',1),"
				+ "('林青霞','女','销售经理',15000,'2015-06-15',2),"
				+ "('李四','男','产品经理',10000,'2014-12-11',3),"
				+ "('张三丰','男','Android研发工程师',8000,'2017-05-26',1);";
		// 执行SQL语句
		int row = qr.update(sql);
		System.out.println("插入了"+row+"行记录");
	}
		
		
	// 添加多个部门数据
	public static void addDept() throws Exception{
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行的SQL语句
		String sql = "insert into dept(dept_name) values(?),(?),(?);";
		// 执行语句
		int row = qr.update(sql, new Object[]{"研发部","销售部","产品部"});
		System.out.println("插入了"+row+"行记录");
	}
	
	/*
	 *  1.在数据库创建部门表和员工表，包含字段如下：
	部门表包含字段有：部门编号，部门名称(唯一且不能为空)
	员工表包含字段有：员工编号，员工姓名(唯一且不能为空)，员工性别，员工职位，员工工资，入职日期。部门编号(外键)
	 */
	public static void createTable() throws Exception{
		// 创建部门表Sql
		String sql01 = "create table dept(id int primary key auto_increment,"
				+ "dept_name varchar(20) unique not null);";
		// 创建员工表Sql
		String sql02 = "create table employee(id int primary key auto_increment,"
				+ "name varchar(20) unique not null,"
				+ "gender varchar(2),"
				+ "post varchar(20),"
				+ "salary double,"
				+ "edate date,"
				+ "deptid int,"
				+ "constraint foreign key (deptid) references dept(id))";
		
		// 创建QueryRunner对象
		QueryRunner qr = new QueryRunner(C3P0Utils.getDataSource());
		// 执行创表SQL语句
		qr.update(sql01);
		qr.update(sql02);
	}
}
