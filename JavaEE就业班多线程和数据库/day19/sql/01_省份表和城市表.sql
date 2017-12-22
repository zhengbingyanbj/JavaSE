CREATE DATABASE day19;

USE day19;
/*
	创建省份表
*/ 
CREATE TABLE province(
	pid INT PRIMARY	 KEY AUTO_INCREMENT,
	pname VARCHAR(100),
	description VARCHAR(100)
);
/*
	向省份表中添加数据
*/
INSERT INTO province(pname,description) VALUES
('吉林省','玉米'),
('辽宁省','大米好吃'),
('广东省','有钱,啥都吃');
/*
	创建城市表
*/
CREATE TABLE city(
	cid INT PRIMARY KEY AUTO_INCREMENT,
	cname VARCHAR(100),
	pid INT 
);
/*
	添加外键约束
	主表:province
	从表:city
	pid
*/
ALTER TABLE city ADD CONSTRAINT fk_pid FOREIGN KEY(pid)
REFERENCES province(pid);
/*
	向城市表中添加数据
*/
INSERT INTO city(cname,pid) VALUES
('吉林市',1),
('长春市',1),
('沈阳市',2),
('大连市',2),
('东莞市',3),
('珠海市',3);
/*
	向城市表中添加错误数据
	省份表中没有的pid
*/
#insert into city(cname,pid) values('北京市',110);

