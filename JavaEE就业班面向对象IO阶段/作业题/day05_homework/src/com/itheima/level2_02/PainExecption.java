package com.itheima.level2_02;

/*
1.�����쳣��ϵ
	a)����PainExecption(���쳣)��̳�Exception
		i.�ṩ�ղκ��вι���,ע���вι��������ø�����вι���
 */
public class PainExecption extends Exception {
	public PainExecption() {
		super();
	}
	public PainExecption(String message) {
		super(message);
	}
}
