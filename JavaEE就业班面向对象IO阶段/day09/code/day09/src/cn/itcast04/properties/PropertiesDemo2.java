package cn.itcast04.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
 * Properties  
 *   Properties ���ʾ��һ���־õ����Լ���
 *   Properties �ɱ��������л�����м��ء�
 *   �����б���ÿ���������Ӧֵ����һ���ַ�����
 *   
 *   1:Properties ���� Hashtable<K,V> ���ӿ� Map<K,V>  
 *    map�ж���Ĺ��ܶ��߱�
 *   2:û�з���   ��Ϊ ÿ���� ��ֵ ����String���� 
 *   3: �ü��� ���Խ����ݴ浽�ļ���  Ҳ���Դ��ļ��л�ȡ���ݵ�������
 *   4���ü�����Ψһ���������н����ļ��� 
 *   
 *      load(������)  �����ж�ȡ���ݵ�����
 *      
 *      store(�����,ע��)  ������д������
 *   
 */
public class PropertiesDemo2 {
   public static void main(String[] args) throws IOException {
	    //�������϶���
	   Properties pp = new Properties();
	   
	   // ����load����
	   pp.load(new FileReader("db.properties"));
	   
	   
	   System.out.println(pp);
	   
	   
	   
	   
   }
}
