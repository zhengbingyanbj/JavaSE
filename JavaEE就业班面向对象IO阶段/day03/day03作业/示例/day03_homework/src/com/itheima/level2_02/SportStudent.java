package com.itheima.level2_02;

/*
 6.�����˶�ѧ����(SportStudent��),�̳�Student��,ʵ��Sport�ӿ�
	a)��Ա����: ʵ��playBasketball�ĳ��󷽷�
		i.�����ʽ: ����Ϊ18�� Ҷ֪�� ѧ���ڴ�����
	b)�ṩ: �޲�,�вι��췽��
 */
public class SportStudent extends Student implements Sport {
//a)��Ա����: ʵ��playBasketball�ĳ��󷽷�
//	i.�����ʽ: ����Ϊ18�� Ҷ֪�� ѧ���ڴ�����
	public void playBasketball() {
		System.out.println("����Ϊ"+getAge()+"�� "+getName()+" ѧ���ڴ�����");
	}
//b)�ṩ: �޲�,�вι��췽��
	public SportStudent() {
		super();
	}
	public SportStudent(String name, int age) {
		super(name, age);
	}
}
