����1�������ϰ
	1.1��������ɫ��role����id��name
		 create table role (
		    id int primary key auto_increment,
		    name varchar(10)
		  )
		  
		������ֽ�ɫ
  			insert into role(name) values('�ܾ���'),('����'),('Ա��');
		
	1.2������Ȩ�ޱ�privilege����id��name
		 create table Privilege (
		    id int primary key auto_increment,
		    name varchar(10)
		  )
		  
		�������Ȩ��
		    insert into Privilege (name) values ('���'),('�������'),('����Ա��');
		    
	1.3��������ɫȨ�ޱ��м��role_privilege����role_id��privilege_id
		 create table role_Privilege (
		    role_id int ,
		    Privilege_id int
		  )
				
	1.4������ɫ����Ȩ�ޱ���й������������Լ��
		Ϊ�м����ֶ�  role_id ������Լ��
		ALTER TABLE role_Privilege ADD CONSTRAINT u_fk FOREIGN KEY (role_id) REFERENCES USER(role);
		
		Ϊ�м����ֶ�  Privilege_id ������Լ��
		ALTER TABLE role_Privilege ADD CONSTRAINT p_fk FOREIGN KEY (Privilege_id) REFERENCES Privilege(id);
		
	
		
		
		
		
		
		