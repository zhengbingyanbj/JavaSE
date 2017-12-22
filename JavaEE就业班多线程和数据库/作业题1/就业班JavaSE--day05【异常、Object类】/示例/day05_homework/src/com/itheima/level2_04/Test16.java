package com.itheima.level2_04;

/*
请使用代码描述
写一个方法实现用户登陆,插,传入用户名和密码
	如果用户名错误,就抛出自定义登陆异常(LoginException),异常信息为用户名不存在
	如果密码错了就也抛出登陆异常,异常信息为密码错误.
	如果用户名和密码都对了,输出: 欢迎xxx
 
说明:正确用户名和密码都是admin
   
   
1.定义异常类LoginException继承Exception
	a)提供空参和有参构造
2.创建测试类Test
	a)提供一个用于登陆的方法login(String name,String pwd),在放方法中
		i.如果用户名错误,就抛出自定义登陆异常(LoginException),异常信息为用户名不存在
		ii.如果密码错了就也抛出登陆异常,异常信息为密码错误.
		iii.如果能来到下面,就说明用户和密码都是对的,输出: 欢迎xxx
	b)提供main方法,在main方法
		i.调用login方法,传入错误用户名,运行程序,报运行时异常,然后注释这行代码
		ii.调用login方法,传入正确用户名,错误的命名,运行程序,报运行时异常,然后注释这行代码
		iii.调用login方法,传入正确的用户名和密码
 */

public class Test16 {
//	a)提供一个用于登陆的方法login(String name,String pwd),在放方法中
	public static void login(String name,String pwd) throws LoginException{
//		i.如果用户名错误,就抛出自定义登陆异常(LoginException),异常信息为用户名不存在
		if(!"admin".equals(name)){
			throw new LoginException("用户名:"+name+"不存在");
		}
//		ii.如果密码错了就也抛出登陆异常,异常信息为密码错误.
		if(!"admin".equals(pwd)){
			throw new LoginException("密码错误");
		}
//		iii.如果能来到下面,就说明用户和密码都是对的,输出: 欢迎xxx
		System.out.println("欢迎"+name);
	}
	
	public static void main(String[] args) {
		
		try {
//		i.调用login方法,传入错误用户名,运行程序,报运行时异常,然后注释这行代码
//			login("ax", "xx");
//			ii.调用login方法,传入正确用户名,错误的命名,运行程序,报运行时异常,然后注释这行代码
//			login("admin", "123");
//			iii.调用login方法,传入正确的用户名和密码
			login("admin", "admin");
		} catch (LoginException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
