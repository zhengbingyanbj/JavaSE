package com.itheima.level2;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 写代码验证使用SimpleDateFormat把日期转换为字符串的时候;
 创建SimpleDateFormat对象,比较消耗程序的执行性能
 
 
1.在com.itheima.level2包下创建Test14类
2.在Test14类中提供main方法,在main方法中
	a)使用System的currentTimeMillis()方法获取当前操作系统的毫秒值,作用程序执行的开始时间,使用start变量接收
	b)需要测试执行性能的代码
	c)使用System的currentTimeMillis()方法获取当前操作系统的毫秒值,作用程序执行的结束时间,使用end变量接收
	d)计算代码执行花费的时间 end - start,输出代码执行消耗的时间
3.在Test14类中提供一个静态方法testSimpleDataFormatInLoop(),在方法中
	a)创建日期(Date)对象 now
	b)写一个循环10000次的for循环
	c)在循环中
	i.创建SimpleDateFormat对象 df,并制定日期格式为yyyy-MM-dd
	ii.调用df的format(Date date),传入now
	d)在main方法中,需要测试执行的性能的代码处调用testSimpleDataFormatInLoop()方法
	e)记录程序执行的效率
4.在Test14类,完整复制testSimpleDataFormatInLoop()方法
	a)改名为testSimpleDataFormatOutLoop
	b)把创建SimpleDateFormat的代码移动到循环外部
	c)在main方法中,注释调用testSimpleDataFormatInLoop();
	d)在语句下一行调用testSimpleDataFormatOutLoop方法
	e)运行程序,查看输出结果,并记录
5.得出结论: 创建日期格式对象,确实比较消耗程序性能,所以在实际开发一般会写一个工具类专门处理,日期的格式化与解析.
*/
public class Test14 {
	
	public static void main(String[] args) {
//		a)使用System的currentTimeMillis()方法获取当前操作系统的毫秒值,作用程序执行的开始时间,使用start变量接收
		long start = System.currentTimeMillis();
//		b)需要测试执行性能的代码
//		testSimpleDataFormatInLoop();//375
		testSimpleDataFormatOutLoop();//80
//		c)使用System的currentTimeMillis()方法获取当前操作系统的毫秒值,作用程序执行的结束时间,使用end变量接收
		long end = System.currentTimeMillis();
//		d)计算代码执行花费的时间 end - start,输出代码执行消耗的时间
		long cost = end - start;
		System.out.println("花费的时间为:"+cost);
	}
	
//	创建SimpleDateFormat对象的代码在循环里面
	public static void testSimpleDataFormatInLoop(){
//		a)创建日期(Date)对象 now
		Date now = new Date();
//		b)写一个循环10000次的for循环
		for(int i=0; i<100000; i++){
//		c)在循环中
//			i.创建SimpleDateFormat对象 df,并制定日期格式为yyyy-MM-dd
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//			ii.调用df的format(Date date),传入now
			df.format(now);
		}
	}
//	创建SimpleDateFormat对象的代码在循环外边
	public static void testSimpleDataFormatOutLoop(){
//		a)创建日期(Date)对象 now
		Date now = new Date();
//		b)写一个循环10000次的for循环
//		创建SimpleDateFormat对象 df,并制定日期格式为yyyy-MM-dd
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0; i<100000; i++){
//		c)在循环中
//			ii.调用df的format(Date date),传入now
			df.format(now);
		}
	}
}
