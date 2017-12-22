package cn.itcast04.properties;

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
 *   
 *   ������Ƕ��Ͽ�  Properties��һ�� ˫�� ����
 *   ��ô�;߱����ϲ���  
 *   
 *     Object setProperty(String key, String value) ���� Hashtable �ķ��� put�� 
 *    
 *     Set<String> stringPropertyNames() ���ش������б��еļ��� 
 *     
 *     String getProperty(String key) ��ָ���ļ��ڴ������б����������ԡ� 
 */
public class PropertiesDemo {
   public static void main(String[] args) {
	  //1:����Properties���϶���
	   Properties pp = new Properties();
	   //2:���Ԫ�ص�����
//	   pp.put("������", "����");
//	   pp.put("֩����", "Ƥ��");
//	   pp.put("�����", 72);
	   //�����Ͻ� ��ΪProperties ÿ���������Ӧֵ����һ���ַ�����
	   //��������Ҳ���ȥ  �����Ͻ�
	   //Object setProperty(String key, String value)
	   pp.setProperty("������", "����");
	   pp.setProperty("��è��", "����");
	   pp.setProperty("������", "Τ��");
	   
	   //���� 
//	   Set<Object> keySet = pp.keySet();
       // �����Ͻ�  	   
	   Set<String> keys = pp.stringPropertyNames();
	   //����
	   for (String key : keys) {
		   //���ݼ���ȡֵ 
//		   Object object = pp.get(key);
		   String value = pp.getProperty(key);
		   
		   System.out.println(key+"  "+value);
	   }
	   
	   
	   
	   
	   
   }
}
