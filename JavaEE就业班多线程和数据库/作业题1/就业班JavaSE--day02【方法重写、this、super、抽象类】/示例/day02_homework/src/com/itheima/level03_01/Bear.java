package com.itheima.level03_01;

/*
 2. 定义北极熊（Bear）类 继承 动物（Animal）类
     1. 成员方法：
 		1. 重写父类的eat()方法
     		输出格式： 白色4条腿的北极熊在吃蜂蜜
 		2. 特有方法: 抓鱼(catchFish)
			输出格式: 白色4条腿的北极熊在抓鱼
     2. 提供：带参构造方法
 */
public class Bear extends Animal {
	
//    1. 成员方法：
// 		1. 重写父类的eat()方法
//     		输出格式： 白色4条腿的北极熊在吃蜂蜜
	public void eat() {
		System.out.println(getColor()+getNumOfLegs()+"腿的北极熊在吃蜂蜜");
	}
// 		2. 特有方法: 抓鱼(catchFish)
//			输出格式: 白色4条腿的北极熊在抓鱼
	public void catchFish(){
		System.out.println(getColor()+getNumOfLegs()+"腿的北极熊在抓鱼");
	}
	
//  2. 提供：带参构造方法
	public Bear() {
		super();
	}
	public Bear(String color, int numOfLegs) {
		super(color, numOfLegs);
	}
	
}
