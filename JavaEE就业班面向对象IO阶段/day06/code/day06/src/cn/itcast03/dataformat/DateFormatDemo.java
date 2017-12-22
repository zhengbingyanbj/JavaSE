package cn.itcast03.dataformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *   
 *   DateFormat 日期格式化类  将日期对象 按照指定的 格式进行展示
 *   
 *     将一个日期对象  转换成 指定格式的  字符串
 *     
 *     请录入生日 按照"yyyy-MM-dd"格式      将指定格式的时间字符串  解析成  Date对象
 *     
 *    DateFormat 是日期格式化 抽象类，它以与语言无关的方式格式化并解析日期或时间
 *    
 *       日期格式化子类（如 SimpleDateFormat）
 *      
 *    SimpleDateFormat 构造
 *      SimpleDateFormat(String pattern) 
 *            String pattern 就是 你指定转换成字符串的样式
 *       
 *       允许进行
 *    String format(Date date)     
 *       格式化（也就是日期 -> 文本）  Date对象 转换成字符串
 *    Date parse(String source)    
 *       解析（文本-> 日期）     将字符串 解析成 Date对象
 */
public class DateFormatDemo {
   public static void main(String[] args) {
	     Date date = new Date();
	     //将 当前的时间 转换成 一个  2017年11月27日  15:52:30
	     //创建 SimpleDateFormat对象 并指定 字符串的样式
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss");
	     
	     //调用  格式化功能
	     String s = sdf.format(date);
	     
	     System.out.println(s);
	     
	     
   }
}
