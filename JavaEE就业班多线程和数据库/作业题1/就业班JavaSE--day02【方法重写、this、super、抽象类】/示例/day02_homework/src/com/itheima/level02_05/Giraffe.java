package com.itheima.level02_05;
/*
 6.定义长颈鹿(Giraffe)继承食草动物(Herbivore)
	a)重写eat()方法
		i.输出格式: 年龄为 3 岁的4条腿的长颈鹿在吃树叶
	b)提供空参和有参构造方法
 */
public class Giraffe extends Herbivore {
//a)重写eat()方法
//		i.输出格式: 年龄为 3 岁的4条腿的长颈鹿在吃树叶
	public void eat(){
//		子类中访问没有被重写父类的成员方法: 可以直接调用,this.方法名(实际参数列表)调用,也可以super.方法名(实际参数列表)调用
		System.out.println("年龄为 "+this.getAge()+" 岁的"+super.getNumOfLegs()+"条腿的长颈鹿在吃树叶");
	}
//b)提供空参和有参构造方法
	public Giraffe() {
		super();
	}

	public Giraffe(int age, int numOfLegs) {
		super(age, numOfLegs);
	}
}
