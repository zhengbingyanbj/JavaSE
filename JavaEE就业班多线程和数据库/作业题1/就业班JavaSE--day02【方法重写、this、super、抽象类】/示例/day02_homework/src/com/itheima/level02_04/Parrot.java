package com.itheima.level02_04;

/*
 3.����������(Parrot),�̳�Animal��
	i.��Ա����:
		1. ��д����� eat()����
			a)�����ʽ: 2���ȵ���ɫ�����ڳ�С��
		2. ���з���: say()  ˵��
			a)�����ʽ: 2���ȵ���ɫ������˵���,��˹�
	ii.�ṩ�ղκʹ��ι��췽��
 */
public class Parrot extends Animal {
//	i.��Ա����:
//		1. ��д����� eat()����
//			a)�����ʽ: 2���ȵ���ɫ�����ڳ�С��
	public void eat(){
		System.out.println(getNumOfLegs()+"���ȵ�"+getColor()+"�����ڳ�С��");
	}
//		2. ���з���: say()  ˵��
//			a)�����ʽ: 2���ȵ���ɫ������˵���,��˹�
	public void say(){
		System.out.println(getNumOfLegs()+"���ȵ�"+getColor()+"������˵ ���,��˹�");
	}
//	ii.�ṩ�ղκʹ��ι��췽��
	public Parrot() {
		super();
	}

	public Parrot(String color, int numOfLegs) {
		super(color, numOfLegs);
	}
	
}
