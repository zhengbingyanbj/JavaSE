package cn.itcast04.print;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 
 * PrintStream  �ֽڴ�ӡ��
 *    System.out ��һ��ͨ��    �ӳ��� ͨ�� ����̨�� һ��ͨ��
 * PrintWriter  �ַ���ӡ��  Ҳ��һ���ַ������
 * 
 *       print() ֱ�����  println()������� 
 *       
 *       write() ���   
 *       
 *       print println����д�κ�����
 *       writeд�ķ�ΧС
 *       
 *       
 */
public class PrintDemo {
  public static void main(String[] args) throws IOException {
	  
//	  System.out.println();
	  //�����ַ����������
	  PrintWriter pw = new PrintWriter("nba.txt");//ͨ������ ���ݾ͵�����
	  //д����
	  pw.write("���Ķ�����");
	  pw.println(new Object());
	  pw.print(true);
	  //�ͷ���Դ
	  pw.close();
   }
}
