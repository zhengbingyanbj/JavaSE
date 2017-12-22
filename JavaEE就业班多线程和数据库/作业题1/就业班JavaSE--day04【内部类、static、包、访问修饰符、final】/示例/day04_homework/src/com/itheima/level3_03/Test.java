package com.itheima.level3_03;
/*
 请使用代码描述
    某公司成立一个游泳俱乐部,只要是会游泳的都可以加入;
    要求: 使用到接口,接口作为参数,匿名内部类.
    提示: 把游泳功能抽取到接口中 ,在测试类中提供参加运动会的静态方法    
    
1.定义游泳者接口(Swimmer)
	a)抽象方法: 游泳swim
2.定义测试类Test
	a)定义加入游泳俱乐部的方法: join(Swimmer s)
		i.在方法中调用s的swim方法
	b)提供main方法
	c)在main方法中
		i.调用join(Swimmer s) 传入使用接口Swimmer的匿名内部类创建的对象
		ii.在匿名内部类中重写swim方法: 输出:愉快的游泳   
 */
public class Test {
//  a)定义加入游泳俱乐部的方法: join(Swimmer s)
	public static void join(Swimmer s){
//		i.在方法中调用s的swim方法
		s.swim();
	}
	
	public static void main(String[] args) {
//		i.调用join(Swimmer s) 传入使用接口Swimmer的匿名内部类创建的对象
		join(new Swimmer() {
//			ii.在匿名内部类中重写swim方法: 输出:愉快的游泳   
			public void swim() {
				System.out.println("愉快的游泳");
			}
		});

	}
}
