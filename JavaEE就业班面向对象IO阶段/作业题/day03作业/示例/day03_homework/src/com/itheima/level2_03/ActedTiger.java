package com.itheima.level2_03;

/*
 4.定义会表演的老虎类(ActedTiger),继承老虎类(Tiger),实现表演者接口
	a)实现抽象方法表演(play)
		i.输出格式: 2岁的黄色老虎在表演钻火圈
	b)提供: 空参,带参构造;
 */
public class ActedTiger  extends Tiger implements Actor{
//a)实现抽象方法表演(play)
//		i.输出格式: 2岁的黄色老虎在表演钻火圈
	public void play(){
		System.out.println(getAge()+"岁的"+getColor()+"老虎在表演钻火圈");
	}
//b)提供: 空参,带参构造;
	public ActedTiger() {
		super();
	}
	public ActedTiger(String color, int age) {
		super(color, age);
	}
}
