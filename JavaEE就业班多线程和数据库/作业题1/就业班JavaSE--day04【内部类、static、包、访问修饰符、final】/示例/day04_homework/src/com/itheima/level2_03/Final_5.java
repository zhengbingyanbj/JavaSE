package com.itheima.level2_03;
/*
 5. 验证:修饰成员变量，需要在创建对象前赋值，否则报错。(当没有显式赋值时，多个构造方法的均需要为其赋值。
 */
public class Final_5 {
//	定义final成员变量a,并显示赋值
	public final int a = 10;
	public final int b;
	

	public Final_5() {
//	    如果把这句话注释,编译报错: The blank final field b may not have been initialized
		b = 20;
	}
	
	public Final_5(int a,int b) {
//	  如果把这句话注释,编译报错: The blank final field b may not have been initialized
		this.b = b;

//		this.a = a; //被final修饰成员变量只能赋值一次
	}
}
