package com.itheima.level3_02;
/*
5.定义猫类(Cat) 继承动物类(Animal)
	a)实现父类的吃(eat)方法
		i.输出格式: 1岁白色的猫在吃鱼
	b)特有方法:抓老鼠
		i.输出格式: 1岁白色的猫在抓老鼠
	c)提供:空参,有参构造方法
 */
public class Cat extends Animal{
//a)实现父类的吃(eat)方法
//	i.输出格式: 1岁白色的猫在吃鱼
	public void eat(){
		System.out.println(getAge()+"岁"+getColor()+"的猫在吃鱼");
	}
//b)特有方法:抓老鼠
//	i.输出格式: 1岁白色的猫在抓老鼠
	public void catchMouse(){
		System.out.println(getAge()+"岁"+getColor()+"的猫在抓老鼠");
	}
//c)提供:空参,有参构造方法
	public Cat() {
		super();
	}
	public Cat(String color, int age) {
		super(color, age);
	}
}
