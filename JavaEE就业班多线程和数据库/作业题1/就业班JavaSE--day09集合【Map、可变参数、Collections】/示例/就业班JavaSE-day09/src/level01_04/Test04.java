package level01_04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * ��һ��Map�������������Ԫ��.��ȡMap�е�����value, ��ʹ����ǿfor�͵������������ÿ��value
 */
public class Test04 {
	public static void main(String[] args) {
		// 1.����HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// 2.ʹ��put���Ԫ��
		hm.put("������", "Baby");
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("���ţ", "������");
		
		// 3.ʹ��Map��values������ȡ�����е�value
		Collection<String> values = hm.values();
		
		// 4.ʹ����ǿfor��ȡÿ��value
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println("----------------");
		// 5.ʹ�õ�������ȡÿ��value
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}