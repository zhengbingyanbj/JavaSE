package cn.itcast03.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/*
 * BufferedInputStream 
 *   ��Ч���ֽ�������   
 *      ��߻�������  ��ȡЧ��  
 *      
 *      InputStream ������ 
 *      
 *      BufferedInputStream(InputStream in)
 */
public class BufferedInputStreamDemo {
   public static void main(String[] args) throws Exception {
	  //���� ��Ч���ֽ�������
	   BufferedInputStream bis = new BufferedInputStream(new  FileInputStream("b.txt"));
	   //��ȡ 
	   byte[] buffer = new byte[1024];
	   
	   int len;
	   
	   while((len=bis.read(buffer))!=-1){
		   
		   for(int i = 0;i<len;i++){
			   System.out.println(buffer[i]);
		   }
	   }
	   //�ر���
	   bis.close();
   }
}
