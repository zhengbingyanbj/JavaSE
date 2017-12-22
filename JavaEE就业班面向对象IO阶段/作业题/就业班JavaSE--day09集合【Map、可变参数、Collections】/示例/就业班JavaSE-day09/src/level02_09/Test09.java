package level02_09;

import java.util.HashMap;
import java.util.Scanner;

/*
	����¼�����Ӣ��,ͳ��ÿ�����ʳ��ֵĴ���,�������ַ���:
	"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
	��ӡ��ʽ��
		to=3
	  	think=1
	  	you=2
		��
 */
public class Test09 {
	public static void main(String[] args) {
		// 1.���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		
		// 2.ʹ��nextLine�Ӽ����ж�ȡһ������
		String line = sc.nextLine();
		
		// 3.����HashMap,key�ǵ���,value���ַ���Ӧ�Ĵ���
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 4.ʹ�ÿո�ָ��ַ���
		String[] strings = line.split(" ");
		
		// 5.�����ָ�õ�ÿ���ַ���
		for (String str : strings) {
			// 6.��ȡ�õ�ÿ���ַ���,ʹ���ַ�ȥHashMap�в��Ҵ���
			Integer num = hm.get(str);
			// 7.���Ϊ��,˵�����ַ�����һ�γ���
			if (num == null) {
				// 8.�����ַ�����Ϊkey,�Ѵ�������Ϊ1
				hm.put(str, 1);
			} else {
				// 9.���֮ǰ,�Ѿ����ַ�����,�Ͱ��ַ��Ĵ���+1
				hm.put(str, num + 1);
			}
		}
		
		System.out.println(hm);
	}

}