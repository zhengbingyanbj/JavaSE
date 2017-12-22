package level01_05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Map�����а���5��Ԫ��: 
 * 	"�˳�"->"��ٳ", "�"->"������", "���»�"->"����", ����������->�� Baby��, ��л���桱->���Ű�֥��.
 * ʹ��keySet��ʽ������Map�����е�Ԫ��
 */
public class Test05 {
	public static void main(String[] args) {
		// 1.����HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// 2.ʹ��put�������Ԫ��
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("���»�", "����");
		hm.put("������", "Baby");
		hm.put("л����", "�Ű�֥");

		// 3.ʹ��keySet������ȡ���еļ�
		Set<String> keySet = hm.keySet();

		// 4.��ȡ��keySet�ĵ�����
		Iterator<String> it = keySet.iterator();
		
		// 5.ѭ���жϵ������Ƿ�����һ��Ԫ��
		while (it.hasNext()) {
			// 6.ʹ�õ�����next������ȡ��һ����
			String key = it.next();
			
			// 7.ͨ��һ�����ҵ�һ��ֵ
			String value = hm.get(key);
			
			// 8.�������ֵ
			System.out.println(key + " - " + value);
		}
	}
}