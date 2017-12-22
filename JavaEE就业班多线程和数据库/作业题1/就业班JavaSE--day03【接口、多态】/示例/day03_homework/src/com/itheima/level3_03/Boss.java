package com.itheima.level3_03;
/*
 9.老板类Boss类
	a)属性: 年龄,姓名
	b)行为: 
		i.安排工作(letWork(Employee e)
			1.调用e对象的工作方法
		ii.组织表演(letPlay(Actor a)
			1.调用a对象的,表演方法.
	c) 提供空参,带参构造方法;setters和getters方法
 */
public class Boss {
//	a)属性: 年龄,姓名
	private String name;
	private int age;
//	b)行为: 
//		i.安排工作(letWork(Employee e)
//			1.调用e对象的工作方法
	public void letWork(Employee e){
		e.work();
	}
//		ii.组织表演(letPlay(Actor a)
//			1.调用a对象的,表演方法.
	public void letPlay(Actor a){
		a.play();
	}
//	c) 提供空参,带参构造方法;setters和getters方法
	public Boss() {
		super();
	}
	public Boss(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
