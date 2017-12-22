package com.itheima.level01_06;
/*
  请使用代码描述： 2岁的棕色加菲猫,在抓老鼠
  
 2. 创建测试类Test01
	a)提供main方法
	b)在main方法中
	a)创建Cat对象,并把名称设置为加菲,颜色设置为棕色,年龄设置为2
	b)调用Cat对象的catchMouse()方法,打印格式如下:
	 	2岁的棕色加菲猫,在抓老鼠
 */
public class Test {
   
	public static void main(String[] args) {
//       创建Cat对象
		 Cat c = new  Cat("加菲", "棕色", 2);
//		 调用抓老鼠方法
		 c.catchMouse();
	}
}
