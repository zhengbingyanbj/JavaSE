/*
	排序
	order by 列名 [ASC][DESC]
	ASC:升序排列 默认升序不写也行
	desc:降序排列
	
	查询后再排序 所以order by 通常写在语句的末尾
*/
/*
	查询所有记录 按照价格升序排列
*/
SELECT * FROM product ORDER BY price;
SELECT * FROM product ORDER BY price ASC;
/*
	查询id为 1 3 5 7商品的记录 按照价格降序排列
*/
SELECT * FROM product WHERE pid IN(1,3,5,7) ORDER BY price DESC;
