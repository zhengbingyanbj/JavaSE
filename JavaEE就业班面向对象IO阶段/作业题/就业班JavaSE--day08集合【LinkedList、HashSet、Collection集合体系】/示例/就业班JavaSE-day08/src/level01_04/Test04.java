package level01_04;

import java.util.LinkedList;

/*
 * 练习LinkedList特有方法: addFirst, addLast, getFirst, getLast, removeFirst, removeLast方法
 */

public class Test04 {
	public static void main(String[] args) {
		// 1.创建LinkedList
		LinkedList<String> linked = new LinkedList<String>();

		// 2.使用add方法添加元素
		linked.add("刘德华");
		linked.add("张学友");
		
		// 3.使用addFirst添加元素到集合最前面
		linked.addFirst("黎明");
		
		// 4.使用addLast添加元素到集合最后面
		linked.addLast("郭富城");
		
		System.out.println(linked);
		
		// 5.使用getFirst获取集合第一个元素
		System.out.println(linked.getFirst());
		
		// 6.使用getLast获取集合最后一个元素
		System.out.println(linked.getLast());
		
		// 7.使用removeLast删除集合第一个元素
		String first = linked.removeFirst();
		System.out.println(first);
		
		// 8.使用removeLast删除集合最后一个元素
		String last = linked.removeLast();
		System.out.println(last);
		System.out.println(linked);
		
		// 9.使用clear清空集合
		linked.clear();
		System.out.println(linked);
	}
}
