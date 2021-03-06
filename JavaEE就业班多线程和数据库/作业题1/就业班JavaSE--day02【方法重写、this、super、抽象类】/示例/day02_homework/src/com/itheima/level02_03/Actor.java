package com.itheima.level02_03;
/*
 2.定义演员类(Actor),继承Person类
	i.成员方法:
		1.重写父类的 eat()方法
			a)输出:  18岁的演员景甜在吃小龙虾
		2. 特有方法:  跳舞(dance)
			a)输出:  18岁的演员景甜在跳白天鹅.
	ii.提供空参和带参构造方法
 */
public class Actor extends Person {
//	i.成员方法:
//		1.重写父类的 eat()方法
//			a)输出格式:  18岁的演员景甜在吃小龙虾
	public void eat(){
		System.out.println(getAge()+"岁的演员"+getName()+"在吃小龙虾");
	}
//		2. 特有方法:  跳舞(dance)
//			a)输出格式:  18岁的演员景甜在跳白天鹅.
	public void dance(){
		System.out.println(getAge()+"岁的演员"+getName()+"在跳白天鹅");
	}
//	ii.提供空参和带参构造方法
	public Actor() {
		super();
	}
	public Actor(String name, int age) {
		super(name, age);
	}
	
}
