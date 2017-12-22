package com.itheima.level1_10;
/*
 ���ô���ʵ����������:
1.дһ������ʵ�ֻ�ȡ�ַ���ĳ�������ϵ��ַ��Ĺ���
2.дһ�����Բ��Է�����������д�ķ���,ʹ��thows��ʽ���д����쳣,����main�����е���������Է���
3.��дһ�����Բ��Է�����������д�ķ���,ʹ��try...catch��ʽ���д����쳣,����main�����е���������Է���


1.���� Test10��
2.�ṩһ����̬����:public static char charAt(String str, int index) ���ڻ�ȡ�ַ���str,index���������ַ�
3.�ڷ�����charAt(String,int index)
	a)	���ַ���Ϊnull�׳� Exception("�ַ�������Ϊnull")�쳣,
	b)	���ַ���Ϊ"" ��ʱ���׳� Excetion("�ַ�������Ϊ��") �쳣;
	c)	��index���� [0,str.length()-1] ֮���ʱ,�׳�Exception("����Խ��") �쳣. 
	d)	���򷵻�str��index�������ַ�
4.�ṩһ����̬�ķ���testThrows() ���ڲ���charAt(String,int index)����
	a)�ڷ����е���charAt(String,int index)����;
		i.ע����Ҫ����ÿһ�����
		ii.���: ����һ�������쳣����Ĵ���Ͳ�ִ����
		iii.ע�����й����ԵĴ���,����������һ�����
	b)ʹ��throws��ʽ���쳣���д���
	c)��main������,���ñ�����
5.�ṩ һ����̬����testTryCatch(),���ڲ���charAt(String,int index)����
	a)�ڷ����е���charAt(String,int index)����;
		i.ע����Ҫ����ÿһ�����
	b)ʹ��try...catch��ʽ���쳣���д���
	c)��main������,���ñ�����.
 */
public class Test10 {
//	1. ��ȡ�ַ���ĳ�������ϵ��ַ��Ĺ���
	public static char charAt(String str, int index) throws Exception {
//		a)	���ַ���Ϊnull�׳� Exception("�ַ�������Ϊnull")�쳣,
		if(null == str){
			throw new Exception("�ַ�������Ϊnull");
		}
//		b)	���ַ���Ϊ"" ��ʱ���׳� Excetion("�ַ�������Ϊ��") �쳣;
		if(str.equals("")){
			throw new Exception("�ַ�������Ϊ��");
		}
//		c)	��index���� [0,str.length()-1] ֮���ʱ,�׳�Exception("����Խ��") �쳣. 
		if(index < 0 || index >= str.length()){
			throw new Exception("����Խ��"+index);
		}
//		d)	���򷵻�str��index�������ַ�
		return str.charAt(index);
	}
//	4.�ṩһ����̬�ķ���testThrows() ���ڲ���charAt(String,int index)����
	public static void testThrows() throws Exception{
		  char c;
//		  c = charAt(null, 0);
//		  c = charAt("", 0);
//		  c = charAt("abc",4);
		  c = charAt("abc", 1);
		  System.out.println(c);
	}
	
//	5.�ṩ һ����̬����testTryCatch(),���ڲ���charAt(String,int index)����
	public static void testTryCatch(){
//		a)�ڷ����е���charAt(String,int index)����;
//			i.ע����Ҫ����ÿһ�����
//		b)ʹ��try...catch��ʽ���쳣���д���
		try{
		  char c;
//		  c = charAt(null, 0);
//		  c = charAt("", 0);
//		  c = charAt("abc",4);
		  c = charAt("abc", 1);
		  System.out.println(c);
		}catch(Exception e){
			System.out.println("�����쳣");
			e.printStackTrace();
		}
		System.out.println("�������");
	}



	
	public static void main(String[] args) {
//		��main������,����testThrows ����.
//		 testThrows();
//		��main������,����testTryCatch����
		 testTryCatch();
	}
	
}
