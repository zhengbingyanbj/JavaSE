package level02_02;

import java.util.HashSet;

/*
 * 向HashSet集合添加姓名{张三,李四,王五,二丫,钱六,孙七},将二丫删除,添加王小丫
 */
public class Test02 {
	public static void main(String[] args) {
		// 1.创建HashSet集合
		HashSet<String> hs = new HashSet<String>();
		
		// 2.使用add方法往HashSet中添加元素
		hs.add("张三");
		hs.add("李四");
		hs.add("王五");
		hs.add("二丫");
		hs.add("钱六");
		hs.add("孙七");

		// 3.使用remove方法删除HashSet中的二丫
		hs.remove("二丫");
		
		// 4.使用add方法往HashSet中添加王小丫
		hs.add("王小丫");
		System.out.println(hs);
	}
}