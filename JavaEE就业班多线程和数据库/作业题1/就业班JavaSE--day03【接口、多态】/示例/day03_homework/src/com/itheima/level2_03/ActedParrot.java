package com.itheima.level2_03;
/*
 8.定义会会表演的鹦鹉类(ActedParrot),继承鹦鹉类(Parrot),实现表演者接口
	a)实现抽象方法表演(play)
		i.输出格式: 1岁的绿色鹦鹉在表演过跷跷板
	b)提供: 空参,带参构造;
 */
public class ActedParrot extends Parrot implements Actor {
//a)实现抽象方法表演(play)
//	i.输出格式: 1岁的绿色鹦鹉在表演过跷跷板
	public void play(){
		System.out.println(getAge()+"岁的"+getColor()+"鹦鹉在表演过跷跷板");
	}
//b)提供: 空参,带参构造;	
	public ActedParrot() {
		super();
	}
	public ActedParrot(String color, int age) {
		super(color, age);
	}
}
