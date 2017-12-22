package com.itheima.level02_05;

/*
 7.定义兔子(Rabbit)继承食草动物(Herbivore)
	a)重写eat()方法
		i.输出格式: 年龄为 1岁的4条腿的兔子在吃狗尾草
	b)提供空参和有参构造方法
 */
public class Rabbit extends Herbivore {
//a)重写eat()方法
//		i.输出格式: 年龄为 1岁的4条腿的兔子在吃狗尾草
	public void eat(){
		System.out.println("年龄为 "+getAge()+"岁的"+getNumOfLegs()+"条腿的兔子在吃狗尾草");
	}
//b)提供空参和有参构造方法
	public Rabbit() {
		super();
	}

	public Rabbit(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
	
}
