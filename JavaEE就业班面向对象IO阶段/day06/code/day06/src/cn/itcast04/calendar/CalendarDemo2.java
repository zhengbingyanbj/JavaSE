package cn.itcast04.calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar是日历类，在Date后出现，替换掉了许多Date的方法。该类将所有可能用到的时间信息封装为静态成员变量，方便获取。
 * 
 * 
 * Calendar为抽象类，
 *     由于语言敏感性，Calendar类在创建对象时并非直接创建，
 *       而是通过静态方法创建，将语言敏感内容处理好，再返回子类对象
 *       
 *     static  Calendar  getInstance()
 *     
 *     
 *  常见方法 
 *     public int get(int field)
 */
public class CalendarDemo2 {
    public static void main(String[] args) {
	    //获取  Calendar  对象
    	Calendar c = Calendar.getInstance();
    
    	//获取日历中的年 
    	
//    	int year = c.get(1);
    	
    	int year = c.get(Calendar.YEAR);
    	int month = c.get(Calendar.MONTH)+1;
    	int day = c.get(Calendar.DAY_OF_MONTH);
    	
    	System.out.println(year+"年"+month+"月"+day+"日");
    	
    	//public final void set(int field,int value)//设置指定字段的值
    	
    	c.set(Calendar.YEAR, 2000);
    	int year2 = c.get(Calendar.YEAR);
    	int month2 = c.get(Calendar.MONTH)+1;
    	int day2 = c.get(Calendar.DAY_OF_MONTH);
    	
    	System.out.println(year2+"年"+month2+"月"+day2+"日");
    	
    	//  日历对象  时间对象
    	//  将日历对象转换成 Date对象 
    	//  Date getTime()方法
    	Date date = c.getTime();
    	System.out.println(date);
    	
	}
}
