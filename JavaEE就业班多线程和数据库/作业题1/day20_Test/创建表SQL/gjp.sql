/*
  创建分类数据表，表名 gjp_sort
  语法格式：
    CREATE TABLE 表名(
       列名 数据类型 约束,
       列名 数据类型     
    )
*/
CREATE TABLE gjp_sort(
   sid INT PRIMARY KEY AUTO_INCREMENT, -- id列，主键约束(数据唯一性) 自动增长
   sname VARCHAR(100) , -- 分类名称
   parent VARCHAR(100), -- 父分类，支出，收入
   sdesc VARCHAR(10000) -- 分类描述
);

/*
  创建账务的数据表
  表名：gjp_ledger
*/
CREATE TABLE gjp_ledger(
  lid INT PRIMARY KEY AUTO_INCREMENT , -- 主键，自动增长
  parent VARCHAR(100), -- 所属的大分类
  money DOUBLE , -- 金额
  sid INT , -- 分类ID
  account VARCHAR(100), -- 账户
  createtime DATE , -- 创建日期和时间
  ldesc VARCHAR(1000) -- 描述
);

/*
  创建账务的数据表
  表名：gjp_ledger
*/
CREATE TABLE gjp_ledger(
  lid INT PRIMARY KEY AUTO_INCREMENT , -- 主键，自动增长
  parent VARCHAR(100), -- 所属的大分类
  money DOUBLE , -- 金额
  sid INT , -- 分类ID
  account VARCHAR(100), -- 账户
  createtime DATE , -- 创建日期和时间
  ldesc VARCHAR(1000) -- 描述
);

INSERT INTO 
gjp_sort(sid,sname,parent,sdesc) 
VALUES (1,'服装支出','支出','人靠衣装'),
(2,'吃饭支出','支出','天天下馆子'),
(3,'交通支出','支出','每天挤地铁'),
(4,'住房支出','支出','五环外公寓'),
(5,'工资收入','收入','工资不够花'),
(6,'股票收入','收入','股票不赚钱'),
(7,'礼金支出','支出','礼金拿不起'),
(8,'其它支出','支出','啥也不敢买');


INSERT INTO 
 gjp_ledger(lid,parent,money,sid,account,createtime,ldesc) 
 VALUES (1,'支出',247,2,'交通银行','2015-03-02','家庭聚餐'),
 (2,'收入',12345,5,'现金','2015-03-15','开工资了'),
 (3,'支出',1998,1,'现金','2015-04-02','买衣服'),
 (4,'支出',325,2,'现金','2015-06-18','朋友聚餐'),
 (10,'收入',8000,6,'工商银行','2015-10-28','股票大涨'),
 (11,'收入',5000,6,'工商银行','2015-10-28','股票又大涨'),
 (12,'收入',5000,5,'交通银行','2015-10-28','又开工资了'),
 (13,'支出',5000,7,'现金','2015-10-28','朋友结婚'),
 (14,'支出',1560,8,'现金','2015-10-29','丢钱了'),
 (15,'支出',2300,3,'交通银行','2015-10-29','油价还在涨啊'),
 (16,'支出',1000,2,'工商银行','2015-10-29','又吃饭'),
 (17,'收入',1000,5,'现金','2015-10-30','开资'),
 (18,'支出',2000,3,'现金','2015-10-30','机票好贵'),
 (19,'收入',5000,5,'现金','2015-10-30','又开资');
