package cn.itcast02.zhuanhuanliu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/*
 *  �ַ���  = �ֽ���+�����; 
 * 
 *   �ַ�������ϵ  
 *      �������Ա����
 *      ÿ�� ������ʱ��  ��  ���� д ��ֱ�Ӳ������� �ַ� �������ֽ�
 *      
 *      |----Reader  �ַ�������  ������
 *             ���Թ���   ��һ���ַ�   ��һ���ַ�����  �����ַ�����һ���ֶ�ȡ
 *             |----InputSteamReader  �ַ�������  
 *                      ת����
 *                      �ֽ���ͨ���ַ��������� 
 *                      ���ı�(�ֽ�)�ļ��е� �ֽڶ������� ͨ����ָ������� ת���� ��Ӧ���ַ� 
 *                  |---FileReader  �ַ�������  
 *                        �ַ��������ı����
 *                         ���ı�(�ֽ�)�ļ��е� �ֽڶ������� ͨ��Ĭ�ϱ����  ת���� ��Ӧ���ַ� 
 *             
 *      |----Writer  �ַ������  ������
 *             ���Թ���   дһ���ַ�  дһ���ַ�����  дһ���ַ���  ��������
 *             |----OutputStreamWriter  �ַ������
 *                       ת����
 *                       �ַ���ͨ���ֽ���������
 *                       ���ַ� ���� ��ָ������� ת���ɶ�Ӧ���ֽ� ͨ���ֽ������д���ļ���
 *                  |---FileWriter �ַ������
 *                        �ַ�������ı����
 *                        ���ַ� ���� Ĭ�ϱ���� ת���ɶ�Ӧ���ֽ� ͨ���ֽ������д���ļ���
 *                   
 *                    ����д���ַ��ļ��ı���ࡣ����Ĺ��췽���ٶ�Ĭ���ַ�����
 *                  
 * 
 */
public class Demo02 {
   public static void main(String[] args) throws IOException {
	   /*
	    * ʹ���ַ�������ת���� ��ȡ ָ������ ��  utf-8 �ļ�  utf8.txt
	    *    InputStreamReader 
	    */
	   //��������
	   InputStreamReader isr = new InputStreamReader(new FileInputStream("utf8.txt"),"utf-8");
       //��ȡ 
	   char[] buffer = new char[1024];
	   int len;
	   
	   while((len=isr.read(buffer))!=-1){
		   
		   String s = new String(buffer,0,len);
		   System.out.println(s);
	   }
	   
	   //�ͷ���Դ
	   isr.close();
	   
	   
	   
	   
	   
	   
	   
	   
   }
}
