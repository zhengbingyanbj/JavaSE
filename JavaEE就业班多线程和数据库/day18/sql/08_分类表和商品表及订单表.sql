/*
	创建分类表
*/
CREATE TABLE category(
	cid INT PRIMARY KEY AUTO_INCREMENT,
	cname VARCHAR(100)
);
/*
	向分类表中添加数据
*/
INSERT INTO category(cname) VALUES
('家电'),
('饮品'),
('服装'),
('水果');
/*
	创建商品表
*/
CREATE TABLE product(
	pid INT PRIMARY KEY AUTO_INCREMENT,
	pname VARCHAR(100),
	price DOUBLE,
	cid INT
);
/*
	为从表的cid添加外键
	主表:category
	从表:product
	从表外键:cid
	alter table 从表 add constraint 外键名(自定义) foreign key(从表外键)
	references 主表(列名)；
*/
ALTER TABLE product ADD CONSTRAINT fk_cid FOREIGN KEY(cid)
REFERENCES category(cid);
/*
	向商品表中添加数据
*/
INSERT INTO product(pname,price,cid) VALUES
('冰箱',8000,1),
('彩电',7800,1),
('洗衣机',5000,1),
('娃哈哈',10,2),
('冰红茶',3,2);
/*
	向商品表中添加错误数据
	分类表中没有的cid
*/
#INSERT INTO product(pname,price,cid) VALUES('黄瓜',100,10);





/*
	创建订单表
*/
CREATE TABLE orders(
	oid INT PRIMARY KEY AUTO_INCREMENT,
	totalprice DOUBLE
);
/*
	向订单表中添加数据
*/
INSERT INTO orders(totalprice) VALUES
(15800),
(13000),
(8010),
(13),
(7803);

/*
	创建中间表
*/
CREATE TABLE pro_ord(
	pid INT ,
	oid INT
);
/*
	外键约束
	主表:product
	从表:pro_ord
	外键:pid
*/
ALTER TABLE pro_ord ADD CONSTRAINT fk_pro_pid FOREIGN KEY(pid)
REFERENCES product(pid);
/*
	主表:orders
	从表:pro_ord
	外键:oid
*/
ALTER TABLE pro_ord ADD CONSTRAINT fk_ord_oid FOREIGN KEY(oid)
REFERENCES orders(oid);
/*
	向中间表中添加数据
*/
INSERT INTO pro_ord(pid,oid) VALUES
(1,1),
(1,2),
(1,3),
(4,4),
(5,4);

/*
	向中间表中添加错误数据
	商品表中没有的pid 或者 订单表中没有的oid
*/
#INSERT INTO pro_ord(pid,oid) VALUES(100,200);
