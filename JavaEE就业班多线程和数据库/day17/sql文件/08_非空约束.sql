/*
	非空约束 
	限制当前列不能为null值 
	一个表只能有一个主键约束 但是可以有多个非空约束
	
	String s = null; 不能添加
	String s = "null"; 可以
	String s ="";  可以
	
*/
CREATE TABLE Persons
(
	Id_P INT PRIMARY KEY,
	LastName VARCHAR(255) NOT NULL,
	FirstName VARCHAR(255),
	Address VARCHAR(255),
	City VARCHAR(255)
)
-- 添加非空约束
ALTER TABLE persons MODIFY firstName VARCHAR(255) NOT NULL;
-- 删除非空约束
ALTER TABLE persons MODIFY firstName VARCHAR(255);