package com.itheima.level2_03;
/*
 2.验证: final修饰的方法不可以被覆盖,但父类中没有被final修饰方法，子类覆盖后可以加final
 
 a)定义类(Final_2),用于验证第二特点
	i.成员方法:
		1.被final修饰的成员方法 finalMethod
		2.普通方法 normalMethod
b)定义子类(Sub2) 继承 Final_2
	i.覆盖 finalMethod编译报错,把鼠标放到红色x上面,提示:Cannot override the final method from Final_2: 被final修饰方法不能被覆盖(重写);
	ii.注释调用这个方法,在上面使用注释写上: final修饰方法不能被覆盖(重写);
	iii.覆盖normalMethod 方法,在权限修饰符 和返回值直接加上final,编译通过,在这个方法上面使用注释写上: 父类中没有被final修饰方法，子类覆盖后可以加final
*/

public class Final_2 {
//	1.被final修饰的成员方法 finalMethod
	public final void finalMethod(){}
//	2.普通方法 normalMethod
	public void normalMethod(){}
}

class Sub2 extends Final_2{
//	final修饰的方法不可以被覆盖
//	public final void finalMethod(){}
	
//	父类中没有被final修饰方法，子类覆盖后可以加final
	public final void normalMethod(){}
}


