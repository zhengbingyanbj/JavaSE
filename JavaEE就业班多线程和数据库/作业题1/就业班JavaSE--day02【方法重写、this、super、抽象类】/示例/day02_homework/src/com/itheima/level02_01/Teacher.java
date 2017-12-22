package com.itheima.level02_01;
/*
 2.定义老师类(Teacher),继承Person类
	i.成员变量:  salary(工资)
	ii.成员方法:
		1. 重写父类的 eat()方法
			a)输出: 工资为8000元的30岁的王小平老师在吃工作餐
		2. 特有方法:  lecture() 讲课方法
			a)输出: 工资为8000元的30岁的王小平老师在讲课
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public class Teacher extends Person {
//    salary(工资)
	private int salary;
	
//	重写父类的 eat()方法
	public void eat() {
		System.out.println("工资为"+salary+"元的"+getAge()+"岁的"+getName()+"老师在吃工作餐");
	}
//	lecture() 讲课方法
	public void lecture(){
		System.out.println("工资为"+salary+"元的"+getAge()+"岁的"+getName()+"老师在讲课");
	}
	
//	空参构造
	public Teacher() {
//		没有写会默认提供一个super();
	}
	//	带参构造方法
	public Teacher(String name,int age, int salary) {
		super(name,age);
		this.salary = salary;
	}
	
//	提供setXxx和getXxx方法
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
