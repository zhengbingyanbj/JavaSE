package cn.itcast01.list;

import java.util.LinkedList;

/*
 * LinkedList 跟头尾相关的 一些方法  
 *            可以模拟 堆栈  队列 
 */
public class LinkedListDemo {
   public static void main(String[] args) {
	    LinkedList<String> link = new LinkedList<String>();
		//添加元素
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		System.out.println(link);
//		//获取元素
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
//		//删除元素
		System.out.println(link.removeFirst());
		System.out.println(link);
		System.out.println(link.removeLast());
		System.out.println(link);
//		
		while(!link.isEmpty()){ //判断集合是否为空
			System.out.println(link.pop()); //弹出集合中的栈顶元素
      }
}
}
