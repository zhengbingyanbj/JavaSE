package com.itheima.level2_03;
/*
 3.��֤: final���εı�����Ϊ��������Щ����ֻ�ܸ�ֵһ��
 
 */
public class Final_3 {
	public static void main(String[] args) {
		final int a = 10;
//		��final���α���Ϊ����,ֻ�ܸ�ֵһ��
//		a = 20; //���뱨��:The final local variable a cannot be assigned
		
		final int b;
		b = 5;
//		��final���α���Ϊ����,ֻ�ܸ�ֵһ��
//		b = 10; //������:The final local variable b may already have been assigned
	}
}
