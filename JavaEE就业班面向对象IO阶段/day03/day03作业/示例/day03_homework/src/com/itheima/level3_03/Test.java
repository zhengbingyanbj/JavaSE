package com.itheima.level3_03;
/*
  请用代码描述
在某个公司每一个员工都有工号(id),姓名(name)和工资(salary),都要工作(work). 按照做工作的内容不同分为行政部(AdminStaff),开发部(Developer)和财务部(Treasurer)
所有行政部人员都要工作(采购),但是有的行政部员工会表演(play)(跳舞)
所有的开发部人员都要工作(编程),但有开发部员工会表演(play)(唱歌)
所有的财务部人员都要工作(对账),但是有的财务部员工表演(play)(玩魔术)
    35岁的薛之谦老板会让安排员工工作和组织员工表演.


1.定义抽象员工类(Employee)
	a)属性:工号(id),姓名(name)和工资(salary)
	b)抽象方法 (work)
	c)提供空参,带参构造方法和setters,getters方法
2.定义表演接口(Actor)
	a)抽象方法:play() 
3.定义行政部员工类(AdminStaff)  继承 Employee
	a)实现抽象方法work()
		i.输出格式: 工号为001的行政部员工景甜在采购物品
	b)提供空参,带参构造方法
4.定义会表演的行政部员工类(ActedAdminStaff)  继承 AdminStaff 实现 Actor接口
	a)实现抽象方法 play
		i.输出格式: 工号为001的行政部员工景甜在跳舞
	b)提供空参,带参构造方法
5.定义开发部员工类(Developer)  继承 Employee
	a)实现抽象方法work()
		i.输出格式: 工号为010的开发部员工林俊杰在开发JavaEE应用
	b)提供空参,带参构造方法
6.定义会表演的开发部员工类(ActedDeveloper)  继承 Developer实现 Actor接口
	a)实现抽象方法 play
		i.输出格式: 工号为010的开发部员工林俊杰在唱歌
	b)提供空参,带参构造方法
7.定义财务部员工类(Treasurer)  继承 Employee
	a)实现抽象方法work()
		i.输出格式: 工号为100 的财务部员工林思意在对账
	b)提供空参,带参构造方法
8.定义会表演的财务部员工类(ActedTreasurer)  继承 Treasurer实现 Actor接口
	a)实现抽象方法 play
		i.输出格式: 工号为100的行财务部员工林思意在表演魔术
	b)提供空参,带参构造方法
9.老板类Boss类
	a)属性: 年龄,姓名
	b)行为: 
		i.安排工作(letWork(Employee e)
			1.调用e对象的工作方法
		ii.组织表演(letPlay(Actor a)
			1.调用a对象的,表演方法.
	c) 提供空参,带参构造方法;setters和getters方法
10.测试类Test
	a)提供main方法
	b)在main方法中
		i.创建会表演的行政部员工类(ActedAdminStaff)对象 aas,工号赋值为001,姓名赋值为景甜,工资赋值5000
		ii.创建会表演的开发部员工类(ActedDeveloper) 对象ad,工号赋值为010,姓名赋值为林俊杰,工资赋值为10000
		iii.创建会表演的财务部员工类(ActedTreasurer) 对象 at,工号赋值为100,姓名赋值为林思意,工资赋值为8000
		iv.创建老板(Boss)对象,姓名赋值为薛之谦,年龄赋值为30
		1.调用三次letWork(Employee e)方法,分别传入ass,ad,at
		2.调用三次letPlayo(Actor a)方法,分别传入ass,ad,at
 */
public class Test {
	public static void main(String[] args) {		
//	i.创建会表演的行政部员工类(ActedAdminStaff)对象 aas,工号赋值为001,姓名赋值为景甜,工资赋值5000
		ActedAdminStaff aas = new ActedAdminStaff("001", "景甜", 5000);
//	ii.创建会表演的开发部员工类(ActedDeveloper) 对象ad,工号赋值为010,姓名赋值为林俊杰,工资赋值为10000
		ActedDeveloper ad = new ActedDeveloper();
		ad.setId("010");
		ad.setName("林俊杰");
		ad.setSalary(10000);
//	iii.创建会表演的财务部员工类(ActedTreasurer) 对象 at,工号赋值为100,姓名赋值为林思意,工资赋值为8000
		ActedTreasurer at = new ActedTreasurer("100", "林思意", 8000);
//	iv.创建老板(Boss)对象,姓名赋值为薛之谦,年龄赋值为30
		Boss b = new Boss("薛之谦", 30);
//	1.调用三次letWork(Employee e)方法,分别传入aas,ad,at
		b.letWork(aas);
		b.letWork(ad);
		b.letWork(at);
//	2.调用三次letPlayo(Actor a)方法,分别传入aas,ad,at
		b.letPlay(aas);
		b.letPlay(ad);
		b.letPlay(at);
	}
}
