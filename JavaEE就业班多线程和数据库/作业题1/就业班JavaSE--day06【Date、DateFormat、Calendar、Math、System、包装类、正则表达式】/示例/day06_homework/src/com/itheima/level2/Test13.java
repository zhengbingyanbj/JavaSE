package com.itheima.level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
请使用代码实现
	计算你活了多少天

1.创建包com.itheima.level2
2.在包中创建测试类Test13
3.在Test13类中,提供main方法,在main方法中
	a)把你生日的字符串,转换为日期对象
	b)把日期对象转换为对应的毫秒值
	c)获取当前系统的毫秒值
	d)当前系统毫秒值-出生时间对于的毫秒值计算你活的毫秒值
	e)把你活毫秒值转换为天
	f)输出天数
	g)使用try...catch处理异常
	
 */
public class Test13 {
	public static void main(String[] args) {

		try {
//			a)把你生日的字符串,转换为日期对象
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date birthDay = df.parse("1999-09-09");
//			b)把日期对象转换为对应的毫秒值
			long birthTime = birthDay.getTime();
//			c)获取当前系统的毫秒值
			long now = System.currentTimeMillis();
//			d)当前系统毫秒值-出生时间对于的毫秒值计算你活的毫秒值
			long liveTime = now - birthTime;
//			e)把你活毫秒值转换为天
			long day = liveTime / 1000 / 60 / 60 / 24;
//			f)输出天数
			System.out.println("活了"+day+"天");
		} catch (ParseException e) {
			e.printStackTrace();
		} 
	}
}
