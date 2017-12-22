package cn.itcast02.zhuanhuanliu;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
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
public class Demo01 {
      public static void main(String[] args) throws IOException {
		  /*
		   * ʹ�� ָ�������  utf-8 ����� 
		   *    д ���  ��  utf8.txt�ļ�
		   *     ʹ�� �ַ������  ת���� ���
		   */
    	  //1:�����ַ������ ת�������� ����ָ��������ʽ 
    	  OutputStreamWriter  osw = new OutputStreamWriter(new FileOutputStream("utf8.txt"), "utf-8");
    	  
    	  //2: д ���
    	  osw.write("���");
    	  //3���ͷ���Դ
    	  osw.close();
    	  
    	  
	   }
}
