package com.itheima.level3_02;
/*
 4.定义会卖萌的狗类(ActingCuteDog) 继承狗类(Dog) 实现卖萌接口(ActingCute)
	a)实现接口中的卖萌方法:actingCute())
		i.输出格式: 2岁黑色的狗在装无辜
	b)提供:空参,有参构造方法
 */
public class ActingCuteDog extends Dog implements ActingCute{
//a)实现接口中的卖萌方法:actingCute())
//	i.输出格式: 2岁黑色的狗在装无辜
	public void actingCute(){
		System.out.println(getAge()+"岁"+getColor()+"的狗在装无辜");
	}
//b)提供:空参,有参构造方法
	public ActingCuteDog() {
		super();
	}
	
	public ActingCuteDog(String color, int age) {
		super(color, age);
	}
}
