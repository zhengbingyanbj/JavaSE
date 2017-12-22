package com.itheima.level03_01;

/*
 请用代码描述: 18岁的欧阳青青正在洗一件白色的LiNing牌的衣服
 
 操作步骤
  1. 定义衣服（Clothes）类
  	 1. 属性： 颜色（color），品牌(brand)
  	 2. 提供带参构造和setXxx和getXxx方法
  2. 定义人（Person）类
  	 1. 属性： 名称（name）,年龄（age）
     2. 行为： 洗衣服,把衣服对象作为参数传入
     	输出格式为： 18岁的欧阳青青正在洗一件白色的LiNing牌的衣服
     3. 提供：带参构造方法
  3. 定义测试类Test
  	 1. 提供main方法
  	 2. 在main方法中
  	 	1. 使用人类的带参构造创建人匿名对象，把name赋值为欧阳青请，把age赋值为18
  	 	2. 使用人的匿名对象调用洗衣服的方法，传出使用衣服类的带参构造创建的衣服的匿名对象，把衣服对象的颜色赋值为白色，品牌赋值为LiNing
  	 
 */
public class Test {
	public static void main(String[] args) {
//		1. 使用人类的带参构造创建人匿名对象，把name赋值为欧阳青请，把age赋值为18
//  	2. 使用人的匿名对象调用洗衣服的方法，传出使用衣服类的带参构造创建的衣服的匿名对象，把衣服对象的颜色赋值为白色，品牌赋值为LiNing
		new Person("欧阳青请", 18).wash(new Clothes("白色", "LiNing"));
	}
}
