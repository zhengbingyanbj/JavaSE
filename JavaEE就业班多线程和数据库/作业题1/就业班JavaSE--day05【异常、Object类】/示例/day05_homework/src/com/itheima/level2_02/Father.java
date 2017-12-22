package com.itheima.level2_02;


/*
2.定义用于测试的父类Father
	a)提供一个吃(eat)的成员方法,抛出牙疼异常
		i.输出吃到一个石子
		ii.抛出一个牙疼的异常
	b)提供一个喝(drink)的成员方法不抛出异常
		i.输出: 喝什么都没有问题
 */
public class Father {
//	a)提供一个吃(eat)的成员方法,抛出牙疼异常
	public void eat() throws ToothPainException  {
//		i.输出吃到一个石子
		System.out.println("吃到一个石头子");
//		ii.抛出一个牙疼的异常
		throw new ToothPainException();
	}
//	b)提供一个喝(drink)的成员方法不抛出异常
	public void drink() {
//	i.输出: 喝什么都没有问题
		System.out.println("喝什么都没有问题");
	}
}
