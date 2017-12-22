package com.itheima.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
请用代码实现如下需求:
	把你的生日字符串表示转换为对应的日期对象.     
 
 
1.在com.itheima.level1包下创建Test10类
2.在Test10类中,提供main方法,在main方法中
	a)创建SimpleDateFormat对象 df,并制定日期格式
	b)调用df的parse(String str)方法,传入你的生日字符串;结束返回的日期对象
	c)打印这个日期对象
	d)使用try...catch处理解析异常
 */
public class Test10 {
	public static void main(String[] args) {

		try {
//			a)创建SimpleDateFormat对象 df,并制定日期格式
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//			b)调用df的parse(String str)方法,传入你的生日字符串;结束返回的日期对象
			Date date = df.parse("1999-09-09");
//			c)打印这个日期对象
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
