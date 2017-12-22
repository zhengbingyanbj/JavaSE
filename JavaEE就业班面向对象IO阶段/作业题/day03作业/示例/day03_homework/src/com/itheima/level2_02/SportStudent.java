package com.itheima.level2_02;

/*
 6.定义运动学生类(SportStudent类),继承Student类,实现Sport接口
	a)成员方法: 实现playBasketball的抽象方法
		i.输出格式: 年龄为18岁 叶知秋 学生在打篮球
	b)提供: 无参,有参构造方法
 */
public class SportStudent extends Student implements Sport {
//a)成员方法: 实现playBasketball的抽象方法
//	i.输出格式: 年龄为18岁 叶知秋 学生在打篮球
	public void playBasketball() {
		System.out.println("年龄为"+getAge()+"岁 "+getName()+" 学生在打篮球");
	}
//b)提供: 无参,有参构造方法
	public SportStudent() {
		super();
	}
	public SportStudent(String name, int age) {
		super(name, age);
	}
}
