package com.itheima.level01_05;

/*
 3.���幷��(Dog)
	a)��Ա����: Ʒ��(breed)
	b)�ṩ�ղ�,�вι��췽��,���вι����е��ø���Ĺ��췽��
 */
public class Dog extends Animal {

//	Ʒ��(breed)
	private String bread;

	public Dog() {
		
	}

	public Dog(String name,String color, String bread) {
//		���ø�����вι��췽��,������ĳ�Ա������ֵ
		super(name, color);
//		���Լ���Ա������ֵ
		this.bread = bread;
	}
}
