package com.itheima.level3;

import java.util.Scanner;

/*
 模拟验证手机号的过程，按照以下要求实现相关代码（友情提示：不一定要用正则）
	a.	提示用户在控制台输入手机号，用一个字符串对其进行保存
	b.	判断该手机号位数是否是11位
	c.	判断该手机号，是否都是数字
	d.	判断改手机号最后3为数字如果是相同数字则认为是靓号
	
1.在包:com.itheima.level3中,创建类Test20,
2.在Test19类中提供main方法,在mian方法中
	a)创建键盘录入对象
	b)获取用户录入的手机号码
	c)判断该手机号位数是否是11位,如果不是打印手机号码位数有误,方法结束
	d)判断该手机号，是否都是数字; ,如果不是打印存在非法字符,方法结束
	e) 判断改手机号最后3为数字如果是相同数字则认为是靓号,输出手机号是靓号,否则输出手机号不是靓号
 */
public class Test20 {
	public static void main(String[] args) {
//		a)创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		b)获取用户录入的手机号码
		System.out.println("请录入一个手机号码");
		String phone = sc.nextLine();
//		c)判断该手机号位数是否是11位,如果不是打印手机号码位数有误,方法结束
		if(phone.length() != 11){
			System.out.println("手机号码位数有误");
			return;
		}
//		d)判断该手机号，是否都是数字; ,如果不是打印存在非法字符,方法结束
		if(!phone.matches("\\d+")){
			System.out.println("存在非法字符");
			return;
		}
//		e) 判断改手机号最后3为数字如果是相同数字则认为是靓号,输出靓号,否则输出不是靓号
//		获取后三位的字符
		char last1 = phone.charAt(phone.length()-1);
		char last2 = phone.charAt(phone.length()-2);
		char last3 = phone.charAt(phone.length()-3);
//		如果后三位的字符相同,则认为是靓号
		if(last1 == last2 && last2 == last3){
			System.out.println("手机号"+phone+"是靓号");
		}else{
			System.out.println("手机号"+phone+"不是是靓号");
		}
	}
}
