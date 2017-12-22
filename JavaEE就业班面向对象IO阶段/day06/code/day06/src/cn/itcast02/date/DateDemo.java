package cn.itcast02.date;

import java.util.Date;

/*
 *   Date  表示特定的瞬间   精确毫秒  
 *   
 *   构造
 *     Date()   创建 当前时间的  日期对象
 *     
 *     Date(long time)
 *           time代表 偏移的毫秒值
 *         
 *          创建一个 对基准时间进行time偏移的 日期对象
 *          其实 就是  基准时间+毫秒值 新时间
 *           
 *     
 *     格林威治
 *     1970年1月1日 零时零分零秒  
 *       这是一个基准时间
 *       
 *     1970年1月1日 东八区  八点整
 *     Thu Jan 01 08:00:00 CST 1970  
 *     
 *     
 *   方法 
 *     toString()
 *       Mon Nov 27     15:18:46 CST   2017
 *      星期  月  月中日    时   分 秒   时区      年
 *     
 *      getTime()
 *         获取date对象的  毫秒值
 *         
 *           毫秒值 
 *             date对象的时间 - 基准时间 
 *             
 *             转换成 毫秒这个单位 的结果
 *        
 */
public class DateDemo {
    public static void main(String[] args) {
	   //创建日期对象 使用空参
    	Date date = new Date();
    	
    	System.out.println(date);
    	
    	System.out.println("查看当前时间毫秒值："+date.getTime());
    	System.out.println("---------");
    	Date date2 = new Date(1000*60*60);
    	
    	System.out.println(date2);
    	System.out.println("查看偏移时间毫秒值:"+date2.getTime());
    	
	}
}
