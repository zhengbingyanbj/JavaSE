package com.itheima.level2_02;

/*
 4.定义运动老师类(SportTeacher)继承老师类(Teacher)实现运动接口
	a)成员方法: 实现playBasketball的抽象方法
		i.输出格式: 年龄为30岁 周晓斌 老师在打篮球
	b)提供: 无参,有参构造方法
 */
public class SportTeacher extends Teacher implements Sport {
//a)成员方法: 实现playBasketball的抽象方法
//	i.输出格式: 年龄为30岁 周晓斌 老师在打篮球
	public void playBasketball() {
		System.out.println("年龄为"+getAge()+"岁 "+getName()+" 老师在打篮球");
	}
//b)提供: 无参,有参构造方法
	public SportTeacher() {
		super();
	}
	public SportTeacher(String name, int age) {
		super(name, age);
	}
}
