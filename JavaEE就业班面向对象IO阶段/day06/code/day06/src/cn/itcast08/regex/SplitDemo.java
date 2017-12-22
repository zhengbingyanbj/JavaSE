package cn.itcast08.regex;
/*
 * 正则表达式  
 */
public class SplitDemo {
     public static void main(String[] args) {
	   
    	 String s = "2017-10-27";
    	 
    	 String regex = "-";//这就是一个正则表达式  
    	                    //正在表示规则的字符串
    	 String[] strings = s.split(regex);
    	 
    	 System.out.println(strings[0]);
    	 System.out.println(strings[1]);
    	 System.out.println(strings[2]);
	 }
}
