package cn.itcast01.fileinputstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ʹ���ַ��� ��ȡ�����ļ�
 *   
 */
public class FileReaderDemo {
   public static void main(String[] args) throws IOException {
	 //1:�����ַ�����������
	   //FileWriter fw = new FileWriter("d.txt");
	   FileReader fr = new FileReader("b.txt");
	   
	   //2:ʹ��һ���ַ�һ���ַ���ʽ
	   int ch;
	   
	   while((ch=fr.read())!=-1){
		   System.out.println((char)ch);
	   }
	   
	   //�ͷ�
	   fr.close();
  }
}
