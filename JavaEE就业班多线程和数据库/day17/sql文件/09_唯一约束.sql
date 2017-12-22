/*
	唯一约束
	unique 限制当前列 唯一
	一个表可以有多个唯一约束
*/
CREATE TABLE Persons
(
	Id_P INT PRIMARY KEY,
	LastName VARCHAR(255) NOT NULL,
	FirstName VARCHAR(255),
	Address VARCHAR(255),
	City VARCHAR(255) UNIQUE
)
-- 第二种方式
CREATE TABLE Persons
(
	Id_P INT,
	LastName VARCHAR(255) NOT NULL,
	FirstName VARCHAR(255),
	Address VARCHAR(255),
	City VARCHAR(255),
	CONSTRAINT u_city UNIQUE (city)
)
-- 修改表结构
-- ALTER TABLE Persons ADD [CONSTRAINT 名称] UNIQUE (Id_P)
altert TABLE Persons ADD CONSTRAINT u_city UNIQUE(city);

/*
	删除唯一约束
*/
ALTER TABLE Persons DROP INDEX city;

