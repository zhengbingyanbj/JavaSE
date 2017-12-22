需求1：多表练习
	1.1：创建角色表（role）：id、name
		 create table role (
		    id int primary key auto_increment,
		    name varchar(10)
		  )
		  
		添加三种角色
  			insert into role(name) values('总经理'),('经理'),('员工');
		
	1.2：创建权限表（privilege）：id、name
		 create table Privilege (
		    id int primary key auto_increment,
		    name varchar(10)
		  )
		  
		添加三种权限
		    insert into Privilege (name) values ('请假'),('审批请假'),('辞退员工');
		    
	1.3：创建角色权限表，中间表（role_privilege）：role_id、privilege_id
		 create table role_Privilege (
		    role_id int ,
		    Privilege_id int
		  )
				
	1.4：将角色表与权限表进行关联，创建外键约束
		为中间表的字段  role_id 添加外键约束
		ALTER TABLE role_Privilege ADD CONSTRAINT u_fk FOREIGN KEY (role_id) REFERENCES USER(role);
		
		为中间表的字段  Privilege_id 添加外键约束
		ALTER TABLE role_Privilege ADD CONSTRAINT p_fk FOREIGN KEY (Privilege_id) REFERENCES Privilege(id);
		
	
		
		
		
		
		
		