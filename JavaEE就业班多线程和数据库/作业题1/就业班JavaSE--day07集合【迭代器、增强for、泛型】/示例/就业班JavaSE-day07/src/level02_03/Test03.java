package level02_03;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList������������:��a��, ��b��, ��c��, ��c��, ��a��, ��b��, ��b��, ��b��, ��a��.
 * ������Ϊ:frequency(ArrayList arr, String key)�ķ���.
 * arr��ArrayList����,key��Ҫ���ҵ�ĳ��Ԫ��.ʹ����ǿfor��ʽ����key��ArrayList�г��ֵĴ���.
 * ����������Ϊ�����ķ���ֵ.��mian�����е���frequency����
 */
public class Test03 {

	public static void main(String[] args) {
		// 1.����ArrayList
		List<String> list = new ArrayList<>();

		// 2.���Ԫ��
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");

		// 8.��main�е��������������
		System.out.println(frequency(list, "a")); // 3
	}

	// 3.����frequency����ͳ�Ƽ�����ָ��Ԫ�س��ֵĴ�����
	public static int frequency(List<String> list, String str) {
		// 4.��frequency�����м�������
		int count = 0;

		// 5.��frequency������ʹ����ǿfor���������ArrayList����.�õ�ÿ��Ԫ��
		for (String string : list) {
			// 6.�������������Ԫ����Ҫ���ҵ�Ԫ��.��������1
			if (string.equals(str)) {
				count++;
			}
		}
		// 7.���ؼ���ֵ
		return count;
	}

}
