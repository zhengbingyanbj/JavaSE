package cn.itcast01.fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * ʹ���ֽ�������  ��ȡ һ���ı��ļ�  ���ĵ�   
 *     һ���ֽ�һ���ֽ���ʽ
 *     
 *     �ı��ļ�a.txt   4 ���ֽ�
 */
public class FileInputStreamDemo {
      public static void main(String[] args) throws IOException {
		 //1:�����ֽ�����������
    	  FileInputStream fis = new FileInputStream("b.txt");
    	  //2:��ȡ����  ʹ�� һ���ֽ�һ���ֽ���ʽ 
    	  int b;
    	  
    	  while((b=fis.read())!=-1){
    		  System.out.println(b);
    	  }
    	  
    	  //3�ͷ���Դ
    	  fis.close();
	   }
}
