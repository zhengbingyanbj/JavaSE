package com.itheima.level2_02;

/*
 4.�����˶���ʦ��(SportTeacher)�̳���ʦ��(Teacher)ʵ���˶��ӿ�
	a)��Ա����: ʵ��playBasketball�ĳ��󷽷�
		i.�����ʽ: ����Ϊ30�� ������ ��ʦ�ڴ�����
	b)�ṩ: �޲�,�вι��췽��
 */
public class SportTeacher extends Teacher implements Sport {
//a)��Ա����: ʵ��playBasketball�ĳ��󷽷�
//	i.�����ʽ: ����Ϊ30�� ������ ��ʦ�ڴ�����
	public void playBasketball() {
		System.out.println("����Ϊ"+getAge()+"�� "+getName()+" ��ʦ�ڴ�����");
	}
//b)�ṩ: �޲�,�вι��췽��
	public SportTeacher() {
		super();
	}
	public SportTeacher(String name, int age) {
		super(name, age);
	}
}
