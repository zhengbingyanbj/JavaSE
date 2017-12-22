-- 多表关系实战：
	--练习1： 一对多关系练习
			-- 创建 省表 和 市表
			CREATE TABLE province(
				id INT PRIMARY KEY,
				NAME VARCHAR(20),
				description VARCHAR(20)
			);
			
			CREATE TABLE city(
				id INT PRIMARY KEY,
				NAME VARCHAR(20),
				description VARCHAR(20)
			);
	
		-- 向市级表中添加一个外键 p_id，指向省表的主键
			ALTER TABLE city ADD COLUMN p_id INT;
		
		-- 添加外键约束，将省表（主表）与市（从表）表关联
			ALTER TABLE city ADD CONSTRAINT city_pk FOREIGN KEY (p_id) REFERENCES province(id);	
		
			
-- 练习2：使用自关联方式，表达一对多关系
		-- 创建一个AREA，来进行省市的自关联。
			CREATE TABLE AREA(
				id INT PRIMARY KEY,
				NAME VARCHAR(20),
				description VARCHAR(20),
				parent_id INT
			);
		-- mysql 5.5  要求自关联前，要填入数据
			-- 数据准备：（自关联必须有数据才能添加外键约束）
			INSERT INTO AREA VALUES (1,'河北省','河北省',NULL);
			INSERT INTO AREA VALUES (2,'保定市','保定市',1);
			INSERT INTO AREA VALUES (3,'石家庄市','石家庄市',1);
			
		-- 添加约束
			ALTER TABLE AREA ADD CONSTRAINT a_pk FOREIGN KEY (parent_id) REFERENCES AREA(id);

-- 练习3：多对多关系（用户与角色）
		-- 创建用户表
			CREATE TABLE USER(
				uid INT PRIMARY KEY,
				username VARCHAR(30),
				PASSWORD VARCHAR(30)
			);

			
		-- 创建角色
			CREATE TABLE role(
				rid INT PRIMARY KEY,
				NAME VARCHAR(30)
			);

		
	    -- 创建中间表
			CREATE TABLE user_role(
				u_uid INT,
				r_rid INT
			);

		
		-- 为中间表u_uid添加外键
		ALTER TABLE user_role ADD CONSTRAINT u_fk FOREIGN KEY (u_uid) REFERENCES USER(uid);
		
		-- 为中间表r_rid添加外键
		ALTER TABLE user_role ADD CONSTRAINT r_fk FOREIGN KEY (r_rid) REFERENCES role(rid);

		

		
		
		
		
		
		