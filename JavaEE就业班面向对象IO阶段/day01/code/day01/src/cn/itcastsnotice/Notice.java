package cn.itcastsnotice;
/*
 *  �������ļ̳� 
 *     ֻ�ܵ��̳� ���ܶ�̳� 
 *     
 *     ���Զ��̳�
 */

class Fu2{
	public void show(){
		System.out.println("��");
	}
}
class Ye{
	 
	public void method(){
		System.out.println("����ץ��үү");
	}
}
class Fu extends Ye{
	
	public void show(){
		System.out.println("��");
	}
}
//class Zi extends Fu,Fu2{} ���ܶ�̳�

class Zi extends Fu{}

public class Notice {
   public static void main(String[] args) {
	  
	   Zi  zi  = new  Zi();
	   
	   zi.show();
	   
	   zi.method();
   }
}
