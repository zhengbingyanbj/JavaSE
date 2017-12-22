/*
	多表查询
	交叉查询
	内连接
	外连接
	子查询
*/
/*
	交叉查询
	select * from A,B;
*/
SELECT * FROM category,products;
/*
    内连接
		隐式内连接
*/
SELECT * FROM category,products WHERE category.cid = products.category_id;
SELECT * FROM category c,products p WHERE c.cid = p.category_id;
/*
	查询所有化妆品的记录使用隐式内连接
*/
SELECT * FROM category c,products p WHERE c.cid = p.category_id AND c.cname='化妆品';
/*
	显示内连接
	A inner join B on 条件
*/
SELECT * FROM category INNER JOIN products ON category.cid = products.category_id;
SELECT * FROM category c INNER JOIN products p ON c.cid = p.category_id;
/*
	使用显示内连接查询所有化妆品的记录
*/
SELECT * FROM category c INNER JOIN products p ON c.cid = p.category_id AND c.cname ='化妆品';
SELECT * FROM category c INNER JOIN products p ON c.cid = p.category_id WHERE c.cname ='化妆品';


/*
	外连接
	左外连接
		A left [outer] join B on 条件
	右外连接
		A right [outer] join B on 条件  = B left [outer] join A on条件
*/
SELECT * FROM category c LEFT JOIN products p ON c.cid = p.category_id;

/*
	使用左外连接查询所有化妆品的记录
*/
SELECT * FROM category c LEFT JOIN products p ON c.cid = p.category_id WHERE c.cname='化妆品';




SELECT * FROM users LEFT JOIN usr_rol ON users.uid = usr_rol.uid
LEFT JOIN role ON usr_rol.rid = role.rid
LEFT JOIN rol_pri ON role.rid = rol_pri.rid
LEFT JOIN privilege ON rol_pri.pid = privilege.pid;


