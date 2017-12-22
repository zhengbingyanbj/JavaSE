package cn.itcast02.bianli;

import java.util.HashMap;
import java.util.Set;

/*   ˫�м���û�� foreach
 *   java.util.Map<K,V>
 *     ����   
 *     ���ϾͿ��Դ洢Ԫ�� 
 *        �洢�ɶԵ� 
 *        
 *        ��ɼ��ϱ���
 *      ������ʽһ ֮   ����ֵ    
 *        
 *        1:�������϶���  �洢Ԫ��
 *        2:��ȡ���еļ� ���� keySet����
 *        3:�������� �õ�ÿ���� 
 *        4:ͨ�����ҵ���Ӧ��ֵ  get(Key )
 */
public class MapDemo {
    public static void main(String[] args) {
		//�������϶��� 
    	HashMap<String, String>  map = new HashMap<String,String>();
    	
    	//�洢Ԫ�ص�����
    	map.put("������","�䵱");
    	map.put("���ʦ̫","��ü");
    	map.put("����","����");
    	map.put("���޼�","����");
    	
    	//2:��ȡ����
    	Set<String> keys = map.keySet();
    	//3:��������
    	for (String key : keys) {
			//key  ����ÿ����
    		//4�����ݼ���ȡֵ 
    		String value = map.get(key);
    		System.out.println(key+"�������ǣ�"+value);
		}
    	
	}
}
