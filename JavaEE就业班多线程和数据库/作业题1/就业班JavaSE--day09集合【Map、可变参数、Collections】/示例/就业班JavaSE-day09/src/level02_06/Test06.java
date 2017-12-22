package level02_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

/*
	���ü���¼�룬����һ���ַ���,ͳ�Ƹ��ַ����и����ַ�������
	���û������ַ���:"hello world java",������������h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
	ע����������Ҫ��˳��һ��
 */
public class Test06 {
	public static void main(String[] args) {
		// 1.���������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		
		// 2.ʹ��nextLine�Ӽ����ж�ȡһ������
		String line = sc.nextLine();
		
		// 3.���ַ���ת�����ַ�����
		char[] charArray = line.toCharArray();
		
		// 4.����map���ϣ���������ַ���key���ַ� value���ַ����ֵĸ���
		Map<Character,Integer> map = new HashMap<>();
		
		// 5.�����ַ�����
		for (char c : charArray) {
			// 6.�õ�ÿ���ַ�,ȥmap�в鿴�Ƿ��б����Ӧ�Ĵ���
			Integer count = map.get(c);
			
			if (count == null) {
				// 7.�������ַ�û�б������,������Ϊ1��
				map.put(c, 1);
			} else {
				// 8.�������ַ��б������,������Ϊԭ���Ĵ���+1��
				map.put(c, count + 1);
			}
		}
		
		// 9.�����ַ�������������
		StringBuilder sb = new StringBuilder();
		
		// 10.����ĿҪ��ƴ���ַ���
		for(Entry<Character,Integer> entry : map.entrySet()) {
			sb.append(entry.getKey() + "(" + entry.getValue() + ")");
		}
		
		// 11.������
		System.out.println(sb);
	}

}