package com.itheima.level3_03;

/*
 1.������:com.itheima.level3_03
 2.�����쳣����Ч����쳣(UnValidMoneyException),�̳�RuntimeExpetion
	a)�ṩ�޲ι�����вι���
 */
public class UnValidMoneyException extends RuntimeException {
	public UnValidMoneyException() {
		super();
	}
	public UnValidMoneyException(String message) {
		super(message);
	}
}
