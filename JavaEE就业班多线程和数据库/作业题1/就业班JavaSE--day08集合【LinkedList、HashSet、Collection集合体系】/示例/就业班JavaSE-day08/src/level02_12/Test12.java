package level02_12;

import java.util.ArrayList;

/*
	定义一个方法filterChars(ArrayList<String> list)将传入的ArrayList<String>集合中的每个元素中的字母过滤掉,
	比如list有2个元素{"hello123java", "11world555java"}，返回结果{"123", "11555"}
 */
public class Test12 {
	public static void main(String[] args) {
		// 1.定义ArrayList strs存放元素
		ArrayList<String> strs = new ArrayList<>();
		
		// 2.使用add方法往ArrayList中添加元素,元素包含字母和数字
		strs.add("hello123java");
		strs.add("123java");
		strs.add("hello123");
		strs.add("hello123ja45va");
		strs.add("111hel0lo123java");
		
		// 7.调用filterChars方法
		filterChars(strs);
		System.out.println(strs);
	}
	
	// 3.定义filterChars(ArrayList<String> list)方法
	public static void filterChars(ArrayList<String> list) {
		// 4.在filterChars方法中使用for循环拿出每个元素
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			// 5.替换掉字符串中所有的字母 
			String newStr = str.replaceAll("[a-zA-Z]+","");
			
			// 6.使用替换后的字符串覆盖原来的字符串
			list.set(i, newStr);
		}
	}
}