package com.itheima.level01_05;

/*
 2.定义猫类(Cat),继承Animal类
	a)提供空参,有参构造方法,在有参构造中调用父类的构造方法
 */
public class Cat extends Animal {

//	无参构造
	public Cat() {
	}
	
//  有参构造
	public Cat(String name, String color) {
//		调用父类的有参构造,给父类的成员变量赋值
		super(name, color);
	}
}
