package cn.itcast01.map;

import java.util.HashMap;
/*
 * put�������
 *   V put(K key, V value) ��ָ����ֵ���ӳ���е�ָ�������� 
 *   
 *      ��һ���� ��һ�γ��ֵ�ʱ�� 
 *          put���ʲô����  ��ӳ����ӵ�������
 *          ����ֵ ��null
 *          
 *      �����Ѿ����� 
 *        put���ʲô   ���ݼ� �滻�� ֮ǰ��ֵ  �洢����ֵ
 *        ����ֵ  ���滻��ֵ
 *        
 *        
 *      ���� ��������ӳ���ϵ��  ��ά��  
 *         ���صĶ��� ���滻�� 
 */
public class MapDemo2 {
   public static void main(String[] args) {
	  
	   //�������϶���
	   HashMap<String, String>  map = new HashMap<String,String>();
	   System.out.println(map);
	  map.put("������", "��ӱ");
	  System.out.println(map.put("����", "�����P"));
	   System.out.println(map);
	   
	  System.out.println(map.put("����", "Ҧ��"));
	   System.out.println(map);
   }
}
