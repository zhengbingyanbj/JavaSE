package com.itheima.level2;
/*
1.在com.itheima.level2包中
2.创建Test17类,在Test17类中:
	a)提供main方法,在main方法中
	b)定义字符串变量str,赋值为:"Hello12345World6789012"
	c)调用str的replaceAll(String regex,String str),第一个参数传入”\\d+”,第二个参数传入”#”,定义字符串变量newStr接收替换后的字符串
	d)输出: newStr
 */
public class Test17 {
	public static void main(String[] args) {
//		b)定义字符串变量str,赋值为:"Hello12345World6789012"
		String str = "Hello12345World6789012";
//		c)调用str的replaceAll(String regex,String str),第一个参数传入”\\d+”,第二个参数传入”#”,定义字符串变量newStr接收替换后的字符串
		String newStr = str.replaceAll("\\d", "#");
//		d)输出: newStr
		System.out.println(newStr);
	}
}
