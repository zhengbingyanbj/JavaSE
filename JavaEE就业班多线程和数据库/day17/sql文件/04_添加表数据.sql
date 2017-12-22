/*
	向数据库表添加数据
	insert into 表名(列名1,列名2...) values(值1,值2..);
	注意:列名和列值要一一对应 数据类型相同 个数相同
		 除了数字类型 其他任何类型都需要使用"" 或者''包裹
		 推荐使用''
		 
*/
INSERT INTO category(cid,cname) VALUES(1,'服装');
/*
	由于我们已经设置主键自动增长
	可以忽略主键添加
*/
INSERT INTO category(cname) VALUES('家电');
/*
	全列值添加
	insert into 表名 values(全列值);
*/
INSERT INTO category VALUES(NULL,'化妆品');
/*
	批量添加
	insert into 表名(列名1,列名2...) values(值1,值2..),(值1,值2..),(值1,值2..);
*/
INSERT INTO category(cname) VALUES
('数码'),
('黄瓜'),
('娃哈哈');