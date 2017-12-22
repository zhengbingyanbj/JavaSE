package com.itheima.level1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  请用代码实现:
  获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08
  
  
1.创建包com.itheima.level1
2.定义类Test09
3.提供main方法,在main方法中
	a)获取当前日期对象 now;
	b)创建SimpleDateFormat对象 df,并制定日期格式
	c)调用df的format(Date  date) 方法,传入now; 接收返回的字符串
	d)打印这个字符串
 */
public class Test09 {
	public static void main(String[] args) {
//		a)获取当前日期对象 now;
		Date now = new Date();
//		b)创建SimpleDateFormat对象 df,并制定日期格式
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		c)调用df的format(Date  date) 方法,传入now; 接收返回的字符串
		String datestr = df.format(now);
//		d)打印这个字符串
		System.out.println(datestr);
	}
}
