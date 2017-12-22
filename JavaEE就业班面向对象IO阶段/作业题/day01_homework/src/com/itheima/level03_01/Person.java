package com.itheima.level03_01;

/*
   2. 定义人（Person）类
  	 1. 属性： 名称（name）,年龄（age）
     2. 行为： 洗衣服,把衣服对象作为参数传入
     	输出格式为： 18岁的欧阳青青正在洗一件白色的LiNing牌的衣服
     3. 提供：带参构造方法
 */
public class Person {
//	名称
	private String name;
//	年龄
	private int age;
	
//	洗衣服
	public void wash(Clothes c){
		System.out.println(age+"岁的"+name+"正在洗一件"+c.getColor()+"的"+c.getBrand()+"牌的衣服");
	}

//	带参构造
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
