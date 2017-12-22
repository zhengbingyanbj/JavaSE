package com.itheima.level1_12;
/*
请使用代码实现
每一个学生(Student)都有学号,姓名和分数,分数永远不能为为负数
如果师徒给学生赋值一个负数,抛出一个自定异常
 
 1.定义异常类NoScoreException,继承RuntimeException
	a)提供空参和有参构造方法
 2.定义学生类(Student)
	a)属性:name,score
	b)提供空参构造
	c)提供有参构造;
		i.使用setXxx方法给名称和score赋值
	d)提供setter和getter方法
		i.在setScore(int score)方法中
			1.首先判断,如果score为负数,就抛出NoScoreException,异常信息为:分数不能为负数:xxx.
			2.然后在给成员score赋值.
3.定义测试类Test12
	a)提供main方法,在main方法中
		i.使用满参构造方法创建Student对象,分数传入一个负数,运行程序
		ii.由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
		iii.使用空参构造创建Student对象
		iv.调用setScore(int score)方法,传入一个正数,运行程序
		v.调用setScore(int score)方法,传入一个负数,运行程序
 */
public class Test12 {
	public static void main(String[] args) {
//		i.使用满参构造方法创建Student对象,分数传入一个负数,运行程序
//		Student s = new Student("景甜", -10);
//		ii.由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
		
//		iii.使用空参构造创建Student对象
		Student s = new Student();
//		iv.调用setScore(int score)方法,传入一个正数,运行程序
		s.setScore(100);
//		v.调用setScore(int score)方法,传入一个负数,运行程序
		s.setScore(-5);
	}
}
