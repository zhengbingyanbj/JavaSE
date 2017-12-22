package com.itheima.level1;

import java.util.Calendar;

/*
使用代码实现
500天后是几几年几月几日.

1.创建包com.itheima.level1中创建Test11
2.在Test11类中,提供main方法,在main方法中
	a)获取当前日历对象
	b)调用日期对象的add()方法,让当前日历向后移动500天
	c)获取日历中的年,月,日
	d)输出几几年几月几日.
 */
public class Test11 {
	public static void main(String[] args) {
//		a)获取当前日历对象
		Calendar c = Calendar.getInstance();
//		b)调用日期对象的add()方法,让当前日历向后移动500天
		c.add(Calendar.DATE, 500);
//		c)获取日历中的年,月,日
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
//		d)输出几几年几月几日.
		System.out.println(year+"年"+month+"月"+day+"日");
	}
}
