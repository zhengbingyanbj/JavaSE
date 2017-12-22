#创建数据库
CREATE DATABASE day20;
#使用数据库
USE day20;
###创建分类表
CREATE TABLE category(
   cid INT PRIMARY KEY AUTO_INCREMENT ,
   cname VARCHAR(100)
);
#初始化数据
INSERT INTO category (cname) VALUES('家电');
INSERT INTO category (cname) VALUES('服饰');
INSERT INTO category (cname) VALUES('化妆品');

DELETE FROM category WHERE cid = 3;

UPDATE category SET cname='蔬菜' WHERE cid = 3;

SELECT cid,cname FROM category;


CREATE TABLE users(
	uid INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(100),
	PASSWORD VARCHAR(100)
);

SELECT * FROM users WHERE username='liuyan' AND PASSWORD ='1234';
SELECT * FROM users WHERE TRUE;
