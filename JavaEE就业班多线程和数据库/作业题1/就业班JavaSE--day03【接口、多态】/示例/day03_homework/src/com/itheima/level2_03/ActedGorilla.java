package com.itheima.level2_03;
/*
 6.�������ݵĴ�����(ActedGorilla),�̳д�������(Gorilla),ʵ�ֱ����߽ӿ�
	a)ʵ�ֳ��󷽷�����(play)
		i.�����ʽ: 3��ĺ�ɫ�������ڱ��������г�
	b)�ṩ: �ղ�,���ι���;
 */
public class ActedGorilla extends Gorilla implements Actor {
//a)ʵ�ֳ��󷽷�����(play)
//	i.�����ʽ: 3��ĺ�ɫ�������ڱ��������г�
	public void play(){
		System.out.println(getAge()+"���"+getColor()+"�������ڱ��������г�");
	}
//b)�ṩ: �ղ�,���ι���;
	public ActedGorilla() {
		super();
	}
	public ActedGorilla(String color, int age) {
		super(color, age);
	}
}
