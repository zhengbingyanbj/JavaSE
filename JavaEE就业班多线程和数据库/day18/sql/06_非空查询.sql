/*
	非空查询
*/
-- 查询价格为null的商品
SELECT * FROM product WHERE price IS NULL;
-- 查询价格不为null的商品
SELECT * FROM product WHERE price IS NOT NULL;
SELECT * FROM product WHERE NOT(price IS NULL);
