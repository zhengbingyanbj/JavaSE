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
 *                 �����ֽ����鷽ʽ ��ȡ 
 *                 ���Ĳ���  ����������ÿ�ζ�ȡ�ֽڵ�����
 *                 ����ֵ      �� ÿ�ζ�ȡ������ʵ���ֽڸ���
 *                 
 *        int read(byte[] buffer,int start,int len) 
 *        
 *           |-----FileInputStream  �����ļ����ֽ������� 
 *                  FileInputStream(String name)
 *                  FileInputStream(File file)
 *      
 */
public class InputStreamDemo2 {
   public static void main(String[] args) throws Exception {
	   //1�������ֽ�����������
	   FileInputStream fis = new FileInputStream("a.txt");
	   
	   //2: ��ȡ�ļ�
	   /*
	    * ����һ�ֽ�������ʽ��ȡ
	    */
       //����һ����������  ��������ÿ�ζ�ȡ�����ֽ� 
	   byte[] buffer = new byte[2];
	   //����һ�����ձ���   len  ���� ÿ�� ��ȡ�����ֽڵĸ���
	   int len;
	   /*
	    *   fis.read(buffer) �����ֽ����� ���ж�ȡ�ļ� ���������ֽڴ浽������
	    *   len = fis.read(buffer)  ÿ�ζ����ĸ��� ʹ��len����
	    *   ��=-1 ��������� len -1
	    */
	   while((len=fis.read(buffer))!=-1){
		    // buffer ������ 0��ʼ len��   ��Щ���� ������ʵ���ֽ�
		   
		    for(int i = 0;i<len;i++){
		    	System.out.println(buffer[i]);
		    }
	   }
	   
	   //3:�ͷ�
	   fis.close();
	   
   }
}
