package com.itheima.level02_05;

/*
 1.��������ද����(Animal)
	a)��Ա����:����(age),�ȵĸ���(numOfLegs)
	b)���󷽷�: void eat()
	c)�ṩ�ղκ��вι��췽����setXxx��getXxx����
 */
public abstract class Animal {
//	a)��Ա����:����(age),�ȵĸ���(numOfLegs)
	private int age;
	private int numOfLegs;
//	b)���󷽷�: void eat()
	public abstract void eat();
//	c)�ṩ�ղκ��вι��췽����setXxx��getXxx����
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
