package com.itheima.level01_06;
/*
  ��ʹ�ô��������� 2�����ɫ�ӷ�è,��ץ����
  
 2. ����������Test01
	a)�ṩmain����
	b)��main������
	a)����Cat����,������������Ϊ�ӷ�,��ɫ����Ϊ��ɫ,��������Ϊ2
	b)����Cat�����catchMouse()����,��ӡ��ʽ����:
	 	2�����ɫ�ӷ�è,��ץ����
 */
public class Test {
   
	public static void main(String[] args) {
//       ����Cat����
		 Cat c = new  Cat("�ӷ�", "��ɫ", 2);
//		 ����ץ���󷽷�
		 c.catchMouse();
	}
}
