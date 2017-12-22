/*
	查询
	select 列名,列名 from 表名 [where 条件]
*/
-- 查询所有
SELECT pid,pname,price FROM product;
SELECT * FROM product;
/*
	去重 
	distinct 列名
	查询所有价格 去掉重复价格
*/
SELECT DISTINCT  price FROM product;
/*
	计算
	查询所有记录，价格上涨1000块
*/
SELECT pid,pname,price+1000 FROM product;
/*
	别名
	列名 as '别名'
*/
SELECT pid,pname,price+1000 AS '商品价格' FROM product;
SELECT pid,pname,price+1000 'price' FROM product;
SELECT pid,pname,price+1000 p FROM product;
SELECT pid,pname,price+1000 'p p' FROM product;
