CREATE DATABASE day23;

USE day23;

CREATE TABLE products(
  pid INT PRIMARY KEY AUTO_INCREMENT ,
  pname VARCHAR(50),
  price DOUBLE,
  flag VARCHAR(2),				#是否上架标记为：1表示上架、0表示下架
  category_id INT
);


#商品
INSERT INTO products(pname,price,flag,category_id) VALUES('联想',5000,'1',1);
INSERT INTO products(pname,price,flag,category_id) VALUES('海尔',3000,'1',1);
INSERT INTO products(pname,price,flag,category_id) VALUES('雷神',5000,'1',1);

INSERT INTO products(pname,price,flag,category_id) VALUES('JACK JONES',800,'1',2);
INSERT INTO products(pname,price,flag,category_id) VALUES('真维斯',200,'1',2);
INSERT INTO products(pname,price,flag,category_id) VALUES('花花公子',440,'1',2);
INSERT INTO products(pname,price,flag,category_id) VALUES('劲霸',2000,'1',2);

INSERT INTO products(pname,price,flag,category_id) VALUES('香奈儿',800,'1',3);
INSERT INTO products(pname,price,flag,category_id) VALUES('相宜本草',200,'1',3);
