package level02_15;

import java.util.HashMap;

/*
	��2������,��һ����������Ϊ:[������ʡ,�㽭ʡ,����ʡ,�㶫ʡ,����ʡ],
	�ڶ�������Ϊ:[������,����,�ϲ�,����,����],����һ������Ԫ����Ϊkey,�ڶ�������Ԫ����Ϊvalue�洢��Map������.
	��{������ʡ=������, �㽭ʡ=����, ��}
 */
public class Test15 {
	public static void main(String[] args) {
		// 1.�����һ������arr1
		String[] arr1 = {"������ʡ", "�㽭ʡ", "����ʡ", "�㶫ʡ", "����ʡ"};
		// 2.����ڶ�������arr2
		String[] arr2 = {"������", "����", "�ϲ�", "����", "����"};
		
		// 3.����HashMap,key���ʡ,value�����
		HashMap<String, String> hm = new HashMap<>();
		
		// 4.ʹ����ͨforѭ������arr1
		for (int i = 0; i < arr1.length; i++) {
			// 5.����������arr1�л�ȡ��ʡ
			String key = arr1[i];
			// 6.����������arr2�л�ȡ��ʡ�����
			String value = arr2[i];
			
			// 7.��ʡ��ʡ�������ӵ�HashMap��
			hm.put(key, value);
		}
		
		// 8.���HashMap�е�����
		System.out.println(hm);
	}

}