package com.itheima.level02_04;

/*
 

请使用代码描述:  
	4条腿黑色的狗会吃饭(吃骨头)和看家 
	2条腿的绿色鹦鹉吃饭(吃小米)和说话.
	要求: 把狗和鹦鹉的共性抽取动物类中,使用抽象类和抽象方法 
 
1.定义抽象类 动物类(Animal)
	i.成员变量(私有):  颜色(color),腿的个数(numOfLegs)
	ii.抽象方法:  吃饭(void eat())
	iii.提供空参和带参构造方法
	iv.提供setXxx和getXxx方法
2.定义狗类(Dog),继承Animal类
	i.成员方法:
		1.重写父类的 eat()方法
			a)输出格式::  4条腿黑色的狗在啃骨头
		2. 特有方法:  看家(lookHome)
			a)输出格式::  4条腿黑色的狗在看家.
	ii.提供空参和带参构造方法
3.定义鹦鹉类(Parrot),继承Animal类
	i.成员方法:
		1. 重写父类的 eat()方法
			a)输出格式:: 2条腿的绿色鹦鹉在吃小米
		2. 特有方法: say()  说明
			a)输出格式::  2条腿的绿色鹦鹉在说你好,丑八怪
	ii.提供空参和带参构造方法
4.定义Test类	
	a)提供main方法
	b)在main方法中
		i.创建Dog对象d,并把颜色赋值为”黑色”,腿的个数赋值为4
		ii.调用Dog对象d的吃饭方法
		iii.调用Dog对象d的看家方法
		iv.创建Porrot对象 p,并把颜色赋值为”绿色”,腿的个数赋值为2.
		v.调用Porrot对象 p 的吃饭方法
		vi.调用Porrot对象 p 的说话方法
 */
public class Test {
	public static void main(String[] args) {
//		i.创建Dog对象d,并把颜色赋值为”黑色”,腿的个数赋值为4
		Dog d = new Dog("黑色",4);
//		ii.调用Dog对象d的吃饭方法
		d.eat();
//		iii.调用Dog对象d的看家方法
		d.lookHome();
//		iv.创建Porrot对象 p,并把颜色赋值为”绿色”,腿的个数赋值为2.
		Parrot p = new Parrot("绿色",2);
//		v.调用Porrot对象 p 的吃饭方法
		p.eat();
//		vi.调用Porrot对象 p 的说话方法
		p.say();
	}
}
