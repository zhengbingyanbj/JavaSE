package level01_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map�����а���5��Ԫ��: 
 * 	"�˳�"->"��ٳ", "�"->"������", "���»�"->"����", ����������->�� Baby��, ��л���桱->���Ű�֥��.
 * ʹ��Entry��ʽ������Map�����е�Ԫ��
 */
public class Test06 {
	public static void main(String[] args) {
		// 1.����HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// 2.ʹ��put�������Ԫ��
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("���»�", "����");
		hm.put("������", "Baby");
		hm.put("л����", "�Ű�֥");

		// 3.ʹ��entrySet������ȡ�����еļ�ֵ�Թ�ϵ
		Set<Entry<String, String>> entrySet = hm.entrySet();

		// 4.��ȡentrySet�ĵ�����
		Iterator<Entry<String, String>> it1 = entrySet.iterator();
		// 5.ʹ�õ������鿴�Ƿ�����һ��Ԫ��
		while (it1.hasNext()) {
			// 6.ʹ�õ������õ���һ��Ԫ��(Entry����)
			Map.Entry<String, String> entry = it1.next();

			// 7.ͨ��һ��Entry<K,V>��ȡ��key��value
			System.out.println(entry.getKey() + " -" + entry.getValue());
		}
	}
}