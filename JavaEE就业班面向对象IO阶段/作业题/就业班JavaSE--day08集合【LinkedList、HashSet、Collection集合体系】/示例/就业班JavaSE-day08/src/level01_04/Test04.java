package level01_04;

import java.util.LinkedList;

/*
 * ��ϰLinkedList���з���: addFirst, addLast, getFirst, getLast, removeFirst, removeLast����
 */

public class Test04 {
	public static void main(String[] args) {
		// 1.����LinkedList
		LinkedList<String> linked = new LinkedList<String>();

		// 2.ʹ��add�������Ԫ��
		linked.add("���»�");
		linked.add("��ѧ��");
		
		// 3.ʹ��addFirst���Ԫ�ص�������ǰ��
		linked.addFirst("����");
		
		// 4.ʹ��addLast���Ԫ�ص����������
		linked.addLast("������");
		
		System.out.println(linked);
		
		// 5.ʹ��getFirst��ȡ���ϵ�һ��Ԫ��
		System.out.println(linked.getFirst());
		
		// 6.ʹ��getLast��ȡ�������һ��Ԫ��
		System.out.println(linked.getLast());
		
		// 7.ʹ��removeLastɾ�����ϵ�һ��Ԫ��
		String first = linked.removeFirst();
		System.out.println(first);
		
		// 8.ʹ��removeLastɾ���������һ��Ԫ��
		String last = linked.removeLast();
		System.out.println(last);
		System.out.println(linked);
		
		// 9.ʹ��clear��ռ���
		linked.clear();
		System.out.println(linked);
	}
}
