package com.itheima.level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
���ô���ʵ����������:
	����������ַ�����ʾת��Ϊ��Ӧ�����ڶ���.     
 
 
1.��com.itheima.level1���´���Test10��
2.��Test10����,�ṩmain����,��main������
	a)����SimpleDateFormat���� df,���ƶ����ڸ�ʽ
	b)����df��parse(String str)����,������������ַ���;�������ص����ڶ���
	c)��ӡ������ڶ���
	d)ʹ��try...catch��������쳣
 */
public class Test10 {
	public static void main(String[] args) {

		try {
//			a)����SimpleDateFormat���� df,���ƶ����ڸ�ʽ
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//			b)����df��parse(String str)����,������������ַ���;�������ص����ڶ���
			Date date = df.parse("1999-09-09");
//			c)��ӡ������ڶ���
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
