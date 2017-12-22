-- ����ϵʵս��
	--��ϰ1�� һ�Զ��ϵ��ϰ
			-- ���� ʡ�� �� �б�
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
	
		-- ���м��������һ����� p_id��ָ��ʡ�������
			ALTER TABLE city ADD COLUMN p_id INT;
		
		-- ������Լ������ʡ���������У��ӱ������
			ALTER TABLE city ADD CONSTRAINT city_pk FOREIGN KEY (p_id) REFERENCES province(id);	
		
			
-- ��ϰ2��ʹ���Թ�����ʽ�����һ�Զ��ϵ
		-- ����һ��AREA��������ʡ�е��Թ�����
			CREATE TABLE AREA(
				id INT PRIMARY KEY,
				NAME VARCHAR(20),
				description VARCHAR(20),
				parent_id INT
			);
		-- mysql 5.5  Ҫ���Թ���ǰ��Ҫ��������
			-- ����׼�������Թ������������ݲ���������Լ����
			INSERT INTO AREA VALUES (1,'�ӱ�ʡ','�ӱ�ʡ',NULL);
			INSERT INTO AREA VALUES (2,'������','������',1);
			INSERT INTO AREA VALUES (3,'ʯ��ׯ��','ʯ��ׯ��',1);
			
		-- ���Լ��
			ALTER TABLE AREA ADD CONSTRAINT a_pk FOREIGN KEY (parent_id) REFERENCES AREA(id);

-- ��ϰ3����Զ��ϵ���û����ɫ��
		-- �����û���
			CREATE TABLE USER(
				uid INT PRIMARY KEY,
				username VARCHAR(30),
				PASSWORD VARCHAR(30)
			);

			
		-- ������ɫ
			CREATE TABLE role(
				rid INT PRIMARY KEY,
				NAME VARCHAR(30)
			);

		
	    -- �����м��
			CREATE TABLE user_role(
				u_uid INT,
				r_rid INT
			);

		
		-- Ϊ�м��u_uid������
		ALTER TABLE user_role ADD CONSTRAINT u_fk FOREIGN KEY (u_uid) REFERENCES USER(uid);
		
		-- Ϊ�м��r_rid������
		ALTER TABLE user_role ADD CONSTRAINT r_fk FOREIGN KEY (r_rid) REFERENCES role(rid);

		

		
		
		
		
		
		