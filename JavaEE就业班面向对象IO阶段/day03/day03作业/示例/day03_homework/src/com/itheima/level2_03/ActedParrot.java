package com.itheima.level2_03;
/*
 8.��������ݵ�������(ActedParrot),�̳�������(Parrot),ʵ�ֱ����߽ӿ�
	a)ʵ�ֳ��󷽷�����(play)
		i.�����ʽ: 1�����ɫ�����ڱ��ݹ����ΰ�
	b)�ṩ: �ղ�,���ι���;
 */
public class ActedParrot extends Parrot implements Actor {
//a)ʵ�ֳ��󷽷�����(play)
//	i.�����ʽ: 1�����ɫ�����ڱ��ݹ����ΰ�
	public void play(){
		System.out.println(getAge()+"���"+getColor()+"�����ڱ��ݹ����ΰ�");
	}
//b)�ṩ: �ղ�,���ι���;	
	public ActedParrot() {
		super();
	}
	public ActedParrot(String color, int age) {
		super(color, age);
	}
}
