package level01_03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * ��һ��Map�������������Ԫ��.��ȡMap�е�����key,��ʹ����ǿfor�͵������������ÿ��key.
 */
public class Test03 {
	public static void main(String[] args) {
		// 1.����HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// 2.ʹ��put���Ԫ��
		hm.put("������", "Baby");
		hm.put("�˳�", "��ٳ");
		hm.put("�", "������");
		hm.put("���ţ", "������");
		
		// 3.ʹ��Map��keySet������ȡ�����е�key
		Set<String> keySet = hm.keySet();
		
		// 4.ʹ����ǿfor��ȡÿ��key
		for (String key : keySet) {
			System.out.println(key);
		}
		
		System.out.println("----------------");
		// 5.��ȡkeySet�ĵ�����
		Iterator<String> itr = keySet.iterator();
		// 6.ѭ���жϵ��������Ƿ�����һ��Ԫ��
		while (itr.hasNext()) {
			// 7.ʹ�õ�������ȡÿ��key
			System.out.println(itr.next());
		}
	}
}