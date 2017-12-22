package com.itheima.level1_06;
/*
1.定义奥迪车类(Audi)
	a)成员方法: 跑(run())
		i.输出格式: 奥迪车在跑
2.定义智能接口(Smart)
	a)抽象方法: 自动泊车(automaticParking)和无人驾驶(automaticDrive)
3.定义智能奥迪车类(SmartAudi) 继承Audi实现Smart接口
	a)成员方法
	i.实现automaticParking方法
		1.输出:智能奥迪车在自动泊车
	ii.实现automaticDrive方法
		1.输出:智能奥迪车在无人驾驶
4.定义测试类Test
	a)提供main方法
	b)在main方法中
		i.创建Audi车对象 a,调用跑方法
		ii.创建SmartAudi车对象 sa,调用跑,自动泊车,自动驾驶方法
		iii.定义Audi类型的变量 aa 把sa赋值aa; 测试aa只能调用run方法,不能调用其他方法
		iv.判断如果aa是SmartAudi的实例对象, 把aa强制转换为saa;使用saa调用自动泊车和自动驾驶方法
		v.定义Smart类型的变量 s,把sa赋值给s,测试只能调用自动泊车和自动驾驶方法,不能调用run方法.
 */
public class Test {
	public static void main(String[] args) {
//		i.创建Audi车对象 a,调用跑方法
		Audi a = new Audi();
		a.run();
//		ii.创建SmartAudi车对象 sa,调用跑,自动泊车,自动驾驶方法
		SmartAudi sa = new SmartAudi();
		sa.run();
		sa.automaticParking();
		sa.automaticDrive();
//		iii.定义Audi类型的变量 aa 把sa赋值aa; 测试aa只能调用run方法,不能调用其他方法
		Audi aa = sa;
		aa.run();
//		aa.automaticParking(); 编译报错
//		aa.automaticDrive();   编译报错
//		iv.判断如果aa是SmartAudi的实例对象, 把aa强制转换为saa;使用saa调用自动泊车和自动驾驶方法
		if(aa instanceof SmartAudi){
			SmartAudi saa = (SmartAudi) aa;
			saa.automaticParking();
			saa.automaticDrive();
		}
//		v.定义Smart类型的变量 s,把sa赋值给s,测试只能调用自动泊车和自动驾驶方法,不能调用run方法.
		Smart s = sa;
		s.automaticDrive();
		s.automaticParking();
//		s.run(); 编译报错
	}
}
