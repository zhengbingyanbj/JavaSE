package cn.itcast.demo02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class NoNameDemo {
     public static void main(String[] args) throws FileNotFoundException {
	   
//    	 //��������
//    	 Player p = new Player();// ���� �ұߵĶ��� ���˸����� ��p
//    	 
//    	 //p ���ñ���  ָ�� һ�����ڴ�Ŀռ�  
//    	 
//    	 new Player();//���Ƕ��� ֻ���� û������ָ��   ��һ��û�����ֵĶ��� ��Ϊ��������
    	 
    	 
    	 //����  
    	 //��������
    	 Player p = new Player();
    	 // һ������ ���� �Ĵ� ����
    	 p.show();
    	 p.show();
    	 p.show();
    	 p.show();
    	 System.out.println("------------");
    	 //�ĸ����� ����ÿ������һ��  
    	 new Player().show();//����������÷���
    	 new Player().show();//����������÷���
    	 new Player().show();//����������÷���
    	 new Player().show();//����������÷���
    	 /*
    	  * �ڵ���ʹ�õ�ʱ��   
    	  *    ���� ���Ǹö������������ �е�ĳһ������һ��  ��ô����ѡ������������
    	  */
    	 
    	 /*
    	  * ��� 
    	  *    �� ���õ�ʱ��  ���� �ڷ�������ֵ�����ʱ��   
    	  *    
    	  *    ֻҪ����ʹ�� ��������ĵط� ������ʹ�������������
    	  */
    	 
    	 BufferedReader  br = new  BufferedReader(new FileReader("a.txt"));
    	 
    	 FileReader fr = new FileReader("a.txt");
    	 BufferedReader  br2 = new  BufferedReader(fr);
	 }
} 
