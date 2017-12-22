/*
	修改表记录
	update 表名 set 列名=列值,列名=列值  [where 条件]
		
	==     =
	!=     <> !=
	>	   >
	<      <
	>=     >=
	<=     <=
	&&     and
	||     or
	!      not
	
	
*/
UPDATE category SET cname='茄子' WHERE cid=5;
/*
	将数码 和家电 改为 厨具
*/
UPDATE category SET cname='厨具' WHERE cid=2 OR cid=4;