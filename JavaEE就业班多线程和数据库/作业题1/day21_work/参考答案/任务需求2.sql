-- 多表查询练习
		-- 创建分类表：
		CREATE TABLE category(
			cid varchar(32) PRIMARY KEY,#主键ID
			cname VARCHAR(20)#分类名称
		);
		
		INSERT INTO category VALUES('c001','电脑办公');
		INSERT INTO category VALUES('c002','服装');
		-- 创建商品表：
		
		CREATE TABLE product(
			pid INT PRIMARY KEY,#主键ID
			pname VARCHAR(20),#商品名称
			price DOUBLE,#商品价格
			category_cid VARCHAR(32)#外键
		);
		
		-- 导入数据
		INSERT INTO product(pid,pname,price,category_cid) VALUES(1,'联想电脑',5000,'c001');
		INSERT INTO product(pid,pname,price,category_cid) VALUES(2,'海尔电脑',3000,'c001');
		INSERT INTO product(pid,pname,price,category_cid) VALUES(3,'雷神电脑',5000,'c001');
		
		INSERT INTO product(pid,pname,price,category_cid) VALUES(4,'JACK JONES',800,'c002');
		INSERT INTO product(pid,pname,price,category_cid) VALUES(5,'真维斯',200,'c002');
		INSERT INTO product(pid,pname,price,category_cid) VALUES(6,'花花公子',440,'c002');
		INSERT INTO product(pid,pname,price,category_cid) VALUES(7,'劲霸',2000,'c002');
		
		-- 为product表 添加外键约束
		alter table product add constraint p_fk foreign key (category_cid) references category(cid);

-- 写出交叉查询的SQL
	 -- 答：交叉连接查询(基本不会使用-得到的是两个表的乘积，笛卡尔积)
		SELECT * FROM category c , product p;
		
-- 写出两种 内连接查询的SQL (使用的关键字 inner join  -- inner可以省略)
	-- 隐式内连接：
		SELECT * FROM category c , product p WHERE c.cid = p.category_cid;
	-- 显示内连接：
		SELECT * FROM category c INNER JOIN product p ON c.cid = p.category_cid;
	-- 注意：内连接书写极为简单，效率不高，内存占用率偏高
		
-- 外连接查询(使用的关键字 outer join -- outer可以省略)
	-- 左外连接：left outer join
		SELECT * FROM product p 
			LEFT JOIN category c ON p.`category_cid` = c.cid;
			
	-- 右外连接：right outer join	
		SELECT * FROM product p 
			right JOIN category c ON p.`category_cid` = c.cid;
		
-- 子查询 （将其他select的查询结果，作为select的查询条件。）
	--	格式：进行select嵌套。
	--	例如：select 字段 from 表名 where (select 字段 from 表名…..)…..
	--	例如：select 字段 from (select 字段 from 表);
	
	--#查询最贵的商品信息
	SELECT * FROM product WHERE price = (SELECT MAX(price) FROM product);
	
	
	
	
	
	
	
	
	
	
	