package com.itheima.level03_03;

/*
 4.���彲ʦ(Lecturer)��̳��в�Ա����Teacher����
	a)�ṩ�޲κʹ��εĹ��췽��
	b)ʵ�ֳ��󷽷�: void work();
		�����ʽ: ����Ϊ 666 �Ľ�ʦ ����ѩ �ڽ���
 */
public class Lecturer extends Teacher {
//	a)�ṩ�޲κʹ��εĹ��췽��
	public Lecturer() {
		super();
	}
	public Lecturer(String id, String name) {
		super(id, name);
	}
	
//	b)ʵ�ֳ��󷽷�: void work();
//		�����ʽ: ����Ϊ 666 �Ľ�ʦ ����ѩ �ڽ���
	public void work() {
		System.out.println("����Ϊ "+getId()+" �Ľ�ʦ "+getName()+" �ڽ���");
	}



}
