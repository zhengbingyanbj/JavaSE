package com.itheima.level02_05;
/*
 3.定义抽象类食草类动物(Herbivore)继承自动物类(Animal)
	a)提供空参和有参构造方法
 */
public abstract class Herbivore extends Animal {
//	a)提供空参和有参构造方法
	public Herbivore() {
		super();
	}

	public Herbivore(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
