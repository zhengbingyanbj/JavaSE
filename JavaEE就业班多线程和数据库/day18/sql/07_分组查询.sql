/*
	分组查询 
	group by 列名 
	对相同数据的进行分组 
	注意:
		1.分组的列需要查询出来
		2.分组查询必须和聚合函数结合使用
		3.分组查询前过滤条件 
			where  where后不能跟聚合函数
		  分组查询后过滤条件
			having having后可以跟聚合函数
	
*/

SELECT pname,SUM(price) FROM product GROUP BY pname;
/*
	分组后 查询价格和大于2000的商品
*/
#select pname,sum(price) from product  WHERE price>=2000 group by pname ; 分组前过滤
SELECT pname,SUM(price) FROM product GROUP BY pname HAVING SUM(price) >=2000;
SELECT pname,SUM(price) p FROM product GROUP BY pname HAVING p >=2000 ORDER BY p DESC;

