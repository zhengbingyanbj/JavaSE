package com.itheima.level02_07;
/*
 		 
1.���彻ͨ������(Vehicle)
	a)��Ա����
		i.���Ӹ��� wheel 
		ii.��ɫ color
	b)��Ա����
		i.��  run()  
		1.��ӡ��ʽ:  4�����Ӱ�ɫ�ĳ�����
	c)Ҫ��:
		i.��Ա��������Ȩ�����η�,�����ǹ���Ȩ�޵�.
 */
public class Vehicle {
//	a)��Ա����
//		i.���Ӹ��� wheel 
	int wheel;
//		ii.��ɫ color
	String color;
//b)��Ա����
//	i.��  run()  
//	1.��ӡ��ʽ:  �ĸ����Ӱ�ɫ�ĳ�����
	public void run(){
		System.out.println(wheel+"������"+color+"�ĳ�����");
	}
}
