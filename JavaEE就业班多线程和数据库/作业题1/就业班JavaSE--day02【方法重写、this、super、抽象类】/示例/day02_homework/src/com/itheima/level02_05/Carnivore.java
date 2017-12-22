package com.itheima.level02_05;

/*
 2.定义抽象类食肉类动物(Carnivore)继承自动物类(Animal)
	a)提供空参和有参构造方法
 */
public abstract class Carnivore extends Animal {
	
//	   a)提供空参和有参构造方法
	public Carnivore() {
		super();
	}

	public Carnivore(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
