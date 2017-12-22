package com.itheima.level2_03;

/*
 7.定义鹦鹉类(Parrot),继承动物类(Animal)
	a)实现抽象方法: 吃(eat)
		i.输出格式: 1岁的绿色鹦鹉在吃小米
	b)特有方法: 说话(say)
		i.输出格式: 1岁的绿色鹦鹉在说你好
	c)提供: 空参,带参构造;
 */
public class Parrot extends Animal {
//a)实现抽象方法: 吃(eat)
//	i.输出格式: 1岁的绿色鹦鹉在吃小米
	public void eat(){
		System.out.println(getAge()+"岁的"+getColor()+"鹦鹉在吃小米");
	}
//b)特有方法: 说话(say)
//	i.输出格式: 1岁的绿色鹦鹉在说你好
	public void say(){
		System.out.println(getAge()+"岁的"+getColor()+"鹦鹉在说你好");
	}
//c)提供: 空参,带参构造;  
	public Parrot() {
		super();
	}
	public Parrot(String color, int age) {
		super(color, age);
	}
}
