����1���Ӳ�ѯ����ϰ
1.1 �������ű�(id,name) 
    �������ű�
		create table dept(
			id int primary key auto_increment,
			name varchar(20)
		)
		
		insert into dept (name) values ('������'),('�г���'),('����');

1.2 Ա����Ա����(id, �������Ա𣬹��ʣ���ְ���ڣ�����ID)
      ����Ա����
		create table employee (
			id int primary key auto_increment,
			name varchar(10),
			gender char(1),   -- �Ա�
			salary double,   -- ����
			join_date date,  -- ��ְ����
			dept_id int,
			foreign key (dept_id) references dept(id) -- ������������ű�(���ű������)
		)	
1.3��д������
	insert into employee(name,gender,salary,join_date,dept_id) values('�����','��',7200,'2013-02-24',1);
	insert into employee(name,gender,salary,join_date,dept_id) values('��˽�','��',3600,'2010-12-02',2);
	insert into employee(name,gender,salary,join_date,dept_id) values('��ɮ','��',9000,'2008-08-08',2);
	insert into employee(name,gender,salary,join_date,dept_id) values('�׹Ǿ�','Ů',5000,'2015-10-07',3);
	insert into employee(name,gender,salary,join_date,dept_id) values('֩�뾫','Ů',4500,'2011-03-14',1);

����2����Ҫ����в�ѯ

	1) ��ѯ������ߵ�Ա����˭��
		select * from employee where salary = (select max(salary) from employee);

	2) ��ѯ����С��ƽ�����ʵ�Ա������Щ��
		2.1) ��ѯƽ������
				select avg(salary) from employee;
		2.2) С��ƽ�����ʵ�Ա��
				select * from employee where salary < (select avg(salary) from employee);

	3) ��ѯ����5000��Ա������������Щ���ţ�������ŵ�����
		3.1) ��ѯ����5000��Ա������������Щ���ŵ�id
			select dept_id from employee where salary >5000;

		3.2) ���ѯ  Subquery returns more than 1 row
			select d.* from dept d where d.id in  (select dept_id from employee where salary >5000);

	4) ��ѯ��������������е�Ա����Ϣ
		4.1) �Ӳ�ѯ
			select * from employee where dept_id in (select d.id from dept d where d.name='������' or d.name='����');

		4.2) ������
		select e.* from employee e inner join dept d on e.dept_id = d.id where d.name='������' or d.name='����';




