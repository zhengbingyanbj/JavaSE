package com.itheima.level02_03;
/*
 2.������Ա��(Actor),�̳�Person��
	i.��Ա����:
		1.��д����� eat()����
			a)���:  18�����Ա�����ڳ�С��Ϻ
		2. ���з���:  ����(dance)
			a)���:  18�����Ա�������������.
	ii.�ṩ�ղκʹ��ι��췽��
 */
public class Actor extends Person {
//	i.��Ա����:
//		1.��д����� eat()����
//			a)�����ʽ:  18�����Ա�����ڳ�С��Ϻ
	public void eat(){
		System.out.println(getAge()+"�����Ա"+getName()+"�ڳ�С��Ϻ");
	}
//		2. ���з���:  ����(dance)
//			a)�����ʽ:  18�����Ա�������������.
	public void dance(){
		System.out.println(getAge()+"�����Ա"+getName()+"���������");
	}
//	ii.�ṩ�ղκʹ��ι��췽��
	public Actor() {
		super();
	}
	public Actor(String name, int age) {
		super(name, age);
	}
	
}
