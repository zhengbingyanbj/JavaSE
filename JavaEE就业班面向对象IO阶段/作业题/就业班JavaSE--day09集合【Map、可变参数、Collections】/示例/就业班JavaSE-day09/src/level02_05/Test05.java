package level02_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
	������һ��map��������:{1="������",2="������",3="����",4="���ʦ̫"}
		Ҫ��:
		1.��map�����е�������Ϣ��ʾ������̨��
		2.���map�����в���һ������Ϊ5����Ϊ���������Ϣ
	 	3.�Ƴ���map�еı��Ϊ1����Ϣ 
	 	4.��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"

 */
public class Test05 {
	public static void main(String[] args) {
		// 1.����HashMap,�����Ϊkey,������Ϊvalue
		Map<Integer,String> map = new HashMap<Integer, String>();
		
		// 2.ʹ��put�������Ԫ��
		map.put(1, "������");
		map.put(2, "������");
		map.put(3, "����");
		map.put(4, "���ʦ̫");
		
		//	3.ʹ��keySet+��ǿfor����map�е�Ԫ��,����ӡ
		Set<Integer> keySet = map.keySet();
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key + " -- " + value);
		}
		
		// 4.ʹ��put���map�����в���һ������Ϊ5����Ϊ���������Ϣ
		map.put(5, "������");
		
		// 5.ʹ��remove�Ƴ���map�еı��Ϊ1����Ϣ 
		map.remove(1);
		
		// 6.ʹ��put��map�����б��Ϊ2��������Ϣ�޸�Ϊ"����"
		map.put(2, "����");
		System.out.println(map);
	}

}