package cn.itcast01.staticcode;
/*
 * ��������������ִ�С�
 * 
 * ������(��������)���췽��ִ�У�
 * 
 *  ����������ʽ��һ��ʹ�õ�����ʱִ�С�
 */
public class StaticCode {
   
	static int num;
	
	public StaticCode(){
		System.out.println("staticCode����");
	}
	
	static{
		num = 20;
		System.out.println("StaticCode��̬�����");
	}
	
	public static void main(String[] args) {
		System.out.println("StaticCode��������");
	}
}
