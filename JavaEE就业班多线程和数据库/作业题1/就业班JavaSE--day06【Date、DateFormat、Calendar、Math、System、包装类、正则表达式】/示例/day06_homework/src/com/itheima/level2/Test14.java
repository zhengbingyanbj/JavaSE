package com.itheima.level2;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 д������֤ʹ��SimpleDateFormat������ת��Ϊ�ַ�����ʱ��;
 ����SimpleDateFormat����,�Ƚ����ĳ����ִ������
 
 
1.��com.itheima.level2���´���Test14��
2.��Test14�����ṩmain����,��main������
	a)ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĿ�ʼʱ��,ʹ��start��������
	b)��Ҫ����ִ�����ܵĴ���
	c)ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĽ���ʱ��,ʹ��end��������
	d)�������ִ�л��ѵ�ʱ�� end - start,�������ִ�����ĵ�ʱ��
3.��Test14�����ṩһ����̬����testSimpleDataFormatInLoop(),�ڷ�����
	a)��������(Date)���� now
	b)дһ��ѭ��10000�ε�forѭ��
	c)��ѭ����
	i.����SimpleDateFormat���� df,���ƶ����ڸ�ʽΪyyyy-MM-dd
	ii.����df��format(Date date),����now
	d)��main������,��Ҫ����ִ�е����ܵĴ��봦����testSimpleDataFormatInLoop()����
	e)��¼����ִ�е�Ч��
4.��Test14��,��������testSimpleDataFormatInLoop()����
	a)����ΪtestSimpleDataFormatOutLoop
	b)�Ѵ���SimpleDateFormat�Ĵ����ƶ���ѭ���ⲿ
	c)��main������,ע�͵���testSimpleDataFormatInLoop();
	d)�������һ�е���testSimpleDataFormatOutLoop����
	e)���г���,�鿴������,����¼
5.�ó�����: �������ڸ�ʽ����,ȷʵ�Ƚ����ĳ�������,������ʵ�ʿ���һ���дһ��������ר�Ŵ���,���ڵĸ�ʽ�������.
*/
public class Test14 {
	
	public static void main(String[] args) {
//		a)ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĿ�ʼʱ��,ʹ��start��������
		long start = System.currentTimeMillis();
//		b)��Ҫ����ִ�����ܵĴ���
//		testSimpleDataFormatInLoop();//375
		testSimpleDataFormatOutLoop();//80
//		c)ʹ��System��currentTimeMillis()������ȡ��ǰ����ϵͳ�ĺ���ֵ,���ó���ִ�еĽ���ʱ��,ʹ��end��������
		long end = System.currentTimeMillis();
//		d)�������ִ�л��ѵ�ʱ�� end - start,�������ִ�����ĵ�ʱ��
		long cost = end - start;
		System.out.println("���ѵ�ʱ��Ϊ:"+cost);
	}
	
//	����SimpleDateFormat����Ĵ�����ѭ������
	public static void testSimpleDataFormatInLoop(){
//		a)��������(Date)���� now
		Date now = new Date();
//		b)дһ��ѭ��10000�ε�forѭ��
		for(int i=0; i<100000; i++){
//		c)��ѭ����
//			i.����SimpleDateFormat���� df,���ƶ����ڸ�ʽΪyyyy-MM-dd
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//			ii.����df��format(Date date),����now
			df.format(now);
		}
	}
//	����SimpleDateFormat����Ĵ�����ѭ�����
	public static void testSimpleDataFormatOutLoop(){
//		a)��������(Date)���� now
		Date now = new Date();
//		b)дһ��ѭ��10000�ε�forѭ��
//		����SimpleDateFormat���� df,���ƶ����ڸ�ʽΪyyyy-MM-dd
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		for(int i=0; i<100000; i++){
//		c)��ѭ����
//			ii.����df��format(Date date),����now
			df.format(now);
		}
	}
}
