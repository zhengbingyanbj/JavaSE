package com.itheima.level02_05;

/*
 5.定义啄木鸟(Pecker)继承食肉类动物(Carnivore)
	a)重写eat()方法
		i.输出格式: 年龄为 1岁的2条腿的啄木鸟的在吃昆虫
	b)提供空参和有参构造方法
 */
public class Pecker extends Carnivore {
//a)重写eat()方法
//	i.输出格式: 年龄为 1岁的2条腿的啄木鸟的在吃昆虫
	public void eat(){
		System.out.println("年龄为 "+getAge()+"岁的"+getNumOfLegs()+"条腿的啄木鸟的在吃昆虫");
	}
//b)提供空参和有参构造方法
	public Pecker() {
		super();
	}

	public Pecker(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
