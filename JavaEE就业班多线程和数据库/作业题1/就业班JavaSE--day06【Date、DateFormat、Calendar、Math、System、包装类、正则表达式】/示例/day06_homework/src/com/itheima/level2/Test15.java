package com.itheima.level2;

/*
 ʹ��������ʽ�и��ַ���
* 192.168.105.27 ����  . ���и��ַ���
* 18 22 40 65 ���տո��и��ַ���
    ��ʾ: ���� . �� ��������ʽ������ƥ������з�����������ַ�,����ַ����е���������ʣ,
                 �˴�ʹ�� . ����Ҫת��; ʹ��\\.��Ϊ�и�ʹ��������ʽ
 
1.��com.itheima.level2���´���Test15
2.��Test15�����ṩmain����,��main������
	a)�����ַ�������str1,��ֵΪ192.168.105.27
	b)����str1��split�ķ���,���� ��\\.��,ʹ���ַ�������strs1����
	c)��������strs1,���ÿһ��Ԫ��
	d)�����ַ�������str2,��ֵΪ 18  22  40  65
	e)����str1��split�ķ���,���롰\\s+��,ʹ���ַ�������strs2����
	f)��������strs2,���ÿһ��Ԫ��
 */
public class Test15 {
	public static void main(String[] args) {
//		a)�����ַ�������str1,��ֵΪ192.168.105.27
		String str1 = "192.168.105.27";
//		b)����str1��split�ķ���,���� ��\\.��,ʹ���ַ�������strs1����
		String[] strs1 = str1.split("\\.");
//		c)��������strs1,���ÿһ��Ԫ��
		for (int i = 0; i < strs1.length; i++) {
			System.out.print(strs1[i]+" ");
		}  
		System.out.println();
//		d)�����ַ�������str2,��ֵΪ 18  22  40  65
		String str2 = "18  22  40  65";
//		e)����str1��split�ķ���,���롰\\s+��,ʹ���ַ�������strs2����
		String[] strs2 = str2.split("\\s+");
//		f)��������strs2,���ÿһ��Ԫ��
		for (int i = 0; i < strs2.length; i++) {
			System.out.print(strs2[i]+" ");
		}  
		System.out.println();
	}
}
