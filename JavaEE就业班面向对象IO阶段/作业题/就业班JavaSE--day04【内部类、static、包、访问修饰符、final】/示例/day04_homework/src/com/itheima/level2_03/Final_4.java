package com.itheima.level2_03;

/*
    4. ��֤: �������͵ı���ֵΪ�����ֵַ����ֵַ���ܸ��ģ����ǵ�ַ�ڵĶ�������ֵ�����޸�
 */

public class Final_4 {
	public static void main(String[] args) {
//		����final�������ñ���,�����г�ʼ��
		final Cat c = new Cat();
//		 �������͵ı���ֵΪ�����ֵַ����ֵַ���ܸ���
//		c = new Cat();//���뱨��
//		��ַ�ڵĶ�������ֵ�����޸�
		c.age = 2;
	}
}

//���帨����:Cat
class Cat{
	public int age;
}