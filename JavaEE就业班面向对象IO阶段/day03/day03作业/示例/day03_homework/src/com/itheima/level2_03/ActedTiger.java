package com.itheima.level2_03;

/*
 4.�������ݵ��ϻ���(ActedTiger),�̳��ϻ���(Tiger),ʵ�ֱ����߽ӿ�
	a)ʵ�ֳ��󷽷�����(play)
		i.�����ʽ: 2��Ļ�ɫ�ϻ��ڱ������Ȧ
	b)�ṩ: �ղ�,���ι���;
 */
public class ActedTiger  extends Tiger implements Actor{
//a)ʵ�ֳ��󷽷�����(play)
//		i.�����ʽ: 2��Ļ�ɫ�ϻ��ڱ������Ȧ
	public void play(){
		System.out.println(getAge()+"���"+getColor()+"�ϻ��ڱ������Ȧ");
	}
//b)�ṩ: �ղ�,���ι���;
	public ActedTiger() {
		super();
	}
	public ActedTiger(String color, int age) {
		super(color, age);
	}
}
