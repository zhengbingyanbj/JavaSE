package com.itheima.level2_03;

/*
 5.定义大猩猩类(Gorilla),继承动物类(Animal)
	a)实现抽象方法: 吃(eat)
		i.输出格式: 3岁的黑色大猩猩吃香蕉
	b)提供: 空参,带参构造;
 */
public class Gorilla extends Animal {
//a)实现抽象方法: 吃(eat)
//	i.输出格式: 3岁的黑色大猩猩吃香蕉
	public void eat(){
		System.out.println(getAge()+"岁的"+getColor()+"大猩猩吃香蕉");
	}
//b)提供: 空参,带参构造;	
	public Gorilla() {
		super();
	}
	public Gorilla(String color, int age) {
		super(color, age);
	}
}
