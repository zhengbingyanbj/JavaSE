package com.itheima.level03_02;
/*

请使用代码描述: 
 	4个轮子的白色的汽车可以跑(开着跑)和加油
 	2个轮子的红色电动自行车可以跑(骑着跑)和充电
 	要求: 把汽车和电动自行车的共性抽取到交通工具类中,使用抽象类和抽象方法

1. 定义抽象交通工具类(Vehicle)
	a)成员变量
		i.轮子个数 wheel 
		ii.颜色 color
	b)抽象方法
		i.跑  run()  
	c)要求： 提供提供空参构造和带参构造以及getters和setters方法
2.定义小汽车类(Car),继承Vehicle类
	a)成员方法
		i.重写父类的run方法
			1.输出格式： 4个轮子的白色的汽车开着跑
		ii.特有方法: 加油 (addGasoline() )
			1.在方法中的输出格式为: 4个轮子的白色汽车在加油
	b) 要求：提供空参构造和带参构造
3.定义电动车类(ElectricBicycle),继承Vehicle类
	a)成员方法
		i.重写父类的run方法
			1.输出格式： 2个轮子的黑色的电动车骑着跑
		ii.特有成员方法: 充电 (charge())
			1.在方法中的输出格式为: 2个轮子的黑色电动自行车在充电
	b) 要求：提供提供空参构造和带参构造
4.定义测试类Test
	a)提供main方法
	b)在main方法中
		①　创建Car 对象c，把颜色赋值为白色，把轮子个数赋值为4 
		②　调用c对象成员方法run方法
		③　 调用c对象的成员方法addGasoline()
		④　 创建ElectricBicycle对象 eb，吧颜色赋值为黑色，轮子个数赋值为2
		⑤　调用ed对象成员方法run方法
		⑥　 调用ed对象成员方法 charge方法
 */
public class Test {
	public static void main(String[] args) {
//		①　创建Car 对象c，把颜色赋值为白色，把轮子个数赋值为4 
		Car c = new Car(4, "白色");
//		②　调用c对象成员方法run方法
		c.run();
//		③　 调用c对象的成员方法addGasoline()
		c.addGasoline();
//		④　 创建ElectricBicycle对象 eb，吧颜色赋值为黑色，轮子个数赋值为2
		ElectricBicycle eb = new ElectricBicycle(2, "黑色");
//		⑤　调用ed对象成员方法run方法
		eb.run();
//		⑥　 调用ed对象成员方法 charge方法
		eb.charge();
	}

}
