package com.itheima.level2_03;

/*
 3.�����ϻ���(Tiger),�̳ж�����(Animal)
	a)ʵ�ֳ��󷽷�: ��(eat)
		i.�����ʽ: 2��Ļ�ɫ�ϻ�����
	b)�ṩ: �ղ�,���ι���;
 */
public class Tiger extends Animal  {
//a)ʵ�ֳ��󷽷�: ��(eat)
//	i.�����ʽ: 2��Ļ�ɫ�ϻ�����
	public void eat(){
		System.out.println(getAge()+"���"+getColor()+"�ϻ�����");
	}
//b)�ṩ: �ղ�,���ι���;
	public Tiger() {
		super();
	}
	public Tiger(String color, int age) {
		super(color, age);
	}
}
