package level01_08;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 * ʹ��LinkedHashSet�洢����Ԫ��:"���Ѿ�","���Ѿ�","��ʩ","����","����".
 * ʹ�õ���������ǿforѭ������LinkedHashSet
 */
public class Test08 {
	public static void main(String[] args) {
		// 1.����LinkedHashSet
		LinkedHashSet<String> lhSet = new LinkedHashSet<String>();

		// 2.ʹ��add�������Ԫ�ص�LinkedHashSet
		lhSet.add("���Ѿ�");
		lhSet.add("���Ѿ�");
		lhSet.add("���Ѿ�");
		lhSet.add("��ʩ");
		lhSet.add("����");
		lhSet.add("����");

		// 3.ʹ�õ�������ȡLinkedHashSet�е�Ԫ��
		Iterator<String> iterator = lhSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// 4.ʹ����ǿfor��ȡLinkedHashSet�е�Ԫ��
		System.out.println("---------------------");
		for (String string : lhSet) {
			System.out.println(string);
		}
	}
}