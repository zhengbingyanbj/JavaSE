package com.itheima.level02_04;
/*
 ���ô��������� С������һ����ֵ6000��iPhone�ֻ�
 
3.���������Test
	a)�ṩmain����
	b)��main������
		i.ʹ�ô��ι��촴��Person���� p,name��ʼ��ΪС��
		ii.���ö���p��sellPhone()����,��ֵ��Phone phone����
		iii.��main���: С������һ����ֵ6000��iPhone�ֻ�
 */
public class Test {
	public static void main(String[] args) {
		
//		i.ʹ�ô��ι��촴��Person���� p,name��ʼ��ΪС��
		Person p = new Person("С��");
//		ii.���ö���p��sellPhone()����,��ֵ��Phone phone����
		Phone phone = p.sellPhone();
//		iii.���: С������һ����ֵ6000��iPhone�ֻ�
		System.out.println(p.getName()+"����һ����ֵ"+phone.getPrice()+"��"+phone.getBrand()+"�ֻ�");
	}
}
