package com.itheima.level1_12;
/*
 1.�����쳣��NoScoreException,�̳�RuntimeException
	a)�ṩ�ղκ��вι��췽��
 */
public class NoScoreException extends RuntimeException {
//  �ղι���
	public NoScoreException() {
		super();
	}
//	�вι���
	public NoScoreException(String message) {
		super(message);
	}
}
