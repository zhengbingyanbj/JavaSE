package level02_08;

import java.util.ArrayList;
import java.util.HashMap;

/*
	����һ��List����,����ΪString���͡�ͳ�����������������ַ���ע�⣬�����ַ������ĸ�����
	����:�������С�abc������bcd������Ԫ��,��������������Ϊ:��a = 1,b = 2,c = 2,d = 1��
 */
public class Test08 {
	public static void main(String[] args) {
		// 1.����ArrayList���Ԫ��
		ArrayList<String> arr = new ArrayList<String>();
		
		// 2.ʹ��add���������Ҫ��Ԫ��
		arr.add("abc");
		arr.add("bcd");
		
		// 3.����HashMap,key���ַ�,value���ַ���Ӧ�Ĵ���
		HashMap<Character, Integer> hm = new HashMap<>();
		
		// 4.ʹ����ǿfor��ȡArrayList�е�ÿ���ַ���
		for (String str : arr) {
			
			// 5.��ÿ���ַ���ת���ַ�����
			char[] charArray = str.toCharArray();
			
			// 6.ʹ����ǿfor�����ַ�����
			for (char ch : charArray) {
				// 7.��ȡ�õ�ÿ���ַ�,ʹ���ַ�ȥHashMap�в��Ҵ���
				Integer num = hm.get(ch);
				// 8.���Ϊ��,˵�����ַ���һ�γ���
				if (num == null) {
					// 9.�����ַ���Ϊkey,�Ѵ�������Ϊ1
					hm.put(ch, 1);
				} else {
					// 10.���֮ǰ,�Ѿ����ַ���,�Ͱ��ַ��Ĵ���+1
					hm.put(ch, num + 1);
				}
			}
		}
		
		// 11.���map�е�����
		System.out.println(hm);
	}

}