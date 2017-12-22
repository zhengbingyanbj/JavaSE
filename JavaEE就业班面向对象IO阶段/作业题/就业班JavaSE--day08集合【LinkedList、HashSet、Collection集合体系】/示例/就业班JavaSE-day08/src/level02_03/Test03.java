package level02_03;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * ��֪������һ��QQ����.QQ�����Ϊ11λ,���Ϊ5λ
	String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
	�����������������qq�Ŷ������LinkedList��,��list���ظ�Ԫ��ɾ��,��list������Ԫ�������ַ�ʽ��ӡ����
 */
public class Test03 {
	public static void main(String[] args) {
		// 1.����QQ��������String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
		String[] strs = { "12345", "67891", "2347809933", "98765432102", "67891", "12347809933" };
		
		// 2.����LinkedList
		LinkedList<String> qqList = new LinkedList<>();
		
		// 3.����strs��ȡÿ��qq����
		for (String qq : strs) {
			// 4.�ж�LinkedList�Ƿ��Ѿ��������qq����
			if (!qqList.contains(qq)) {
				// 5.���������qq��������ӵ�LinkedList��
				qqList.add(qq);
			}
		}

		// 6.��ǿfor����
		for (String qq : qqList) {
			System.out.println(qq);
		}
		System.out.println("------------------");
		
		// 7.����������
		Iterator<String> iterator = qqList.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);
		}
	}
}