CREATE TABLE emp(
	empno		INT, 			-- 员工号
	ename		VARCHAR(50),    -- 员工姓名
	job		VARCHAR(50),   	    -- 员工职位
	mgr		INT,     			-- 管理者工号
	hiredate	DATE,           -- 入职时间
	sal		DECIMAL(7,2),		-- 薪水
	comm		DECIMAL(7,2),   -- 奖金
	deptno		INT				-- 部门编号
) ;

CREATE TABLE dept(
	deptno		INT,			-- 部门编号
	dname		VARCHAR(14),    -- 部门名称
	loc		VARCHAR(13)         -- 部门位置       
);

INSERT INTO emp VALUES(7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO emp VALUES(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO emp VALUES(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO emp VALUES(7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO emp VALUES(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO emp VALUES(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO emp VALUES(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO emp VALUES(7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,NULL,20);
INSERT INTO emp VALUES(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO emp VALUES(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO emp VALUES(7876,'ADAMS','CLERK',7788,'1987-05-23',1100,NULL,20);
INSERT INTO emp VALUES(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
INSERT INTO emp VALUES(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO emp VALUES(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);

# delete from emp;



INSERT INTO dept VALUES(10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept VALUES(20, 'RESEARCH', 'DALLAS');
INSERT INTO dept VALUES(30, 'SALES', 'CHICAGO');
INSERT INTO dept VALUES(40, 'OPERATIONS', 'BOSTON');


-- 1.  查询工资大于1200的员工姓名和工资
 SELECT ename , sal FROM emp WHERE sal > 1200;

-- 2.	查询员工号为7698的员工的姓名和部门号
SELECT ename,deptno FROM emp WHERE empno=7698;

-- 3.	选择工资不在500到1200的员工的姓名和工资
SELECT ename,sal FROM emp WHERE   sal  NOT BETWEEN 500 AND 1200;

-- 4.	选择雇用时间在1981-02-01到1987-05-01之间的员工姓名，job_id和雇用时间
SELECT ename, empno , hiredate FROM emp WHERE hiredate BETWEEN '1981-02-01' AND '1987-05-01';

-- 5.	选择在20或30号部门工作的员工姓名和部门号
SELECT ename,deptno FROM emp WHERE deptno IN (20,30);

-- 6.	选择在1981年雇用的员工的姓名和雇用时间
SELECT ename, hiredate FROM emp WHERE hiredate LIKE '1981%'

-- 7.	选择公司中没有管理者的员工姓名及job_id
SELECT ename, empno FROM emp WHERE mgr IS NULL;

-- 8.	选择公司中有奖金的员工姓名，工资和奖金级别
SELECT ename ,sal, comm FROM emp WHERE comm IS NOT NULL 

-- 9.	选择员工姓名的第三个字母是a的员工姓名
SELECT ename FROM emp WHERE ename LIKE '__a%';

-- 10.	选择姓名中有字母a和e的员工姓名
SELECT ename FROM emp WHERE ename LIKE '%a%e%' OR  ename LIKE'%e%a%';

-- 11.	查询员工号，姓名，工资，以及工资提高百分之20%后的结果（new salary）
SELECT empno ,ename ,sal ,sal*1.2 FROM emp;

-- 12.	将员工的姓名按首字母排序
SELECT ename FROM emp ORDER BY ename;

-- 13.	查询公司员工工资的最大值，最小值，平均值，总和
SELECT MAX(sal) ,MIN(sal),AVG(sal),SUM(sal) FROM emp;

-- 14.	查询各deptno的员工工资的最大值，最小值，平均值，总和
SELECT MAX(sal) ,MIN(sal),AVG(sal),SUM(sal), deptno FROM emp GROUP BY deptno;

-- 15.	选择具有各个deptno的员工人数
SELECT COUNT(ename),deptno  FROM emp  GROUP BY deptno ;

==============================================================================








