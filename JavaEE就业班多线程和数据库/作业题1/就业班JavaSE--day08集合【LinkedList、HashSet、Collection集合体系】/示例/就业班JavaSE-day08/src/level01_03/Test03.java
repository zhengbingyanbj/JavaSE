package level01_03;

import java.util.LinkedList;

/*
 * ��ϰLinkedList��������: add, set, get, remove, clear, size����
 */

public class Test03 {
	public static void main(String[] args) {
		// 1.����LinkedList
		LinkedList<String> arr = new LinkedList<String>();

		// 2.ʹ��add�������Ԫ��
		arr.add("���Ŵ�ѩ");
		arr.add("���Ŵ�ѩ");
		arr.add("���Ŵ�ѩ");
		arr.add("���Ŵ���");
		arr.add("���Ŵ�ˮ");
		
		// 3.ʹ��add������ָ���������Ԫ��
		arr.add(2, "���Ŵ���");

		// 4.ʹ��set�����޸�ָ��λ������
		arr.set(0, "����");

		for (String str : arr) {
			System.out.println(str);
		}

		System.out.println("--------------");
		// 5.ʹ��get������ȡָ��������Ԫ��
		System.out.println(arr.get(1));
		
		// 6.ʹ��size������ȡ���ϴ�С
		System.out.println(arr.size());

		// 7.ʹ��remove����ɾ��ָ��������Ԫ��
		arr.remove(3);
		
		// 8.ʹ��clear��ռ����е�Ԫ��
		arr.clear();
		System.out.println(arr);
	}
}
