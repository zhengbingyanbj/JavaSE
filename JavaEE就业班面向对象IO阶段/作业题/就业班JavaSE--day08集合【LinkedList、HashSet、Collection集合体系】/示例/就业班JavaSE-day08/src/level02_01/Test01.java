package level02_01;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * ArrayList������Ԫ��: "a","f","b","c","a","d"
 * ����HashSet��ArrayList����ȥ��(���ս��: ArrayList��û���ظ�Ԫ��)
 */
public class Test01 {
	public static void main(String[] args) {
		// 1.����ArrayList
		ArrayList<String> list = new ArrayList<>();
		
		// 2.ʹ��add������ArrayList���Ԫ��
		list.add("a");
		list.add("f");
		list.add("b");
		list.add("c");
		list.add("a");
		list.add("d");

		// 3.����HashSet.���ڽ�ArrayList���ظ���Ԫ��ȥ��
		HashSet<String> set = new HashSet<>();
		
		// 4.����HashSet��addAll����,��ArrayList�е�Ԫ����ӵ�HashSet��
		set.addAll(list);
		
		// 5.���list������Ԫ��
		list.clear();
		
		// 6.��set�����е�Ԫ������ӻ�ArrayList����
		list.addAll(set);
		System.out.println(list);
	}
}