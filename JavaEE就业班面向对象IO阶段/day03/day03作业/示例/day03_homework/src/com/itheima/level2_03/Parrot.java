package com.itheima.level2_03;

/*
 7.����������(Parrot),�̳ж�����(Animal)
	a)ʵ�ֳ��󷽷�: ��(eat)
		i.�����ʽ: 1�����ɫ�����ڳ�С��
	b)���з���: ˵��(say)
		i.�����ʽ: 1�����ɫ������˵���
	c)�ṩ: �ղ�,���ι���;
 */
public class Parrot extends Animal {
//a)ʵ�ֳ��󷽷�: ��(eat)
//	i.�����ʽ: 1�����ɫ�����ڳ�С��
	public void eat(){
		System.out.println(getAge()+"���"+getColor()+"�����ڳ�С��");
	}
//b)���з���: ˵��(say)
//	i.�����ʽ: 1�����ɫ������˵���
	public void say(){
		System.out.println(getAge()+"���"+getColor()+"������˵���");
	}
//c)�ṩ: �ղ�,���ι���;  
	public Parrot() {
		super();
	}
	public Parrot(String color, int age) {
		super(color, age);
	}
}
