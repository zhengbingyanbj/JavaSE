package com.itheima.level3_02;
/*
 3.���幷��(Dog)�̳ж�����(Animal)
	a)ʵ�ָ�������(eat)����
		i.�����ʽ: 2���ɫ�Ĺ��ڿϹ�ͷ
	b)���з���: ����(lookHome)
		i.�����ʽ: 2���ɫ�Ĺ��ڿ���
	c)�ṩ:�ղ�,�вι��췽��
 */
public class Dog extends Animal {
//	a)ʵ�ָ�������(eat)����
//	   i.�����ʽ: 2���ɫ�Ĺ��ڿϹ�ͷ
	public void eat(){
		System.out.println(getAge()+"��"+getColor()+"�Ĺ��ڿϹ�ͷ");
	}
//	b)���з���: ����(lookHome)
//		i.�����ʽ: 2���ɫ�Ĺ��ڿ���
	public void lookHome(){
		System.out.println(getAge()+"��"+getColor()+"���ڿ���");
	}
//  c)�ṩ:�ղ�,�вι��췽��
	public Dog() {
		super();
	}
	public Dog(String color, int age) {
		super(color, age);
	}
}
