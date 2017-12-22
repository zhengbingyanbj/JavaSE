package com.itheima.level01_05;

/*
 3.定义狗类(Dog)
	a)成员变量: 品种(breed)
	b)提供空参,有参构造方法,在有参构造中调用父类的构造方法
 */
public class Dog extends Animal {

//	品种(breed)
	private String bread;

	public Dog() {
		
	}

	public Dog(String name,String color, String bread) {
//		调用父类的有参构造方法,给父类的成员变量赋值
		super(name, color);
//		给自己成员变量赋值
		this.bread = bread;
	}
}
