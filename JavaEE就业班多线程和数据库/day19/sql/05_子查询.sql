/*
	子查询 
	一条语句的查询结果作为另一条查询语句的条件
*/
/*
	查询所有化妆品的记录
*/
SELECT * FROM products WHERE category_id='c003';
SELECT cid FROM category WHERE cname='化妆品';

SELECT * FROM products WHERE category_id=
	(SELECT cid FROM category WHERE cname='化妆品');
	

/*
	查询所有化妆品的记录 使用内连接
*/
SELECT * FROM category c ,products p WHERE c.cid = p.category_id AND c.cname='化妆品';
	
/*
	将查询到的结果作为一张伪表
*/
SELECT * FROM 
	(SELECT * FROM category WHERE cname ='化妆品') c,products p
	WHERE c.cid = p.category_id
	
/*
	使用子查询 一张表的查询结果作为另外一张表的条的方式 
	查询出所有化妆品和服饰的记录
*/
SELECT * FROM products WHERE category_id IN
	(SELECT cid FROM category WHERE cname='化妆品' OR cname ='服饰');
/*
	使用伪表的方式 查询出所有化妆品和服饰的记录
*/
SELECT * FROM 
	(SELECT * FROM category WHERE cname='化妆品' OR cname='服饰') c,products p
	WHERE c.cid = p.category_id;




