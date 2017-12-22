package level02_05;

import java.util.ArrayList;
import java.util.HashSet;

/*
 *��һ������ String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
 *	����һ��ArrayList�������������Ԫ����ӽ�ArrayList����Ԫ�ز����ظ�(ʹ��HashSetȥ���ظ�Ԫ��)
 * */
public class Test05 {
	public static void main(String[] args) {
		// 1.����arr����
		String[] arr = {"abc","bad","abc","aab","bad","cef","jhi"};
		
		// 2.����HashSet����
		HashSet<String> hs = new HashSet<>();
		
		// 3.����arr����
		for (String str : arr) {
			// 4.��arr�����е�Ԫ����ӽ�HashSet��.�ظ��ľͲ�����ӽ�ȥ��
			hs.add(str);
		}
		
		// 5.����ArrayList����,��HashSet��Ԫ����ӵ�ArrayList��
		ArrayList<String> list = new ArrayList<>(hs);
		
		// 6.����ArrayList��ӡԪ��
		for (String str : list) {
			System.out.println(str);
		}
	}
}