package cn.itcast01.list;

import java.util.LinkedList;

/*
 * LinkedList ��ͷβ��ص� һЩ����  
 *            ����ģ�� ��ջ  ���� 
 */
public class LinkedListDemo {
   public static void main(String[] args) {
	    LinkedList<String> link = new LinkedList<String>();
		//���Ԫ��
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		System.out.println(link);
//		//��ȡԪ��
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
//		//ɾ��Ԫ��
		System.out.println(link.removeFirst());
		System.out.println(link);
		System.out.println(link.removeLast());
		System.out.println(link);
//		
		while(!link.isEmpty()){ //�жϼ����Ƿ�Ϊ��
			System.out.println(link.pop()); //���������е�ջ��Ԫ��
      }
}
}
