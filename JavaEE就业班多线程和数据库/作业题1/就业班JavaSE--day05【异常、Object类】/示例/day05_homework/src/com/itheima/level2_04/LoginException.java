package com.itheima.level2_04;

/*
 1.�����쳣��LoginException�̳�Exception
	a)�ṩ�ղκ��вι���
 */
public class LoginException extends Exception {
	public LoginException() {
		super();
	}
	public LoginException(String message) {
//		һ��Ҫ���ø���Ĺ��췽��
		super(message);
	}
}
