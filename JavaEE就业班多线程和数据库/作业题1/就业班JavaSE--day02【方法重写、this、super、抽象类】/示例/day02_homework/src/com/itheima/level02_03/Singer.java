package com.itheima.level02_03;
/*
 3.���������(Singer),�̳�Person��
	i.��Ա����:
		1. ��д����� eat()����
			a)���: 30��ĸ���Ѧ֮ǫ�ڳԴ�բз
		2. ���з���: sing()  ����
			a)���:  30��ĸ���Ѧ֮ǫ���ݳ���˹�
	ii.�ṩ�ղκʹ��ι��췽��
 */
public class Singer extends Person {
//	i.��Ա����:
//		1. ��д����� eat()����
//			a)���: 30��ĸ���Ѧ֮ǫ�ڳԴ�բз
	public void eat() {
		System.out.println(getAge()+"��ĸ���"+getName()+"�ڳԴ�բз");
	}
//		2. ���з���: sing()  ����
//			a)���:  30��ĸ���Ѧ֮ǫ���ݳ���˹�
	public void sing(){
		System.out.println(getAge()+"��ĸ���"+getName()+"���ݳ���˹�");
	}
//	ii.�ṩ�ղκʹ��ι��췽��
	public Singer() {
		super();
	}

	public Singer(String name, int age) {
		super(name, age);
	}
	
}
