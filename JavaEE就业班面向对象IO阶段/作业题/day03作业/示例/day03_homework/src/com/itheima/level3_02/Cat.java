package com.itheima.level3_02;
/*
5.����è��(Cat) �̳ж�����(Animal)
	a)ʵ�ָ���ĳ�(eat)����
		i.�����ʽ: 1���ɫ��è�ڳ���
	b)���з���:ץ����
		i.�����ʽ: 1���ɫ��è��ץ����
	c)�ṩ:�ղ�,�вι��췽��
 */
public class Cat extends Animal{
//a)ʵ�ָ���ĳ�(eat)����
//	i.�����ʽ: 1���ɫ��è�ڳ���
	public void eat(){
		System.out.println(getAge()+"��"+getColor()+"��è�ڳ���");
	}
//b)���з���:ץ����
//	i.�����ʽ: 1���ɫ��è��ץ����
	public void catchMouse(){
		System.out.println(getAge()+"��"+getColor()+"��è��ץ����");
	}
//c)�ṩ:�ղ�,�вι��췽��
	public Cat() {
		super();
	}
	public Cat(String color, int age) {
		super(color, age);
	}
}
