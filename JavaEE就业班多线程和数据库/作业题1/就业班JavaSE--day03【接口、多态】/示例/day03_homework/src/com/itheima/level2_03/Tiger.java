package com.itheima.level2_03;

/*
 3.定义老虎类(Tiger),继承动物类(Animal)
	a)实现抽象方法: 吃(eat)
		i.输出格式: 2岁的黄色老虎吃肉
	b)提供: 空参,带参构造;
 */
public class Tiger extends Animal  {
//a)实现抽象方法: 吃(eat)
//	i.输出格式: 2岁的黄色老虎吃肉
	public void eat(){
		System.out.println(getAge()+"岁的"+getColor()+"老虎吃肉");
	}
//b)提供: 空参,带参构造;
	public Tiger() {
		super();
	}
	public Tiger(String color, int age) {
		super(color, age);
	}
}
