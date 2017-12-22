package level03_02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
	���ǲ���
		Java������
			001	�
			002	������
		Java��ҵ��
			001	����
			002	����
	ʹ��HashMapǶ��HashMap��ʽ���,1ʹ��keySet����ǿfor�����������Ԫ��,2ʹ��entrySet�͵����������������Ԫ��

 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		// 1.����Java�������HashMap<String, String>
		HashMap<String, String> JavaSEMap = new HashMap<String, String>();
		// 2.���2��ѧ����Java�������Map
		JavaSEMap.put("001", "�");
		JavaSEMap.put("002", "������");

		// 3.����Java��ҵ���HashMap<String, String>
		HashMap<String, String> JavaEEMap = new HashMap<>();
		// 4.���2��ѧ����Java��ҵ���Map
		JavaEEMap.put("001", "����");
		JavaEEMap.put("002", "����");

		// 5.���崫�ǲ��ͼ���HashMap<String, HashMap<String, String>>
		HashMap<String, HashMap<String, String>> czbkMap = new HashMap<>();
		// 6.��Java�������Java��ҵ���ŵ����ǲ���HashMap������
		czbkMap.put("Java������", JavaSEMap);
		czbkMap.put("Java��ҵ��", JavaEEMap);

		// 7.ʹ��keySet����ǿfor�����������Ԫ��
		// 7.1ʹ��keySet��ȡ���ǲ��ͼ��ϵ�����key
		Set<String> keySet = czbkMap.keySet(); // "Java������", "Java��ҵ��"
		// 7.2ʹ����ǿfor��ȡ���ǲ��ͼ���ÿ��key
		for (String czbkKey : keySet) {
			System.out.println(czbkKey);
			// 7.3ͨ��key��value,value��Java�������HashMap��Java��ҵ���HashMap
			HashMap<String, String> classMap = czbkMap.get(czbkKey);

			// 7.4�õ��༶��HashMap����key
			Set<String> classKeys = classMap.keySet();
			// 7.5�����༶��ÿ��key(ѧ��)
			for (String key : classKeys) {
				// 7.6���ݰ༶��key(ѧ��)ȥ��value(����)
				String value = classMap.get(key);
				System.out.println("\t" + key + " -- " + value);
			}
		}
		
		System.out.println("-------------------");
		
		// 8.ʹ��entrySet�͵����������������Ԫ��
		// 8.1ʹ��entrySet��ȡ���ǲ��ͼ��ϵ�����Entry
		Set<Entry<String, HashMap<String, String>>> entrySet = czbkMap.entrySet();
		// 8.2�õ����ǲ��ͼ��ϵ�����Entry�ĵ�����
		Iterator<Entry<String, HashMap<String, String>>> czbkItr = entrySet.iterator();
		// 8.3ѭ���жϴ��ǲ�������Entry�ĵ������Ƿ�����һ��Ԫ��
		while (czbkItr.hasNext()) {
			// 8.4ͨ�����ǲ�������Entry�ĵ�������ȡһ��Entry
			Entry<String, HashMap<String, String>> czbkEntry = czbkItr.next();
			// 8.5���Entry��key(�༶����)
			System.out.println(czbkEntry.getKey());
			
			// 8.6��ȡEntry��value(ĳ���༶Map����)
			HashMap<String, String> classMap = czbkEntry.getValue();
			
			// 8.7��ȡ�༶Map������Entry
			Set<Entry<String, String>> classEntry = classMap.entrySet();
			// 8.8�õ��༶Map������Entry�ĵ�����
			Iterator<Entry<String, String>> classItr = classEntry.iterator();
			// 8.9ѭ���а༶Map������Entry�ĵ������Ƿ�����һ��Ԫ��
			while (classItr.hasNext()) {
				// 8.10 ʹ�ð༶Map������Entry�ĵ������ó�һ��Entry
				Entry<String, String> entry = classItr.next();
				// 8.11����ʽ���entry��key��entry��value
				System.out.println("\t" + entry.getKey() + " -- " + entry.getValue());
			}
		}
	}

}