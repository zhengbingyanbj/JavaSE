package com.itheima.level03_03;

/*
 5.��������(Tutor)��̳��в�Ա����Teacher����
	a)�ṩ�޲κʹ��εĹ��췽��
	b)ʵ�ֳ��󷽷�: void work();
		i.�����ʽ: ����Ϊ 668������ ���� �ڰ���ѧ���������
 */
public class Tutor extends Teacher{
//	a)�ṩ�޲κʹ��εĹ��췽��
	public Tutor() {
		super();
	}

	public Tutor(String id, String name) {
		super(id, name);
	}
//	b)ʵ�ֳ��󷽷�: void work();
//		i.�����ʽ: ����Ϊ 668������ ���� �ڰ���ѧ���������
	public void work() {
		System.out.println("����Ϊ "+getId()+"������ "+getName()+" �ڰ���ѧ���������");
	}
}
