package com.itheima.level02_06;

/*
1.���嶯����(Animal)
	a)��Ա����
		i.���� name
		ii.��ɫ color
	b)��Ա����
		i.��  eat()  
		    ��ӡ��ʽ: ��ɫ��Tom�����ڳԶ���
	c)Ҫ��:
	    i.��Ա��������Ȩ�����η�,�����ǹ���Ȩ�޵�.
 */
public class Animal {
//	a)��Ա����
//		i.���� name
	String name;
//		ii.��ɫ color
	String color;
//b)��Ա����
//	i.��  eat()  
//    ��ӡ��ʽ: ��ɫ��Tom�����ڳԶ���
	public void eat(){
		System.out.println(color+"��"+name+"�����ڳԶ���");
	}
}
