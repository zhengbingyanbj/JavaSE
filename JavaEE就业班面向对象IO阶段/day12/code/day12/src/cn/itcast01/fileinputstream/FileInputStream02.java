package cn.itcast01.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream02 {
   public static void main(String[] args) throws IOException {
	 //�����ֽ�����������
	   FileInputStream fis = new FileInputStream("a.txt");
	  //ʹ�����鷽ʽ��ȡ
	   
	   byte[] buffer = new byte[1024];
	   
	   int len = fis.read(buffer);
	   
	   //buffer  0  len 
	   //public String(byte[] bytes, int startIndex,  int length) ���ֽ�����һ����Ԫ�� ת�����ַ���
	   
	   String s = new String(buffer,0,len);//�ַ������������ �������   ���ֽ� ���� Ĭ�ϵı��뼯ת����  �ַ�
	   
	   System.out.println(s);
	   //�ͷ�
	   fis.close();
	   
   }
}
