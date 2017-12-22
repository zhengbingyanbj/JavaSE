package com.itheima.level02_05;

/*
 1.定义抽象类动物类(Animal)
	a)成员变量:年龄(age),腿的个数(numOfLegs)
	b)抽象方法: void eat()
	c)提供空参和有参构造方法和setXxx和getXxx方法
 */
public abstract class Animal {
//	a)成员变量:年龄(age),腿的个数(numOfLegs)
	private int age;
	private int numOfLegs;
//	b)抽象方法: void eat()
	public abstract void eat();
//	c)提供空参和有参构造方法和setXxx和getXxx方法
	public Animal() {
		super();
	}
	
	public Animal(int age, int numOfLegs) {
		super();
		this.age = age;
		this.numOfLegs = numOfLegs;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumOfLegs() {
		return numOfLegs;
	}
	public void setNumOfLegs(int numOfLegs) {
		this.numOfLegs = numOfLegs;
	}
	
}
