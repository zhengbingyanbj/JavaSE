package cn.itcast04.calendar;

import java.util.Calendar;

/*
 * Calendar是日历类，在Date后出现，替换掉了许多Date的方法。该类将所有可能用到的时间信息封装为静态成员变量，方便获取。
 * 
 * 
 * Calendar为抽象类，
 *     由于语言敏感性，Calendar类在创建对象时并非直接创建，
 *       而是通过静态方法创建，将语言敏感内容处理好，再返回子类对象
 *       
 *     static  Calendar  getInstance()
 */
public class CalendarDemo {
    public static void main(String[] args) {
	    //获取  Calendar  对象
    	Calendar c = Calendar.getInstance();
    	
    	System.out.println(c);
	}
}
