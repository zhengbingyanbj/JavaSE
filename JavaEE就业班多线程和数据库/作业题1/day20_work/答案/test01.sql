-- 需求1：单表操作-创建商品表,product(复制：工程根目录下的SQL文件夹，建表语句单表.txt)
		
		#查询商品名称为“花花公子”的商品所有信息：
    	SELECT * FROM product WHERE pname = '花花公子'

		#查询价格为800商品
		SELECT * FROM product WHERE price = 800

		#查询价格不是800的所有商品
		SELECT * FROM product WHERE price != 800
		SELECT * FROM product WHERE price <> 800
		SELECT * FROM product WHERE NOT(price = 800)

		#查询商品价格大于60元的所有商品信息
		SELECT * FROM product WHERE price > 60;


		#查询商品价格在200到1000之间所有商品
		SELECT * FROM product WHERE price >= 200 AND price <=1000;
		SELECT * FROM product WHERE price BETWEEN 200 AND 1000;

		#查询商品价格是200或800的所有商品
		SELECT * FROM product WHERE price = 200 OR price = 800;
		SELECT * FROM product WHERE price IN (200,800);

		#查询含有'霸'字的所有商品
		SELECT * FROM product WHERE pname LIKE '%霸%';

		#查询以'香'开头的所有商品
		SELECT * FROM product WHERE pname LIKE '香%';

		#查询第二个字为'想'的所有商品
		SELECT * FROM product WHERE pname LIKE '_想%';


		#商品没有分类的商品
		SELECT * FROM product WHERE category_id IS NULL

		#查询有分类的商品
		SELECT * FROM product WHERE category_id IS NOT NULL


-- 	排序练习：
-- 		#1.使用价格对商品信息排序(降序)
-- 			提示：使用order by语句 ,格式:SELECT * FROM 表名 ORDER BY 排序字段 ASC|DESC;
			SELECT * FROM product p ORDER BY p.`price`; 
			SELECT * FROM product p ORDER BY p.`price` desc; 
			
-- 		#2.在价格排序(降序)的基础上，以主键排序(降序)
-- 			提示：若价格相同，相同价格的数据以pid降序排序，多级排序，前提就是 前面的排序值必须相等，才会进行后面的排序
			SELECT * FROM product p ORDER BY p.`price` DESC, p.pid DESC;

-- 		#3.显示商品的价格(去重复)，并排序(降序)
-- 			提示：DISTINCT 关键字去重 ，desc降序排列
			SELECT DISTINCT p.`price` FROM product p ORDER BY p.`price` DESC;

-- 	聚合函数/分组函数练习：
-- 		#1 查询商品的总条数(两种方式)
-- 			提示：使用count(商品ID)，可以统计记录数，因为ID是唯一主键
			SELECT COUNT(*) FROM product;
			SELECT COUNT(p.`pid`) FROM product p;

-- 		#2 查看price商品的总价格
-- 			提示：使用sum(price);
			SELECT	SUM(p.`price`)	FROM product p;

			
-- 		#3 查看price的最大值和最小值
-- 			提示：使用max(price)  min(price)	
			SELECT MAX(p.`price`) FROM product p;
			SELECT MIN(p.`price`) FROM product p;
		
-- 		#4 查看price的平均值
-- 			提示：使用 AVG(price) 
			SELECT AVG(p.`price`) FROM product p; 			

-- 		#5 查询价格大于200商品的总条数
-- 			提示：使用 COUNT(*)统计条数，条件是  WHERE price>200;
			SELECT  COUNT(*) FROM product p WHERE p.`price` > 200;
			

-- 	分组练习：
		#1 统计各个分类商品的个数
			SELECT category_id ,COUNT(*) FROM product GROUP BY category_id ;
			
		#2 统计各个分类商品的个数,且只显示个数大于1的信息
			SELECT category_id ,COUNT(*) FROM product GROUP BY category_id HAVING COUNT(*) > 1;
