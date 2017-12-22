package com.itheima.level3_02;
/*
 6.定义会卖萌的猫类(ActingCuteCat) 继承猫类(Cat) 实现卖萌接口(ActionCute)
	a)实现接口中的卖萌方法:actingCute())
		i.输出格式: 1岁白色的猫在扮可怜
	b)提供:空参,有参构造方法
 */
public class ActingCuteCat  extends Cat implements ActingCute{
//a)实现接口中的卖萌方法:actingCute())
//	i.输出格式: 1岁白色的猫在扮可怜
	public void actingCute(){
		System.out.println(getAge()+"岁"+getColor()+"的猫在扮可怜");
	}
//b)提供:空参,有参构造方法
	public ActingCuteCat() {
		super();
	}
	public ActingCuteCat(String color, int age) {
		super(color, age);
	}
}
