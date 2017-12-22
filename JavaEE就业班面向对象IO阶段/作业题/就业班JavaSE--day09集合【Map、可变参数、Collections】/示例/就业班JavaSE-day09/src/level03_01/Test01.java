package level03_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
	Map����{����=3,����=4,����=5,����=6,����=7,����=7,�ܰ�=5}��ЩԪ��.
	��Map��value��ͬ��Ԫ�ش�Map��ȥ��.�ٽ�Map��ʣ��Ԫ�ص�key��ŵ�һ��ArrayLis��,����ӡ������̨��
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		// 1.����HashMap����key�������,value�������
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 2.ʹ��put������Ӷ�Ӧ��Ԫ��
		hm.put("����", 3);
		hm.put("����", 4);
		hm.put("����", 5);
		hm.put("����", 6);
		hm.put("����", 7);
		hm.put("����", 7);
		hm.put("�ܰ�", 5);
		
		// 3.����һ��ArrayList����ظ���ֵ
		ArrayList<Integer> repeatValues = new ArrayList<>();
		
		// 4.�õ����еļ��ŵ�ArrayList��
		ArrayList<Integer> values = new ArrayList<>(hm.values());
		
		// 5.�������е�ֵ
		for (int i = 0; i < values.size(); i++) {
			// 6.�õ�һ��ֵ
			Integer value = values.get(i);
			
			// 7.�ͺ������Щֵ�Ƚ�,���Ƿ����ظ���
			for (int j = i + 1; j < values.size(); j++) {
				
				Integer v2 = values.get(j);
				// 8.�ͺ���ıȽ���ͬ,˵���ظ�
				if (value == v2) {
					// 9.���ظ���ֵ����repeatValues��
					repeatValues.add(value);
				}
			}
		}
		
		System.out.println(repeatValues);
		
		// 10.����һ��ArrayList���ֵ��ͬ�ļ�.��Ϊֻ���ü�ȥɾ��
		ArrayList<String> repeatKeys = new ArrayList<>();
		
		// 11.ʹ��keySet����HashSet
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Integer value = hm.get(key);
			
			// 12.���ֵ���ظ���,��ô�����������repeatKeys��
			if (repeatValues.contains(value)) {
				repeatKeys.add(key);
			}
		}
		System.out.println(repeatKeys);
		
		// 13.�����ظ��ļ�,ͨ����ȥHashMap��ɾ��Ԫ��
		for (String key : repeatKeys) {
			hm.remove(key);
		}
		
		// 14.���ɾ�����HashMap
		System.out.println(hm);
	}

}