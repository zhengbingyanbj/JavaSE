package com.itheima.level3_03;

/*
 1.创建包:com.itheima.level3_03
 2.定义异常类无效金额异常(UnValidMoneyException),继承RuntimeExpetion
	a)提供无参构造和有参构造
 */
public class UnValidMoneyException extends RuntimeException {
	public UnValidMoneyException() {
		super();
	}
	public UnValidMoneyException(String message) {
		super(message);
	}
}
