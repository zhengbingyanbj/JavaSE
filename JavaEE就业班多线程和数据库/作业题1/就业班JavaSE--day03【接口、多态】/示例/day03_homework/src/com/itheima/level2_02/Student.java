package com.itheima.level2_02;
/*
 5.定义学生类(Student),继承人类(Person)
	a)成员方法:现抽象方法eat()
		i.输出格式: 年龄18岁的 叶知秋 在吃学生餐
	b)提供: 无参,有参构造方法
 */
public class Student extends Person{
//a)成员方法:现抽象方法eat()
//	i.输出格式: 年龄18岁的 叶知秋 在吃学生餐
	public void eat() {
		System.out.println("年龄"+getAge()+"岁的 "+getName()+" 在吃学生餐");
	}
//b)提供: 无参,有参构造方法
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super(name, age);
	}
}
