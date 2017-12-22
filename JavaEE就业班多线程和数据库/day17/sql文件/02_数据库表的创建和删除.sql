/*
	创建数据库表
	create table 表名(
		列名 数据类型(长度) [约束],
		列名 数据类型(长度) [约束],
		列名 数据类型(长度) [约束]
	);
	约束:限制当前列的数据
	主键约束:primary key 限制当前列非空 唯一
	注意:
		主键约束，一个表应该有一个主键约束，
		并且只能有一个。一般情况添加主键约束
		给没有涉及业务逻辑的列添加 一般都是id列
		
	自动增长:可以为主键设置自动增长 auto_increment
			 如果设置了自动增长，那么主键列不需要我们来维护
			 Mysql会自动维护主键列
		
	
	创建一个分类表 id 分类名
*/
CREATE TABLE category(
	cid INT PRIMARY KEY AUTO_INCREMENT ,
	cname VARCHAR(100)
);

/*
	查看当前数据库中所有的表
*/
SHOW TABLES;
/*
	查看表结构
*/
DESC category;
/*
	删除表
*/
DROP TABLE category;
