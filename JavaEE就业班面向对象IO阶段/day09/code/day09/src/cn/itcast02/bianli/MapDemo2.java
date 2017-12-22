package cn.itcast02.bianli;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*  
 * 
 * ���ϵı�����ʽ��  
 *    ���ݼ�ֵ�� ��ϵ ȥ��ɱ��� 
 *      1���������϶��� ���Ԫ��
 *      2����ȡ���еļ�ֵ�Թ�ϵ  
 *      3�������õ� ÿһ�� entry����
 *      4������entry���� getKey()  getValue
 *      
 *      
 *      Set<Map.Entry<K,V>> entrySet() ���ش�ӳ���а�����ӳ���ϵ 
 *      
 */
public class MapDemo2 {
    public static void main(String[] args) {
		//�������϶��� 
    	HashMap<String, String>  map = new HashMap<String,String>();
    	
    	//�洢Ԫ�ص�����
    	map.put("������","�䵱");
    	map.put("���ʦ̫","��ü");
    	map.put("����","����");
    	map.put("���޼�","����");
    	
    	//3:��ȡ���еļ�ֵ�� ��ϵ
    	 Set<Entry<String, String>> entrySet = map.entrySet();
    	 //4:���� entrySet�õ�ÿһ��entry����
    	 for (Entry<String, String> entry : entrySet) {
			  // entry���� ÿһ����ֵ�Զ���
    		 //����
    		 String key = entry.getKey();
    		 String value = entry.getValue();
    		 
    		 System.out.println(key+"�������ǣ�"+value);
		 }
	}
}
