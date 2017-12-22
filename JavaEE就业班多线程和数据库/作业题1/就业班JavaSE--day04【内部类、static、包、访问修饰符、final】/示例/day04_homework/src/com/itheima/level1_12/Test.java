package com.itheima.level1_12;
/*
 1.定义一个汽车类(Car)
	a)成员变量: 状态(status),true表示运行状态一种,false表示停止状态.
	b)成员内部类: 发动机(Engine) 
		i.成员方法:work()
			1.如果汽车的运行状态打印发动机就飞速旋转
			2.否则打印发动机停止工作
	c)提供:状态(status)的getter和setter方法
2.定义测试类(Test)
	a)提供main方法
	b)在main方法中
		i.创建汽车对象 c
		ii.通过汽车对象c创建该汽车的发动机对象e
		iii.调用发动机e对象的work()方法
		iv.把汽车对象c的状态设置为true
		v.调用发动机e对象的work()方法
	 */
public class Test {
	public static void main(String[] args) {
//		i.创建汽车对象 c
		Car c = new Car();
//		ii.通过汽车对象c创建该汽车的发动机对象e
		Car.Engine e = c.new Engine();
//		iii.调用发动机e对象的work()方法
		e.work();
//		iv.把汽车对象c的状态设置为true
		c.setStatus(true);
//		v.调用发动机e对象的work()方法
		e.work();
	}
}
