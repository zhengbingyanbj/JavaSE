package com.itheima.level03_01;

/*
 3. 定义大熊猫（Panda）类 继承 动物（Animal）类
     1. 成员方法：
 		1. 重写父类的eat()方法
     		输出格式： 白色4条腿的大熊猫在吃竹子
 		2. 特有方法: 爬树(climbTree)
		输出格式: 黑色4条腿的大熊猫在爬树
     2. 提供：带参构造方法
 */
public class Panda extends Animal {
//    1. 成员方法：
//		1. 重写父类的eat()方法
//    		输出格式： 白色4条腿的大熊猫在吃竹子
	public void eat() {
		System.out.println(getColor()+getNumOfLegs()+"条腿的大熊猫在吃竹子");
	}
//		2. 特有方法: 爬树(climbTree)
//		输出格式: 黑色4条腿的大熊猫在爬树
	public void climbTree(){
		System.out.println(getColor()+getNumOfLegs()+"条腿的大熊猫在爬树");
	}
//    2. 提供：带参构造方法
	public Panda() {
		super();
	}

	public Panda(String color, int numOfLegs) {
		super(color, numOfLegs);
	}
	
}
