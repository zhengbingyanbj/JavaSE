package com.itheima.level3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 ʹ��SimpleDateFormat��,��2016-12-18ת��Ϊ2016��12��18��. 
 ��ʾ: SimpleDateFormat��������ڸ�ʽ�ַ�������ͨ��applyPattern(String pattern)�����޸�

1.������:com.itheima.level3
2.������Test18,�ṩmain����,��main������
	a)����SimpleDateFormat���� df,ָ������ģʽΪyyyy-MM-dd
	b)����df��parse(String str) ��������2016-12-18,�õ���Ӧ��������
	c)�޸�df������ģʽΪyyyy��MM��dd��
	d)����df��format(Date date) ����ղ�ת��Ϊ����
	e)��ӡת������ַ���

 */
public class Test18 {
	public static void main(String[] args) throws ParseException {
//		a)����SimpleDateFormat���� df,ָ������ģʽΪyyyy-MM-dd
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		b)����df��parse(String str) ��������2016-12-18,�õ���Ӧ��������
		Date date = df.parse("2016-12-18");
//		c)�޸�df������ģʽΪyyyy��MM��dd��
		df.applyPattern("yyyy��MM��dd��");
//		d)����df��format(Date date) ����ղ�ת��Ϊ����
		String newStr = df.format(date);
//		e)��ӡת������ַ���
		System.out.println(newStr);
	}
}
