package cn.itcast08.regex;

import java.util.Scanner;

/*
 * String[] split(String regex) 
          ���ݸ���������ʽ��ƥ���ִ��ַ�����
          
   boolean matches(String regex) 
          ��֪���ַ����Ƿ�ƥ�������������ʽ 
          
          ���չ��� ����ƥ�� �����Ƿ� ���Ϲ��� 
      
 */
public class QQtest {
	public static void main(String[] args) {
		  System.out.println("���� ¼��һ��qq��");
		  String number = new Scanner(System.in).nextLine();
		  
		  String regex = "[1-9][0-9]{4,10}";
		  //��� ���ǵ��ַ��� �Ƿ���� regex�������
		  boolean b = number.matches(regex);
		  if(b){
			  System.out.println("��ȷ");
		  }else{
			  System.out.println("����");
		  }
		  
		  
	  }
}
