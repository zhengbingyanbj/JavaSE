package com.itheima.level2_03;

/*
 5.�����������(Gorilla),�̳ж�����(Animal)
	a)ʵ�ֳ��󷽷�: ��(eat)
		i.�����ʽ: 3��ĺ�ɫ�����ɳ��㽶
	b)�ṩ: �ղ�,���ι���;
 */
public class Gorilla extends Animal {
//a)ʵ�ֳ��󷽷�: ��(eat)
//	i.�����ʽ: 3��ĺ�ɫ�����ɳ��㽶
	public void eat(){
		System.out.println(getAge()+"���"+getColor()+"�����ɳ��㽶");
	}
//b)�ṩ: �ղ�,���ι���;	
	public Gorilla() {
		super();
	}
	public Gorilla(String color, int age) {
		super(color, age);
	}
}
