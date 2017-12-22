package level02_10;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * ��2��ArrayList,Ԫ������: array1 = "a","b","a","c","d",
 * array2 = "e","f","a","d","g",�����������ظ���ȥ����ϲ���һ������
 * */
public class Test10 {
	public static void main(String[] args) {
		// 1.����ArrayList array1
		ArrayList<String> array1 = new ArrayList<String>();
		// 2.ʹ��add����Ϊarray1��Ŷ�Ӧ��Ԫ��
		array1.add("a");
		array1.add("b");
		array1.add("a");
		array1.add("c");
		array1.add("d");
		
		// 3.����ArrayList array2
		ArrayList<String> array2 = new ArrayList<String>();
		// 4.ʹ��add����Ϊarray2��Ŷ�Ӧ��Ԫ��
		array2.add("e");
		array2.add("f");
		array2.add("a");
		array2.add("d");
		array2.add("g");
		
		// 5.����HashSet���ڴ��ȥ���ظ���Ԫ��
		HashSet<String> hs = new HashSet<>();
		// ����1,�򵥷���
//		hs.addAll(arr1);
//		hs.addAll(arr2);
		
		// ����2
		// 6.����array1,��ȡ��ÿ��Ԫ��,��ÿ��Ԫ����ӵ�HashSet��
		for (String str : array1) {
			hs.add(str);
		}
		
		// 7.����array2,��ȡ��ÿ��Ԫ��,��ÿ��Ԫ����ӵ�HashSet��
		for (String str : array2) {
			hs.add(str);
		}
		
		// 8.���HashSet��ȥ���ظ����Ԫ��
		System.out.println(hs);
	}
	
}