package com.itheima.level02_01;
/*
  ��ʹ�ô�������:  18��ľ�����ʹ��iPhone�ֻ�����Ϸ
 
 3.����Test��
	a)�ṩmain����
	b)��main������
	i.�����ֻ�����,�����ֻ�Ʒ�Ƹ�ֵΪiPhone
	ii.����Person����,�������Ƹ�ֵΪ����,���丳ֵΪ18
	iii.����Person�����,usePhone����,�����ֻ�����
	iv.��ӡ��ʽ����:
	        18��ľ�����ʹ��iPhone�ֻ�����Ϸ
 */
public class Test {
	public static void main(String[] args) {
//	i.�����ֻ�����,�����ֻ�Ʒ�Ƹ�ֵΪiPhone
		Phone phone = new Phone("iPhone");
//	ii.����Person����,�������Ƹ�ֵΪ����,���丳ֵΪ18
		Person person = new Person("����", 18);
//	iii.����Person�����,usePhone����,�����ֻ�����
		person.usePhone(phone);
	}
}
