需求1：多表练习
	1.1：为甚么使用多表操作？
		 答：为了使数据的使用和维护更加的方便
	
	3.2：表与表之间如何产生联系？
		 答：表与表之间依靠外键产生联系。
	
	3.3：多表关系中是存在主表和从表的，那么什么是主表，什么是从表。
		答：
			主表 ：数据来源表,主键ID所在的表
				例如：分类表----是分类名称数据的来源表，主键CID所在表
			从表: 数据引用表,外键所在的表
				例如：商品表---引用了分类表数据，外键category_cid所在表
	3.4：外键的特点？
		从表外键指向了主表的主键。
		从表的外键的数据类型和长度 与主表的主键的数据类型一致。

	3.5：什么是外键约束？
			问题1：从表尝试引用主表不存在的数据
			问题2：主表尝试删除从表引用的数据
		
		使用外键约束解决上述问题：
			答：强制性约束，强制保证外键数据完整
				
需求2：多表关系
	2.1:一对多关系（分类表与商品表）。
			#创建分类表
			create table category(
			  cid varchar(32) PRIMARY KEY ,
			  cname varchar(100)		#分类名称
			);
			
			# 商品表
			CREATE TABLE `products` (
			  `pid` varchar(32) PRIMARY KEY  ,
			  `name` VARCHAR(40) ,
			  `price` DOUBLE 
			);
			
			#添加外键字段
			alter table products add column category_id varchar(32);
			
			#添加约束
			alter table products add constraint product_fk foreign key (category_id) references category (cid);
			
			4.3.3	操作
			#1 向分类表中添加数据
			INSERT INTO category (cid ,cname) VALUES('c001','服装');
			
			#2 向商品表添加普通数据,没有外键数据，默认为null
			INSERT INTO products (pid,name) VALUES('p001','商品名称');
			
			#3 向商品表添加普通数据，含有外键信息(category表中存在这条数据)
			INSERT INTO products (pid ,name ,category_id) VALUES('p002','商品名称2','c001');
			
			#4 向商品表添加普通数据，含有外键信息(category表中不存在这条数据) -- 失败,异常
			INSERT INTO products (pid ,name ,category_id) VALUES('p003','商品名称2','c999');
			
			#5 删除指定分类(分类被商品使用) -- 执行异常
			DELETE FROM category WHERE cid = 'c001';
			
需求3 ：商品表和订单表是多对多关系，请尝试书写建表语句，并加入外键约束:
		# 商品表[已存在]
		
		# 订单表
			create table `orders`(
			  `oid` varchar(32) PRIMARY KEY ,
			  `totalprice` double 	#总计
			);
		
		# 订单项表
			create table orderitem(
			  oid varchar(50),-- 订单id
			  pid varchar(50)-- 商品id
			);
		
		#---- 订单表和订单项表的主外键关系
			alter table `orderitem` add constraint orderitem_orders_fk foreign key (oid) references orders(oid);
		
		#---- 商品表和订单项表的主外键关系
			alter table `orderitem` add constraint orderitem_product_fk foreign key (pid) references products(pid);
		
		# 联合主键（可省略）
			alter table `orderitem` add primary key (oid,pid);
		
		
		4.4.3	操作
		#1 向商品表中添加数据
			INSERT INTO products (pid,pname) VALUES('p003','商品名称');
		
		#2 向订单表中添加数据
			INSERT INTO orders (oid ,totalprice) VALUES('x001','998');
			INSERT INTO orders (oid ,totalprice) VALUES('x002','100');
		
		#3向中间表添加数据(数据存在)
			INSERT INTO orderitem(pid,oid) VALUES('p001','x001');
			INSERT INTO orderitem(pid,oid) VALUES('p001','x002');
			INSERT INTO orderitem(pid,oid) VALUES('p002','x002');
			
		#4删除中间表的数据
			DELETE FROM orderitem WHERE pid='p002' AND oid = 'x002';
		
		#5向中间表添加数据(数据不存在) -- 执行异常
			INSERT INTO orderitem(pid,oid) VALUES('p002','x003');
		
		#6删除商品表的数据 -- 执行异常
			DELETE FROM products WHERE pid = 'p001';

		
		
		