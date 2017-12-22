/*
	修改表 添加列
	alter table 表名 add 列名 数据类型(长度) [约束];
	
	给分类表添加一列数据  desc varchar(100)
*/
ALTER TABLE category ADD `desc` VARCHAR(100);
/*
	修改列 数据类型
	将desc的类型改为int类型
	
	alter table 表名 modify 列名 数据类型(长度) [约束];
*/
ALTER TABLE category MODIFY `desc` INT;
/*
	修改列  修改列名 数据类型 约束
	将desc的列 改为 description varchar(100) not null
	
	alter table 表名 change 旧列名 新列名 数据类型(长度) [约束];
*/
ALTER TABLE category CHANGE `desc` description VARCHAR(100) NOT NULL;
/*
	删除非空约束
*/
ALTER TABLE category MODIFY description VARCHAR(100);
/*
	删除列
	alter table 表名 drop 列名;
*/
ALTER TABLE category DROP description;
/*
	修改表名
	rename table 旧表名 to 新表名;
*/
RENAME TABLE c TO category;
