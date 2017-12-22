package com.itheima.level2_03;

/*
    4. 验证: 引用类型的变量值为对象地址值，地址值不能更改，但是地址内的对象属性值可以修改
 */

public class Final_4 {
	public static void main(String[] args) {
//		定义final修饰引用变量,并进行初始化
		final Cat c = new Cat();
//		 引用类型的变量值为对象地址值，地址值不能更改
//		c = new Cat();//编译报错
//		地址内的对象属性值可以修改
		c.age = 2;
	}
}

//定义辅助类:Cat
class Cat{
	public int age;
}