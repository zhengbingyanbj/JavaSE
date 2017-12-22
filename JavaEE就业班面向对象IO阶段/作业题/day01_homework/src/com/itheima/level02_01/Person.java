package com.itheima.level02_01;
/*
   2.定义人类(Person)
	i.成员变量: 姓名(name),年龄(age)
	ii.成员方法: 使用手机玩游戏 (usePhone(Phone p))
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
 */
public class Person {
//	姓名
	private String name;
//	年龄
	private int age;
	
//	成员方法
	public void usePhone(Phone p){
		System.out.print(age+"岁的"+name+"在使用"+p.getBrand()+"的手机");
		p.playGame();
	}
	
//	无参构造
	public Person() {
	}
//	带参构造
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
// setXxx与getXxx方法
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
