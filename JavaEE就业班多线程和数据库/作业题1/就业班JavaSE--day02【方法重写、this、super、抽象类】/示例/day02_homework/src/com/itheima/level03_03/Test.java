package com.itheima.level03_03;

/*
 请使用代码描述
	在传智播客有很多员工(Employee),按照工作内容不同分教研部员工(Teacher)和行政部员工(AdminStaff)
	教研部根据教学的方式不同又分为讲师(Lecturer)和助教(Tutor)
	行政部根据负责事项不同,有分为维护专员(Maintainer),采购专员(Buyer)
	公司的每一个员工都编号,姓名和其负责的工作
	工作内容:
		讲师: 工号为 666 的讲师 傅红雪 在讲课
		 助教: 工号为 668的助教 顾棋 在帮助学生解决问题
		维护专员: 工号为 686 的维护专员 庖丁 在解决不能共享屏幕问题
		采购专员: 工号为 888 的采购专员 景甜 在采购音响设备
 提示: 参考今天的综合案例
 

 一. 分析继承关系
	1.顶层类： 员工类(Employee)
	2.教研部员工（Teacher）和行政部员工(AdminStaff)继承员工类(Employee)
	3.讲师(Lecturer)和助教(Tutor)继承教研部员工(Teacher)
	4.维护专员(Maintainer),采购专员(Buyer) 继承行政部员工(AdminStaff)
二.代码实现步骤:
1.定义抽象类员工类(Employee)
	a)成员变量: 工号(id),姓名(name)
	b)抽象方法: void work();
	c)提供无参和带参的构造方法以及setters和getters
2.定义抽象类教研部员工（Teacher）类继承员工类(Employee)
	a)提供无参和带参的构造方法
3.定义抽象类行政部员工(AdminStaff)类继承员工类(Employee)
	a)提供无参和带参的构造方法
4.定义讲师(Lecturer)类继承研部员工（Teacher）类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		输出格式: 工号为 666 的讲师 傅红雪 在讲课
5.定义助教(Tutor)类继承研部员工（Teacher）类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		i.输出格式: 工号为 668的助教 顾棋 在帮助学生解决问题
6.定义维护专员(Maintainer)类继承行政部员工(AdminStaff)类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		i.输出格式: 工号为 686 的维护专员 庖丁 在解决不能共享屏幕问题
7.定义采购专员(Buyer) 类继承行政部员工(AdminStaff)类
	a)提供无参和带参的构造方法
	b)实现抽象方法: void work();
		输出格式:  工号为 888 的采购专员 景甜 在采购音响设备
8.定义测试类Test
	a)创建讲师对象 l, 把工号赋值为666,姓名赋值为”傅红雪”
	b)调用讲师对象l的工作方法
	c)创建助教对象 t, 把工号赋值为668,姓名赋值为”顾棋”
	d)调用助教对象t的工作方法
	e)创建维护专员对象 m, 把工号赋值为686,姓名赋值为”庖丁”
	f)调用维护专员对象m的工作方法
	g)创建采购专员对象 b, 把工号赋值为888,姓名赋值为”景甜”
	h)调用采购专员对象b的工作方法
 */
public class Test {
	public static void main(String[] args) {
//		a)创建讲师对象 l, 把工号赋值为666,姓名赋值为”傅红雪”
		Lecturer l = new Lecturer("666", "傅红雪");
//		b)调用讲师对象l的工作方法
		l.work();
//		c)创建助教对象 t, 把工号赋值为668,姓名赋值为”顾棋”
		Tutor t = new Tutor("668", "顾棋");
//		d)调用助教对象t的工作方法
		t.work();
//		e)创建维护专员对象 m, 把工号赋值为686,姓名赋值为”庖丁”
		Maintainer m = new Maintainer("686", "庖丁");
//		f)调用维护专员对象m的工作方法
		m.work();
//		g)创建采购专员对象 b, 把工号赋值为888,姓名赋值为”景甜”
		Buyer b = new Buyer("888", "景甜");
//		h)调用采购专员对象b的工作方法
		b.work();
	}
}
