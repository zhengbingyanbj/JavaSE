package com.itheima.level02_05;
/*
 4.定义老虎类(Tiger)继承食肉类动物(Carnivore)
	a)重写eat()方法
		i.输出格式: 年龄为 2的4条腿的老虎在吃羊
	b)提供空参和有参构造方法
 */
public class Tiger extends Carnivore {

//	a)重写eat()方法
//		i.输出格式: 年龄为 2的4条腿的老虎在吃羊
	public void eat() {
		System.out.println("年龄为 "+getAge()+"的"+getNumOfLegs()+"条腿的老虎在吃羊");
	}
//	b)提供空参和有参构造方法
	public Tiger() {
		super();
	}

	public Tiger(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
