package level01_05;

import java.util.HashSet;
import java.util.Iterator;

/*
 * ��HashSet������ַ���"zhangsan", "lisi", "wangwu", "zhangsan".ʹ�õ�������ȡHashSet�е�Ԫ��.
 */

public class Test05 {
	public static void main(String[] args) {
		// 1.����HashSet����
		HashSet<String> hs = new HashSet<>();
		
		// 2.ʹ��add������HashSet���Ԫ��
		hs.add("zhangsan");
		hs.add("lisi");
		hs.add("wangwu");
		hs.add("zhangsan");
		
		// 3.ʹ�õ�������ȡHashSet�е�Ԫ��
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}
}
