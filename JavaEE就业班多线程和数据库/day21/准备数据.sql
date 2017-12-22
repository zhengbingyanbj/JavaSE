CREATE DATABASE day21;

USE day21;

CREATE TABLE category(
	cid INT PRIMARY KEY AUTO_INCREMENT,
	cname VARCHAR(100)
);

INSERT INTO category(cname) VALUES('家电'),('服装'),('化妆品');