/*
	条件查询
*/
-- 查询商品名称为花花公子的商品
SELECT * FROM product WHERE pname='花花公子';

-- 查询商品价格为800的商品
SELECT * FROM product WHERE price =800;

-- 查询商品价格不为800的商品
SELECT * FROM product WHERE price!=800;
SELECT * FROM product WHERE price<>800;
SELECT * FROM product WHERE NOT(price=800);

-- 查询商品价格大于60元的商品
SELECT * FROM product WHERE  price>60;

-- 查询商品价格大于等于200小于等于1000的商品
SELECT * FROM product WHERE  price<=1000 AND  price>=200;
SELECT * FROM product WHERE price BETWEEN 200 AND 1000;

-- 查询商品价格200或800的所有商品
SELECT * FROM product WHERE price=200 OR price=800;
SELECT * FROM product WHERE price IN(200,800);

/*
	模糊查询
	like关键字需要结合通配符使用
*/
-- 查询所有带'霸'字的商品
SELECT * FROM product WHERE pname LIKE '%霸%';
-- 查询商品名称为4个字的商品
SELECT * FROM product WHERE pname LIKE '____';
-- 查询第二个字是'想'字的商品
SELECT * FROM product WHERE pname LIKE '_想%';




