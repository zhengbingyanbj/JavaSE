package com.itheima.level2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
��ʹ�ô���ʵ��
	��������˶�����

1.������com.itheima.level2
2.�ڰ��д���������Test13
3.��Test13����,�ṩmain����,��main������
	a)�������յ��ַ���,ת��Ϊ���ڶ���
	b)�����ڶ���ת��Ϊ��Ӧ�ĺ���ֵ
	c)��ȡ��ǰϵͳ�ĺ���ֵ
	d)��ǰϵͳ����ֵ-����ʱ����ڵĺ���ֵ�������ĺ���ֵ
	e)��������ֵת��Ϊ��
	f)�������
	g)ʹ��try...catch�����쳣
	
 */
public class Test13 {
	public static void main(String[] args) {

		try {
//			a)�������յ��ַ���,ת��Ϊ���ڶ���
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date birthDay = df.parse("1999-09-09");
//			b)�����ڶ���ת��Ϊ��Ӧ�ĺ���ֵ
			long birthTime = birthDay.getTime();
//			c)��ȡ��ǰϵͳ�ĺ���ֵ
			long now = System.currentTimeMillis();
//			d)��ǰϵͳ����ֵ-����ʱ����ڵĺ���ֵ�������ĺ���ֵ
			long liveTime = now - birthTime;
//			e)��������ֵת��Ϊ��
			long day = liveTime / 1000 / 60 / 60 / 24;
//			f)�������
			System.out.println("����"+day+"��");
		} catch (ParseException e) {
			e.printStackTrace();
		} 
	}
}
