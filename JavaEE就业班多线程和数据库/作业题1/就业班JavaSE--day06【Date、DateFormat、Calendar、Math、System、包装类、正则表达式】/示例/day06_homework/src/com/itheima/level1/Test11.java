package com.itheima.level1;

import java.util.Calendar;

/*
ʹ�ô���ʵ��
500����Ǽ����꼸�¼���.

1.������com.itheima.level1�д���Test11
2.��Test11����,�ṩmain����,��main������
	a)��ȡ��ǰ��������
	b)�������ڶ����add()����,�õ�ǰ��������ƶ�500��
	c)��ȡ�����е���,��,��
	d)��������꼸�¼���.
 */
public class Test11 {
	public static void main(String[] args) {
//		a)��ȡ��ǰ��������
		Calendar c = Calendar.getInstance();
//		b)�������ڶ����add()����,�õ�ǰ��������ƶ�500��
		c.add(Calendar.DATE, 500);
//		c)��ȡ�����е���,��,��
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
//		d)��������꼸�¼���.
		System.out.println(year+"��"+month+"��"+day+"��");
	}
}
