package cn.itcast03.dataformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 *   你已经愉快的度过了多少天
 *   
 *      1：键盘录入 你的出生日期
 *        要求 yyyy-MM-dd 
 *     
 *      2: 根据录入的字符串 解析成 日期对象
 *      
 *      3：获取当前的日期对象
 *      
 *      4：获取当前时间的毫秒-出生日期的毫秒
 *      
 *      5：将毫秒转换成天
 *            
 */
public class Test {
   public static void main(String[] args) throws ParseException {
	    //键盘录入
	   System.out.println("请录入您的生日：格式 yyyy-MM-dd");
	  
	   String  birthday= new Scanner(System.in).nextLine();
	   
	   //解析成Date对象
	   //创建日期格式化类 
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   
	   Date birthDate = sdf.parse(birthday);
	   
	   Date nowDate = new Date();
	   
	   long time = nowDate.getTime()-birthDate.getTime();
	   
	   System.out.println("已经愉快滴度过了："+(time/1000/60/60/24)+"天");
	   
    }
}
