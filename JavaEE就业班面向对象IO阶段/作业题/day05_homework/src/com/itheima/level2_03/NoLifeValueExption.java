package com.itheima.level2_03;

/*
  1.�Զ����쳣��NoLifeValueExption�̳�RuntimeException
	a)�ṩ�ղκ��вι���
	b)���вι�����,��Ҫ���ø�����вι���,���쳣��Ϣ����
 */
public class NoLifeValueExption extends RuntimeException{
	public NoLifeValueExption() {
		super();
	}
	public NoLifeValueExption(String message) {
		super(message);
	}
}
