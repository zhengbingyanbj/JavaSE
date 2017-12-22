--  1、按员工编号升序排列不在10号部门工作的员工信息
 SELECT * FROM emp WHERE deptno !=10 ORDER BY empno;  
   
-- 2、查询姓名第二个字母不是”A”且薪水大于800元的员工信息，按年薪降序排列
 SELECT * FROM emp WHERE ename NOT LIKE '_a%' AND sal >800 ORDER BY sal DESC;  
   
-- 3、求每个部门的平均薪水
  SELECT AVG(sal) FROM emp GROUP BY deptno; 
   
-- 4、求各个部门的最高薪水
   SELECT deptno,MAX(sal) FROM emp GROUP BY deptno;
   
-- 5、求每个部门每个岗位的最高薪水
   SELECT deptno,job ,MAX(sal) FROM emp GROUP BY deptno,job;
   
   
-- 6、求平均薪水大于2000的部门编号
   SELECT deptno , AVG(sal)
   FROM emp 
   GROUP BY deptno 
   HAVING AVG(sal)>2000;
  
  
-- 7、将员工薪水大于1200且部门平均薪水大于1500的部门编号列出来，按部门平均薪水降序排列
   SELECT empno,AVG(sal) 
   FROM emp 
   WHERE sal>1200 
   GROUP BY deptno 
   HAVING  AVG(sal) > 1500
   ORDER BY AVG(sal) DESC; 
  ============================================================
-- 8、求最高薪水的员工信息
   SELECT * FROM emp WHERE sal = (SELECT MAX(sal) FROM emp )
   
-- 9、求多于平均薪水的员工信息
   SELECT * FROM emp WHERE sal > 
   (SELECT AVG(sal) FROM emp);
== ==========================================================
-- 10、求各个部门薪水最高的员工信息
--方式1
SELECT * FROM emp WHERE sal IN
	(SELECT MAX(sal) FROM emp GROUP BY deptno );
--方式2
SELECT * 
  FROM  emp e  
  INNER JOIN
  (SELECT deptno ,MAX(sal) AS m FROM emp GROUP BY deptno) t  
  ON t.m = e.sal;;
   
== =========================================================
   
-- 1.  查询和Scott相同部门的员工姓名和雇用日期
SELECT ename,hiredate FROM emp WHERE deptno = 
( SELECT deptno FROM emp WHERE ename ='scott') AND ename <> 'scott';

      
-- 2.	查询工资比公司平均工资高的员工的员工号，姓名和工资。
   SELECT empno , ename ,sal  FROM emp WHERE sal >(SELECT AVG(sal) FROM emp );
      
-- 3.	查询各部门中工资比本部门平均工资高的员工的员工号, 姓名和工资
     SELECT * FROM emp e 
      JOIN
     (SELECT deptno ,AVG(sal) AS a FROM emp GROUP BY deptno) t WHERE sal > t.a AND e.deptno = t.deptno;
   

-- 4.	查询和姓名中包含字母u的员工在相同部门的员工的员工号和姓名
	SELECT * FROM emp WHERE deptno IN 
    (SELECT deptno FROM emp WHERE ename LIKE '%u%') ;
   
-- 5. 	查询在部门的loc为 DALLAS 的部门工作的员工的员工号，
   SELECT  e.empno,e.ename 
   FROM emp e 
   WHERE e.deptno IN ( SELECT deptno FROM dept WHERE loc='DALLAS')
   
   
-- 6. 	查询管理者是King的员工姓名和工资 
   SELECT * FROM emp WHERE mgr  = (
     SELECT empno FROM emp WHERE ename='king');

	 
	 

-- 7.	查询所有部门的名字，loc，员工数量 和 工资平均值 ()
SELECT d.dname , d.loc ,COUNT(e.ename),AVG(sal)
FROM dept d , emp e
WHERE d.deptno = e.deptno
GROUP BY e.deptno ;

