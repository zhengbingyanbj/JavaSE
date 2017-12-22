package com.itheima.level1;
import java.util.Scanner;

/*
编写一个校验用户名的程序,检测键盘录入的用户名是否合法
要求:必须以英文开头,只能包含英文,数字和`_`;最少6位,做多12位	

1.在com.itheima.level1中创建Test12类
2.在Test12类中提供main方法,在main方法中
	a)创建键盘录入对象
	b)接收用户录入的用户名字符串
	c)调用字符串的matches方法,判断用户名是否合法
	d)如果合法就打印: 用户名合法
	e)如果不合法就打印: 用户名不合法
	 
 */
public class Test12 {
	public static void main(String[] args) {
//		a)创建键盘录入对象
		Scanner sc = new Scanner(System.in);
//		b)接收用户录入的用户名字符串
		System.out.println("请录入登陆用户名");
		String userName = sc.nextLine();
//		c)调用字符串的matches方法,判断用户名是否合法
//		必须以英文开头,只能包含英文,数字和`_`;最少6位,做多12位	
		if(userName.matches("[a-zA-Z]\\w{5,11}")){
//		d)如果合法就打印: 用户名合法
			System.out.println("用户名合法");
		}else{
//		e)如果不合法就打印: 用户名不合法
			System.out.println("用户名不合法");
		}
	}
}
