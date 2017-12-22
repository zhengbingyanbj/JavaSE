/*
	创建用户表
*/
CREATE TABLE users(
	uid INT PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(100),
	PASSWORD VARCHAR(100)
);
/*
	向表中添加数据
*/
INSERT INTO users(username,PASSWORD) VALUES
('刘德华','123'),
('柳岩','3838'),
('唐嫣','1818'),
('杨幂','0000'),
('宝强','66666'),
('马蓉','438438');
/*
	创建角色表
*/
CREATE TABLE role(
	rid INT PRIMARY KEY AUTO_INCREMENT,
	rname VARCHAR(100)
);
/*
	向角色表中添加数据
*/
INSERT INTO role(rname) VALUES
('皇上'),
('太监'),
('皇后'),
('宫女'),
('将军');
/*
	创建中间表
*/
CREATE TABLE usr_rol(
	uid INT,
	rid INT
);
/*
	添加外键约束
	主表:users
	从表:usr_rol
	uid
*/
ALTER TABLE usr_rol ADD CONSTRAINT fk_usr_rol_uid FOREIGN KEY(uid)
REFERENCES users(uid);
/*
	添加外键约束
	主表:role
	从表:usr_rol
	rid
*/
ALTER TABLE usr_rol ADD CONSTRAINT fk_usr_rol_rid FOREIGN KEY(rid)
REFERENCES role(rid);
/*
	向中间表中添加数据
*/
INSERT INTO usr_rol(uid,rid) VALUES
(1,1),
(1,2),
(1,5),
(2,3),
(3,3),
(4,3);
/*
	向中间表中添加错误数据
	用户表中没有的uid 或者 角色表中没有的rid
*/
#INSERT INTO usr_rol(uid,rid) VALUES(100,200);




/*
	创建权限表
*/
CREATE TABLE privilege(
	pid INT PRIMARY KEY AUTO_INCREMENT,
	pname VARCHAR(100)
);
/*
	向权限表中添加数据
*/
INSERT INTO privilege(pname) VALUES
('传旨'),
('杀人'),
('宫斗'),
('平乱');
/*
	创建中间表
*/
CREATE TABLE rol_pri(
	rid INT ,
	pid INT
);
/*
	添加外键约束
	主表:role
	从表:rol_pri
	rid
*/
ALTER TABLE rol_pri ADD CONSTRAINT fk_rol_pri_rid FOREIGN KEY(rid)
REFERENCES role(rid);
/*
	添加外键约束
	主表:privilege
	从表:rol_pri
	pid
*/
ALTER TABLE rol_pri ADD CONSTRAINT fk_rol_pri_pid FOREIGN KEY(pid)
REFERENCES privilege(pid);
/*
	向中间表添加数据
*/
INSERT INTO rol_pri(rid,pid) VALUES
(1,1),
(1,2),
(1,4),
(5,4);
/*
	向中间表添加错误数据
	角色表中没有的rid 或 权限表中没有的pid
*/
#INSERT INTO rol_pri(rid,pid) VALUES(10,20);






