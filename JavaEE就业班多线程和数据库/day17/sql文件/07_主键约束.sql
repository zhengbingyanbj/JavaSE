/*
	主键约束
	PRIMARY KEY 约束唯一标识数据库表中的每条记录。
	主键必须包含唯一的值。
	主键列不能包含 NULL 值。
	每个表都应该有一个主键，并且每个表只能有一个主键。
	一般给不涉及业务逻辑的列添加主键 一般是id列
*/
/*
	添加主键约束方式1
*/
CREATE TABLE Persons
(
	pid INT PRIMARY KEY,
	pname VARCHAR(100)
);
/*
	方式2 
	constraint区域添加
	
	[CONSTRAINT 主键名(自定义)] primary key(列名)
*/
CREATE TABLE Persons
(
	pid INT,
	pname VARCHAR(100),
	CONSTRAINT pk_pid PRIMARY KEY(pid)
);
/*
	删除主键
*/
ALTER TABLE Persons DROP PRIMARY KEY;
/*
	方式3
	修改表结构方式添加
	alter table 表名 add constraint 主键名 primary key(列名);
*/
ALTER TABLE Persons ADD CONSTRAINT pk_pid PRIMARY KEY(pid);

/*
	联合主键 
	两列作为一个主键
*/
CREATE TABLE Persons(
	pid INT,
	firstName VARCHAR(100),
	lastName VARCHAR(100)
);
-- 设置联合主键
ALTER TABLE Persons ADD CONSTRAINT pk_pid PRIMARY KEY(firstname,lastName);

