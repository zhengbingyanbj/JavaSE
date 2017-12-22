package level02_07;

import java.util.HashMap;
import java.util.Scanner;

/*
	����¼��һ���ַ���,�ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ�������,������:������=1, �ո�=2, ��ĸ=12, ����=6��
 */
public class Test07 {
	public static void main(String[] args) {
		// 6.��������¼�����
		Scanner sc = new Scanner(System.in);
		
		// 7.ʹ��nextLine��ȡ�û�¼����ַ���
		System.out.println("��¼��һ���ַ���");
		String line = sc.nextLine();
		
		// 8.����һ��Map����ͳ��,��ĸ,�ո�,���ֺ������ַ�������,key���ַ�value���ַ����ֵĴ���
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// 9.��������ַ���ת���ַ�
		char[] charArray = line.toCharArray();

		// 10.�����ַ��������е�ÿһ���ַ�
		for (char ch : charArray) {
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				// 11.���ch��һ���ַ�,����countingKey��������(map, "��ĸ")��Ϊ����
				countingKey(map, "��ĸ");
			} else if (ch == ' ') {
				// 12.����ַ���һ���ո�,����countingKey��������(map, "�ո�")��Ϊ����
				countingKey(map, "�ո�");
			} else if (ch >= '0' && ch <= '9') {
				// 13.����ַ���һ������,����countingKey��������(map, "����")��Ϊ����
				countingKey(map, "����");
			} else {
				// 14.����ַ���һ������,����countingKey��������(map, "����")��Ϊ����
				countingKey(map, "����");
			}
		}
		
		// 15.��ӡͳ�ƽ��
		System.out.println(map);
	}

	// 1.����countingKey(HashMap<String, Integer> map, String key)����.����ͳ��key���ֵĴ���.����һ��,��key����Ӧ�Ĵ���+1.
	private static void countingKey(HashMap<String, Integer> map, String key) {
		// 2.��countingKey������.ʹ��get������map��ȡ��key��ֵ
		Integer num = map.get(key);
		// 3.���Ϊ��,˵��key��һ�γ���
		if (num == null) {
			// 4.����key,�Ѵ�������Ϊ1
			map.put(key, 1);
		} else {
			// 5.���֮ǰ,�Ѿ���key��,�Ͱ�key�Ĵ���+1
			map.put(key, num + 1);
		}
	}

}