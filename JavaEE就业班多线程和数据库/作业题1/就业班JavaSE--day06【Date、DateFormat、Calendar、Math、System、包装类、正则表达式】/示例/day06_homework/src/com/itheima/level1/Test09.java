package com.itheima.level1;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
  ���ô���ʵ��:
  ��ȡ��ǰ������,�����������ת��Ϊָ����ʽ���ַ���,��2088-08-08 08:08:08
  
  
1.������com.itheima.level1
2.������Test09
3.�ṩmain����,��main������
	a)��ȡ��ǰ���ڶ��� now;
	b)����SimpleDateFormat���� df,���ƶ����ڸ�ʽ
	c)����df��format(Date  date) ����,����now; ���շ��ص��ַ���
	d)��ӡ����ַ���
 */
public class Test09 {
	public static void main(String[] args) {
//		a)��ȡ��ǰ���ڶ��� now;
		Date now = new Date();
//		b)����SimpleDateFormat���� df,���ƶ����ڸ�ʽ
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		c)����df��format(Date  date) ����,����now; ���շ��ص��ַ���
		String datestr = df.format(now);
//		d)��ӡ����ַ���
		System.out.println(datestr);
	}
}
