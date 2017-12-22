需求1：子查询的练习
1.1 创建部门表(id,name) 
    创建部门表
		create table dept(
			id int primary key auto_increment,
			name varchar(20)
		)
		
		insert into dept (name) values ('开发部'),('市场部'),('财务部');

1.2 员工表，员工表(id, 姓名，性别，工资，入职日期，部门ID)
      创建员工表
		create table employee (
			id int primary key auto_increment,
			name varchar(10),
			gender char(1),   -- 性别
			salary double,   -- 工资
			join_date date,  -- 入职日期
			dept_id int,
			foreign key (dept_id) references dept(id) -- 外键，关联部门表(部门表的主键)
		)	
1.3：写入数据
	insert into employee(name,gender,salary,join_date,dept_id) values('孙悟空','男',7200,'2013-02-24',1);
	insert into employee(name,gender,salary,join_date,dept_id) values('猪八戒','男',3600,'2010-12-02',2);
	insert into employee(name,gender,salary,join_date,dept_id) values('唐僧','男',9000,'2008-08-08',2);
	insert into employee(name,gender,salary,join_date,dept_id) values('白骨精','女',5000,'2015-10-07',3);
	insert into employee(name,gender,salary,join_date,dept_id) values('蜘蛛精','女',4500,'2011-03-14',1);

需求2：按要求进行查询

	1) 查询工资最高的员工是谁？
		select * from employee where salary = (select max(salary) from employee);

	2) 查询工资小于平均工资的员工有哪些？
		2.1) 查询平均工资
				select avg(salary) from employee;
		2.2) 小于平均工资的员工
				select * from employee where salary < (select avg(salary) from employee);

	3) 查询大于5000的员工，来至于哪些部门，输出部门的名字
		3.1) 查询大于5000的员工，来至于哪些部门的id
			select dept_id from employee where salary >5000;

		3.2) 外查询  Subquery returns more than 1 row
			select d.* from dept d where d.id in  (select dept_id from employee where salary >5000);

	4) 查询开发部与财务部所有的员工信息
		4.1) 子查询
			select * from employee where dept_id in (select d.id from dept d where d.name='开发部' or d.name='财务部');

		4.2) 表连接
		select e.* from employee e inner join dept d on e.dept_id = d.id where d.name='开发部' or d.name='财务部';




