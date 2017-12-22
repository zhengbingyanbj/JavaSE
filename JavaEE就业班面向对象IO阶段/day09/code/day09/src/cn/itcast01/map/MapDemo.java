package cn.itcast01.map;

import java.util.HashMap;

/*
 *   Map  ��˫�м��ϵĶ���ӿ� Ҳ����˫�м��ϵĹ淶
 *      ��  ֵ  
 *      Key  Value 
 *      
 *      Map<K,V>  
 *        K �����������
 *        V ����ֵ������
 *        
 *     ÿ�δ洢һ�Զ�Ԫ�� 
 *     
 *     �ص�
 *       1:��Ψһ  ֵ�����ظ�
 *       2��һ����ֻ��Ӧһ��ֵ
 *       3����ά�� ��ϵ 
 *     �ӷ���������  
 *     
 *     Map�ķ���   �ӿ�  
 *       ѧϰ����  
 *         HashMap<K,V>
 *         
 *       V put(K key, V value) ��ָ����ֵ���ӳ���е�ָ�������� 
 *               ��� ���µ� ӳ���ϵ 
 *               
 *       V remove(Key k) ���ݼ�ɾ��ӳ���ϵ  ����ֵΪӳ���ֵ  
 *        V get(Key k)  ���ݼ��Ҷ�Ӧ��ֵ  �ҵ�û�м� ���ص���null
 */
public class MapDemo {
     public static void main(String[] args) {
	      //�������϶���
    	 HashMap<String, String>  map = new HashMap<String,String>();
    	 
    	 //���Ԫ�ص����� 
    	map.put("������","��ӱ");
    	map.put("������", "����");
    	map.put("�೤", "����");
//    	map.put("�೤", "zhuyin");
    	
    	System.out.println(map);
    	
    	//V remove(Key k)
    	
    	 System.out.println("�೤Ҫ�˳������ˣ�"+map.remove("�೤"));
           
    	 
    	 System.out.println(map);
    	 
    	 // V get(Key k)  ���ݼ��Ҷ�Ӧ��ֵ
    	 
    	 System.out.println("�鿴������ϱ����"+map.get("������"));
    	 System.out.println("�鿴�೤ϱ����"+map.get("�೤"));
    	 
    	 /*
    	  *    boolean containsKey(Object key)  �жϸ�map�ļ����Ƿ��д�key
    	  *    boolean containsValue(Object value) �жϸ�map��ֵ���Ƿ�� value
    	  *  
    	  *    boolean isEmpty() �Ƿ��� ��ֵ�� 
    	  *    Set<K> keySet() ��ȡ����
    	  *    Collection<V> values() ��ȡֵ��
    	  *    int size() �м��Զ�Ԫ��
    	  *    
    	  *      ����¼��һ�� �ַ���  
    	  *        ͳ�� ÿ���ַ����ֵĴ��� 
    	  */
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	 } 
}
