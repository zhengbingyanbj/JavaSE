package com.itheima.level3;

import java.util.Scanner;

/*
 ģ����֤�ֻ��ŵĹ��̣���������Ҫ��ʵ����ش��루������ʾ����һ��Ҫ������
	a.	��ʾ�û��ڿ���̨�����ֻ��ţ���һ���ַ���������б���
	b.	�жϸ��ֻ���λ���Ƿ���11λ
	c.	�жϸ��ֻ��ţ��Ƿ�������
	d.	�жϸ��ֻ������3Ϊ�����������ͬ��������Ϊ������
	
1.�ڰ�:com.itheima.level3��,������Test20,
2.��Test19�����ṩmain����,��mian������
	a)��������¼�����
	b)��ȡ�û�¼����ֻ�����
	c)�жϸ��ֻ���λ���Ƿ���11λ,������Ǵ�ӡ�ֻ�����λ������,��������
	d)�жϸ��ֻ��ţ��Ƿ�������; ,������Ǵ�ӡ���ڷǷ��ַ�,��������
	e) �жϸ��ֻ������3Ϊ�����������ͬ��������Ϊ������,����ֻ���������,��������ֻ��Ų�������
 */
public class Test20 {
	public static void main(String[] args) {
//		a)��������¼�����
		Scanner sc = new Scanner(System.in);
//		b)��ȡ�û�¼����ֻ�����
		System.out.println("��¼��һ���ֻ�����");
		String phone = sc.nextLine();
//		c)�жϸ��ֻ���λ���Ƿ���11λ,������Ǵ�ӡ�ֻ�����λ������,��������
		if(phone.length() != 11){
			System.out.println("�ֻ�����λ������");
			return;
		}
//		d)�жϸ��ֻ��ţ��Ƿ�������; ,������Ǵ�ӡ���ڷǷ��ַ�,��������
		if(!phone.matches("\\d+")){
			System.out.println("���ڷǷ��ַ�");
			return;
		}
//		e) �жϸ��ֻ������3Ϊ�����������ͬ��������Ϊ������,�������,���������������
//		��ȡ����λ���ַ�
		char last1 = phone.charAt(phone.length()-1);
		char last2 = phone.charAt(phone.length()-2);
		char last3 = phone.charAt(phone.length()-3);
//		�������λ���ַ���ͬ,����Ϊ������
		if(last1 == last2 && last2 == last3){
			System.out.println("�ֻ���"+phone+"������");
		}else{
			System.out.println("�ֻ���"+phone+"����������");
		}
	}
}
