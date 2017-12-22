package cn.itcast01.inoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 *   InputStream 
 *     �˳������Ǳ�ʾ�ֽ���������������ĳ��ࡣ 
 *     
 *       �ֽ��������ĳ����� ���涨���� ���ԵĹ���
 *        
 *        close() �ͷ���Դ 
 *        
 *        int  read() ����һ���ֽڷ�ʽ��ȡ 
 *                     ÿ�ε��øù��� ��ȡһ���ֽ� 
 *                     ����ֵ  ������ζ�ȡ���� �ֽ� 
 *        
 *        int read(byte[] buffer) 
 *        int read(byte[] buffer,int start,int len) 
 *        
 *           |-----FileInputStream  �����ļ����ֽ������� 
 *                  FileInputStream(String name)
 *                  FileInputStream(File file)
 *      
 */
public class InputStreamDemo {
   public static void main(String[] args) throws Exception {
	   //1�������ֽ�����������
	   FileInputStream fis = new FileInputStream("a.txt");
	   
	   //2: ��ȡ�ļ�
	   /*
	    * ����һ��һ���ֽ���ʽ��ȡ
	    */
//	   int i1 = fis.read();
//	   System.out.println(i1);
//	   
//	   System.out.println(fis.read());
	   //ѭ���Ľ�
	   // ����һ�� ���ձ���  ����ÿ�ζ�ȡ�����ֽ�
	   int b;
	   /*
	    *   fis.read()��ȡ�ļ��е�һ���ֽ�
	    *   b=fis.read() ʹ��b���ն�ȡ���ֽ�
	    *   !=-1 ��������˽�β ��ô����-1 
	    */
	   while((b=fis.read())!=-1){
		   System.out.println(b);
	   }
	   
	   //3:�ͷ�
	   fis.close();
	   
   }
}
