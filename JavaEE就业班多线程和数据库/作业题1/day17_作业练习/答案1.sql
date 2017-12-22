--需求1：DDL-操作数据库结构（了解）
--		#创建数据库day19_1 
		create database day19_1;
			
--		#切换到day19_1数据库
		use day19_1;
--		
--		#查看当前正在操作哪个数据库
		SELECT DATABASE();
--			
--		#查看服务器下的所有数据库
		SHOW DATABASES;
--		
--		#查看day19_1数据库的定义信息
		SHOW CREATE DATABASE day19_1;
--			
--		#删除day19_1数据库
		drop database day19_1;
--			
--需求1：DDL-操作数据表结
--		
--		/*
--		1、创建分类表
--		分类表名称：category
--			分类表中有：分类ID和分类名称两个字段
--			分类ID：cid,为整型，且为主键
--			分类名称：cname,为字符串类型，最大允许填写100长度的字符串
--		
		CREATE TABLE category(
			cid VARCHAR(10) PRIMARY KEY,
			cname VARCHAR(100)
		);

--		2、创建测试表
--		测试表名称：test1
--			测试表中有：测试ID和测试时间两个字段
--			测试ID：tid,为整型，且为主键
--			测试时间：tdate,为年月日的日期类型 

		CREATE TABLE test1(
			tid INT PRIMARY KEY,
			tdate DATE
		);
			
--		#查看当前数据库中有哪些表
		show tables;
		
--		#查看category表的表结构
		DESC category;
		
--		#删除测试表test1
		DROP TABLE test1;
		
--		#1，为分类表添加一个新的字段为 分类描述 cdesc varchar(20)
		ALTER TABLE category ADD cdesc VARCHAR(20);
--		
--		#2, 为分类表的描述字段进行修改，类型varchar(50) 
		ALTER TABLE category MODIFY cdesc VARCHAR(50);
		
--		#3, 为分类表的分类名称字段进行更换 更换为 description varchar(30)
		ALTER TABLE category CHANGE cdesc description VARCHAR(30);
		
--		#4, 删除分类表中description这列
		ALTER TABLE category DROP description;
--		
--		#5, 为分类表category 改名成 category2
		RENAME TABLE category TO category2;
		
--需求 3：DML-更新表记录（增删改）
--
--	#1,向分类表：category中,单个插入10条数据,批量插入10条数据
			INSERT INTO category(cid,cname) VALUES('c001','电器');
			INSERT INTO category(cid,cname) VALUES('c002','服饰');
			INSERT INTO category(cid,cname) VALUES('c003','化妆品');
			INSERT INTO category(cid,cname) VALUES('c004','书籍');
			INSERT INTO category(cid) VALUES('c005');
			INSERT INTO category(cname,cid) VALUES('耗材','c006');

--	#2,修改：category
--			1、修改cid为'c001'的记录,将cname修改为 '小明'
			update category set cname = '小明' where cid = 'c001';
			
--			2、修改cname为 '电器'的记录,将cname 修改为'乐器'
			update category set cname = '乐器' where cname = '电器';

--	#2,删除：category
--			1、删除cid为'c001'的记录
			delete from category  where cid = 'c001'; 
			
--			2、删除cname为'书籍'的记录
			delete from category  where cname = '书籍'; 



