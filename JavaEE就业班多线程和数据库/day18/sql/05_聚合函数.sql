/*
	count(列名) 记录数
*/
SELECT COUNT(pid) FROM product;
SELECT COUNT(*) FROM product;
/*
	sum(列名) 求和
*/
SELECT SUM(price) FROM product;
-- 查询 pid 为 1 3 4 5的价格的和
SELECT SUM(price) FROM product WHERE pid IN(1,3,4,5);
/*
	avg(列名) 求平均值 忽略null值
*/
-- 查询 pid 为 1 3 4 5 14 价格的平均值
SELECT AVG(price) FROM product WHERE pid IN(1,3,4,5,14);
/*
	max(列名) 最大值
	min(列名) 最小值
*/
-- 查询最大价格和最小价格
SELECT MAX(price),MIN(price) FROM product;

