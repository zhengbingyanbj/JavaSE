package cn.itcast08.regex;

import java.util.Scanner;

/*
 * String[] split(String regex) 
          根据给定正则表达式的匹配拆分此字符串。
          
   boolean matches(String regex) 
          告知此字符串是否匹配给定的正则表达式 
          
          按照规则 进行匹配 对象是否 符合规则 
          
          验证手机号码 是否正确
          1：第一位 必须为1
          2：第二位 3 4 5 7 8 
          3：第三位 0-9
             第四位0-9
             。。。
             第十一位 0-9  
             
             有九个 匹配的操作 都是0-9
 */
public class MatchesDemo {
	public static void main(String[] args) {
		  System.out.println("请您 录入一个手机号");
		  String number = new Scanner(System.in).nextLine();
		  
		  String regex = "1[34578][0-9]{9}";
		  //检查 我们的字符串 是否符合 regex这个规则
		  boolean b = number.matches(regex);
		  if(b){
			  System.out.println("正确");
		  }else{
			  System.out.println("错误");
		  }
		  
		  
	  }
}
