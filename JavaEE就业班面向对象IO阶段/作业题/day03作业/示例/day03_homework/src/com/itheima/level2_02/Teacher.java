package com.itheima.level2_02;
/*
 3.定义老师类(Teacher)继承Person类
	a) 成员方法:: 实现抽象方法eat()
		i.输出格式: 年龄为30岁周晓斌老师,正在吃工作餐
    b) 提供: 无参,有参构造方法
 */
public class Teacher extends Person {
//a) 成员方法:: 实现抽象方法eat()
//  i.输出格式: 年龄为30岁周晓斌老师,正在吃工作餐
	public void eat() {
		System.out.println();
	}
//	提供: 无参,有参构造方法
	public Teacher() {
		super();
	}

	public Teacher(String name, int age) {
		super(name, age);
	}
}
