package com.itheima.level2_03;
/*
 6.定义会表演的大猩猩(ActedGorilla),继承大猩猩类(Gorilla),实现表演者接口
	a)实现抽象方法表演(play)
		i.输出格式: 3岁的黑色大猩猩在表演骑自行车
	b)提供: 空参,带参构造;
 */
public class ActedGorilla extends Gorilla implements Actor {
//a)实现抽象方法表演(play)
//	i.输出格式: 3岁的黑色大猩猩在表演骑自行车
	public void play(){
		System.out.println(getAge()+"岁的"+getColor()+"大猩猩在表演骑自行车");
	}
//b)提供: 空参,带参构造;
	public ActedGorilla() {
		super();
	}
	public ActedGorilla(String color, int age) {
		super(color, age);
	}
}
