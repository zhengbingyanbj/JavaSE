package com.itheima.level03_03;
/*
 7.����ɹ�רԱ(Buyer) ��̳�������Ա��(AdminStaff)��
	a)�ṩ�޲κʹ��εĹ��췽��
	b)ʵ�ֳ��󷽷�: void work();
		�����ʽ:  ����Ϊ 888 �Ĳɹ�רԱ ���� �ڲɹ������豸
 */
public class Buyer extends AdminStaff {
//	a)�ṩ�޲κʹ��εĹ��췽��
	public Buyer() {
		super();
	}

	public Buyer(String id, String name) {
		super(id, name);
	}
//	b)ʵ�ֳ��󷽷�: void work();
//	�����ʽ:  ����Ϊ 888 �Ĳɹ�רԱ ���� �ڲɹ������豸
	public void work() {
		System.out.println("����Ϊ "+getId()+" �Ĳɹ�רԱ "+getName()+" �ڲɹ������豸");
	}

}
