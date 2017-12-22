package com.itheima.level02_07;

/*
 请用代码描述
 	   	 四个轮子的白色的汽车可以跑和加油
		 两个轮子的红色电动自行车可以跑和充电
		 要求: 把汽车和电动自行车的共性抽取到交通工具类中
		 
4.定义测试类Test
	c)提供main方法
	d)在main方法中
		i.使用空参构造,创建Car 对象c
		ii.把c对象的成员wheel 赋值为 4
		iii.把c对象的成员color赋值为 白色
		iv.调用c对象成员方法run方法
		v.调用c对象的成员方法addGasoline()
		vi.使用空参构造,创建ElectricBicycle对象 eb
		vii.把eb对象的成员wheel 赋值为2
		viii.把ed对象的成员color赋值为 黑色
		ix.调用ed对象成员方法run方法
		x.调用ed对象成员方法 charge方法
 */
public class Test {
	public static void main(String[] args) {
//		i.使用空参构造,创建Car 对象c
		Car c = new Car();
//		ii.把c对象的成员wheel 赋值为 4
		c.wheel = 4;
//		iii.把c对象的成员color赋值为 白色
		c.color = "白色";
//		iv.调用c对象成员方法run方法
		c.run();
//		v.调用c对象的成员方法addGasoline()
		c.addGasoline();
//		vi.使用空参构造,创建ElectricBicycle对象 eb
		ElectricBicycle eb = new ElectricBicycle();
//		vii.把eb对象的成员wheel 赋值为2
		eb.wheel = 2;
//		viii.把ed对象的成员color赋值为 黑色
		eb.color = "黑色";
//		ix.调用ed对象成员方法run方法
		eb.run();
//		x.调用ed对象成员方法 charge方法
		eb.charge();
	}
}
