--����1��DDL-�������ݿ�ṹ���˽⣩
--		#�������ݿ�day19_1 
		create database day19_1;
			
--		#�л���day19_1���ݿ�
		use day19_1;
--		
--		#�鿴��ǰ���ڲ����ĸ����ݿ�
		SELECT DATABASE();
--			
--		#�鿴�������µ��������ݿ�
		SHOW DATABASES;
--		
--		#�鿴day19_1���ݿ�Ķ�����Ϣ
		SHOW CREATE DATABASE day19_1;
--			
--		#ɾ��day19_1���ݿ�
		drop database day19_1;
--			
--����1��DDL-�������ݱ��
--		
--		/*
--		1�����������
--		��������ƣ�category
--			��������У�����ID�ͷ������������ֶ�
--			����ID��cid,Ϊ���ͣ���Ϊ����
--			�������ƣ�cname,Ϊ�ַ������ͣ����������д100���ȵ��ַ���
--		
		CREATE TABLE category(
			cid VARCHAR(10) PRIMARY KEY,
			cname VARCHAR(100)
		);

--		2���������Ա�
--		���Ա����ƣ�test1
--			���Ա����У�����ID�Ͳ���ʱ�������ֶ�
--			����ID��tid,Ϊ���ͣ���Ϊ����
--			����ʱ�䣺tdate,Ϊ�����յ��������� 

		CREATE TABLE test1(
			tid INT PRIMARY KEY,
			tdate DATE
		);
			
--		#�鿴��ǰ���ݿ�������Щ��
		show tables;
		
--		#�鿴category��ı�ṹ
		DESC category;
		
--		#ɾ�����Ա�test1
		DROP TABLE test1;
		
--		#1��Ϊ��������һ���µ��ֶ�Ϊ �������� cdesc varchar(20)
		ALTER TABLE category ADD cdesc VARCHAR(20);
--		
--		#2, Ϊ�����������ֶν����޸ģ�����varchar(50) 
		ALTER TABLE category MODIFY cdesc VARCHAR(50);
		
--		#3, Ϊ�����ķ��������ֶν��и��� ����Ϊ description varchar(30)
		ALTER TABLE category CHANGE cdesc description VARCHAR(30);
		
--		#4, ɾ���������description����
		ALTER TABLE category DROP description;
--		
--		#5, Ϊ�����category ������ category2
		RENAME TABLE category TO category2;
		
--���� 3��DML-���±��¼����ɾ�ģ�
--
--	#1,������category��,��������10������,��������10������
			INSERT INTO category(cid,cname) VALUES('c001','����');
			INSERT INTO category(cid,cname) VALUES('c002','����');
			INSERT INTO category(cid,cname) VALUES('c003','��ױƷ');
			INSERT INTO category(cid,cname) VALUES('c004','�鼮');
			INSERT INTO category(cid) VALUES('c005');
			INSERT INTO category(cname,cid) VALUES('�Ĳ�','c006');

--	#2,�޸ģ�category
--			1���޸�cidΪ'c001'�ļ�¼,��cname�޸�Ϊ 'С��'
			update category set cname = 'С��' where cid = 'c001';
			
--			2���޸�cnameΪ '����'�ļ�¼,��cname �޸�Ϊ'����'
			update category set cname = '����' where cname = '����';

--	#2,ɾ����category
--			1��ɾ��cidΪ'c001'�ļ�¼
			delete from category  where cid = 'c001'; 
			
--			2��ɾ��cnameΪ'�鼮'�ļ�¼
			delete from category  where cname = '�鼮'; 



