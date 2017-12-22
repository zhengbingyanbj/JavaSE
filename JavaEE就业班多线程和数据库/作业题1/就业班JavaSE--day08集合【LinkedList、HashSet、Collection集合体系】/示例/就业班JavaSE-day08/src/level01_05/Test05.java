package level01_05;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 往HashSet中添加字符串"zhangsan", "lisi", "wangwu", "zhangsan".使用迭代器获取HashSet中的元素.
 */

public class Test05 {
	public static void main(String[] args) {
		// 1.创建HashSet集合
		HashSet<String> hs = new HashSet<>();
		
		// 2.使用add方法往HashSet添加元素
		hs.add("zhangsan");
		hs.add("lisi");
		hs.add("wangwu");
		hs.add("zhangsan");
		
		// 3.使用迭代器获取HashSet中的元素
		Iterator<String> itr = hs.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
	}
}
