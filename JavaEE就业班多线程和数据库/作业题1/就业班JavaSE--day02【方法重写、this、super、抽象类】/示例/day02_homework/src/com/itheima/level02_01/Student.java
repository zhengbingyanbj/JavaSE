package com.itheima.level02_01;
/*
 3.定义学生类(Student),继承Person类
	i.成员变量: score(成绩)
	ii.成员方法:
		1. 重写父类的 eat()方法
			a)输出: 成绩为90分的15岁的李小乐学生在吃学生餐
		2. 特有方法: study() 学习方法
			a)输出: 成绩为90分的15岁的李小乐学生在学习
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public class Student extends Person {
//	score(成绩)
	private int score;
	
//	重写父类的 eat()方法
	public void eat() {
		System.out.println("成绩为"+score+"分的"+getAge()+"岁的"+getName()+"学生在吃学生餐");
	}
//	study() 学习方法
	public void study(){
		System.out.println("成绩为"+score+"分的"+getAge()+"岁的"+getName()+"学生在学习");
	}
	
//	无参构造
	public Student() {
		super();
	}
//	带参构造
	public Student(String name, int age,int score) {
		super(name, age);
		this.score = score;
	}
	
//	提供setXxx和getXxx方法
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
}
