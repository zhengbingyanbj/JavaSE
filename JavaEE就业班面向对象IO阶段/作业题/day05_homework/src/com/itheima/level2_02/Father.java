package com.itheima.level2_02;


/*
2.�������ڲ��Եĸ���Father
	a)�ṩһ����(eat)�ĳ�Ա����,�׳������쳣
		i.����Ե�һ��ʯ��
		ii.�׳�һ�����۵��쳣
	b)�ṩһ����(drink)�ĳ�Ա�������׳��쳣
		i.���: ��ʲô��û������
 */
public class Father {
//	a)�ṩһ����(eat)�ĳ�Ա����,�׳������쳣
	public void eat() throws ToothPainException  {
//		i.����Ե�һ��ʯ��
		System.out.println("�Ե�һ��ʯͷ��");
//		ii.�׳�һ�����۵��쳣
		throw new ToothPainException();
	}
//	b)�ṩһ����(drink)�ĳ�Ա�������׳��쳣
	public void drink() {
//	i.���: ��ʲô��û������
		System.out.println("��ʲô��û������");
	}
}
