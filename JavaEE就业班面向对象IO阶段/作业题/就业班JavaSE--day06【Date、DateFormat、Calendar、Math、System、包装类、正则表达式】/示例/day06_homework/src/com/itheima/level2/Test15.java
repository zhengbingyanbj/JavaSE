package com.itheima.level2;

/*
 使用正则表达式切割字符串
* 192.168.105.27 按照  . 号切割字符串
* 18 22 40 65 按照空格切割字符串
    提示: 由于 . 号 在正则表达式中用于匹配除换行符以外的任意字符,会把字符串切的连渣都不剩,
                 此处使用 . 号需要转义; 使用\\.作为切割使用正则表达式
 
1.在com.itheima.level2包下创建Test15
2.在Test15类中提供main方法,在main方法中
	a)定义字符串变量str1,赋值为192.168.105.27
	b)调用str1的split的方法,传入 “\\.”,使用字符春数组strs1接收
	c)遍历数组strs1,输出每一个元素
	d)定义字符串变量str2,赋值为 18  22  40  65
	e)调用str1的split的方法,传入“\\s+”,使用字符春数组strs2接收
	f)遍历数组strs2,输出每一个元素
 */
public class Test15 {
	public static void main(String[] args) {
//		a)定义字符串变量str1,赋值为192.168.105.27
		String str1 = "192.168.105.27";
//		b)调用str1的split的方法,传入 “\\.”,使用字符春数组strs1接收
		String[] strs1 = str1.split("\\.");
//		c)遍历数组strs1,输出每一个元素
		for (int i = 0; i < strs1.length; i++) {
			System.out.print(strs1[i]+" ");
		}  
		System.out.println();
//		d)定义字符串变量str2,赋值为 18  22  40  65
		String str2 = "18  22  40  65";
//		e)调用str1的split的方法,传入“\\s+”,使用字符春数组strs2接收
		String[] strs2 = str2.split("\\s+");
//		f)遍历数组strs2,输出每一个元素
		for (int i = 0; i < strs2.length; i++) {
			System.out.print(strs2[i]+" ");
		}  
		System.out.println();
	}
}
