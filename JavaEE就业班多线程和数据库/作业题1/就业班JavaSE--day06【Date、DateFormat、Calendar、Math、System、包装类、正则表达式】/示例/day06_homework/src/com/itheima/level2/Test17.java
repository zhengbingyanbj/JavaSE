package com.itheima.level2;
/*
1.��com.itheima.level2����
2.����Test17��,��Test17����:
	a)�ṩmain����,��main������
	b)�����ַ�������str,��ֵΪ:"Hello12345World6789012"
	c)����str��replaceAll(String regex,String str),��һ���������롱\\d+��,�ڶ����������롱#��,�����ַ�������newStr�����滻����ַ���
	d)���: newStr
 */
public class Test17 {
	public static void main(String[] args) {
//		b)�����ַ�������str,��ֵΪ:"Hello12345World6789012"
		String str = "Hello12345World6789012";
//		c)����str��replaceAll(String regex,String str),��һ���������롱\\d+��,�ڶ����������롱#��,�����ַ�������newStr�����滻����ַ���
		String newStr = str.replaceAll("\\d", "#");
//		d)���: newStr
		System.out.println(newStr);
	}
}
