package cn.itcast08.regex;

import java.util.Scanner;

/*
 * String[] split(String regex) 
          ���ݸ���������ʽ��ƥ���ִ��ַ�����
          
   boolean matches(String regex) 
          ��֪���ַ����Ƿ�ƥ�������������ʽ 
          
          ���չ��� ����ƥ�� �����Ƿ� ���Ϲ��� 
          
          ��֤�ֻ����� �Ƿ���ȷ
          1����һλ ����Ϊ1
          2���ڶ�λ 3 4 5 7 8 
          3������λ 0-9
             ����λ0-9
             ������
             ��ʮһλ 0-9  
             
             �оŸ� ƥ��Ĳ��� ����0-9
 */
public class MatchesDemo {
	public static void main(String[] args) {
		  System.out.println("���� ¼��һ���ֻ���");
		  String number = new Scanner(System.in).nextLine();
		  
		  String regex = "1[34578][0-9]{9}";
		  //��� ���ǵ��ַ��� �Ƿ���� regex�������
		  boolean b = number.matches(regex);
		  if(b){
			  System.out.println("��ȷ");
		  }else{
			  System.out.println("����");
		  }
		  
		  
	  }
}
