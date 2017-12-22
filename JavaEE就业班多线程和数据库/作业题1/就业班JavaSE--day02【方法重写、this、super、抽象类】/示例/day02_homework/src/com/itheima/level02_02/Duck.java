package com.itheima.level02_02;
/*
 3.定义鸭子类(Duck),继承Poultry类
	i.成员方法:
		1. 重写父类的 eat()方法
			a)输出: 1岁的黑色的鸭子在吃鱼
		2. 特有方法: swim()  游泳方法
			a)输出:  1岁的黑色的鸭子在游泳
		ii.提供空参和带参构造方法
 */
public class Duck extends Poultry {
	
//	i.成员方法:
//		1. 重写父类的 eat()方法
//		a)输出: 1岁的黑色的鸭子在吃鱼
	public void eat() {
		System.out.println(getAge()+"岁"+getColor()+"的鸭子在吃鱼");
	}
//		2. 特有方法: swim()  游泳方法
//			a)输出:  1岁的黑色的鸭子在游泳
	public void swim(){
		System.out.println(getAge()+"岁"+getColor()+"的鸭子在游泳");
	}
//		ii.提供空参和带参构造方法
	public Duck() {
		super();
	}
	
	public Duck(String color, int age) {
		super(color, age);
	}
	
}
