package com.itheima.level1_10;
/*
 请用代码实现如下需求:
1.写一个方法实现获取字符串某个索引上的字符的功能
2.写一个测试测试方法调用上面写的方法,使用thows方式进行处理异常,并在main方法中调用这个测试方法
3.再写一个测试测试方法调用上面写的方法,使用try...catch方式进行处理异常,并在main方法中调用这个测试方法


1.定义 Test10类
2.提供一个静态方法:public static char charAt(String str, int index) 用于获取字符串str,index索引处的字符
3.在方法中charAt(String,int index)
	a)	当字符串为null抛出 Exception("字符串不能为null")异常,
	b)	当字符串为"" 的时候抛出 Excetion("字符串不能为空") 异常;
	c)	当index不在 [0,str.length()-1] 之间的时,抛出Exception("索引越界") 异常. 
	d)	否则返回str在index索引的字符
4.提供一个静态的方法testThrows() 用于测试charAt(String,int index)方法
	a)在方法中调用charAt(String,int index)方法;
		i.注意需要测试每一种情况
		ii.体会: 程序一旦遇到异常后面的代码就不执行了
		iii.注释运行过测试的代码,继续测试下一种情况
	b)使用throws方式对异常进行处理
	c)在main方法中,调用本方法
5.提供 一个静态方法testTryCatch(),用于测试charAt(String,int index)方法
	a)在方法中调用charAt(String,int index)方法;
		i.注意需要测试每一种情况
	b)使用try...catch方式对异常进行处理
	c)在main方法中,调用本方法.
 */
public class Test10 {
//	1. 获取字符串某个索引上的字符的功能
	public static char charAt(String str, int index) throws Exception {
//		a)	当字符串为null抛出 Exception("字符串不能为null")异常,
		if(null == str){
			throw new Exception("字符串不能为null");
		}
//		b)	当字符串为"" 的时候抛出 Excetion("字符串不能为空") 异常;
		if(str.equals("")){
			throw new Exception("字符串不能为空");
		}
//		c)	当index不在 [0,str.length()-1] 之间的时,抛出Exception("索引越界") 异常. 
		if(index < 0 || index >= str.length()){
			throw new Exception("索引越界"+index);
		}
//		d)	否则返回str在index索引的字符
		return str.charAt(index);
	}
//	4.提供一个静态的方法testThrows() 用于测试charAt(String,int index)方法
	public static void testThrows() throws Exception{
		  char c;
//		  c = charAt(null, 0);
//		  c = charAt("", 0);
//		  c = charAt("abc",4);
		  c = charAt("abc", 1);
		  System.out.println(c);
	}
	
//	5.提供 一个静态方法testTryCatch(),用于测试charAt(String,int index)方法
	public static void testTryCatch(){
//		a)在方法中调用charAt(String,int index)方法;
//			i.注意需要测试每一种情况
//		b)使用try...catch方式对异常进行处理
		try{
		  char c;
//		  c = charAt(null, 0);
//		  c = charAt("", 0);
//		  c = charAt("abc",4);
		  c = charAt("abc", 1);
		  System.out.println(c);
		}catch(Exception e){
			System.out.println("捕获异常");
			e.printStackTrace();
		}
		System.out.println("程序继续");
	}



	
	public static void main(String[] args) {
//		在main方法中,调用testThrows 方法.
//		 testThrows();
//		在main方法中,调用testTryCatch方法
		 testTryCatch();
	}
	
}
