package com.itheima.level3_02;
/*
 3.定义狗类(Dog)继承动物类(Animal)
	a)实现父类抽象吃(eat)方法
		i.输出格式: 2岁黑色的狗在肯骨头
	b)特有方法: 看家(lookHome)
		i.输出格式: 2岁黑色的狗在看家
	c)提供:空参,有参构造方法
 */
public class Dog extends Animal {
//	a)实现父类抽象吃(eat)方法
//	   i.输出格式: 2岁黑色的狗在肯骨头
	public void eat(){
		System.out.println(getAge()+"岁"+getColor()+"的狗在肯骨头");
	}
//	b)特有方法: 看家(lookHome)
//		i.输出格式: 2岁黑色的狗在看家
	public void lookHome(){
		System.out.println(getAge()+"岁"+getColor()+"的在看家");
	}
//  c)提供:空参,有参构造方法
	public Dog() {
		super();
	}
	public Dog(String color, int age) {
		super(color, age);
	}
}
