package com.itheima.level2_04;

/*
 1.定义异常类LoginException继承Exception
	a)提供空参和有参构造
 */
public class LoginException extends Exception {
	public LoginException() {
		super();
	}
	public LoginException(String message) {
//		一定要调用父类的构造方法
		super(message);
	}
}
