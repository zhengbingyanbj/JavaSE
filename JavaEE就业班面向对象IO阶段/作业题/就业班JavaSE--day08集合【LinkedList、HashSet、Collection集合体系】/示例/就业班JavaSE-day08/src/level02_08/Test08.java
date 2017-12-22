package level02_08;

import java.util.LinkedHashSet;
import java.util.Scanner;

/*
 * ����¼��һ���ַ���.ȥ�������ظ��ַ�, ��ӡ����ͬ����Щ�ַ�.���뱣֤˳��.��������: aaaabbbcccddd,��ӡ���Ϊ: abcd
 * */
public class Test08 {
	public static void main(String[] args) {
		// 1.����Scanner����,���ڼ���¼��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ���");
		
		// 2.����Scanner��nextLine()����,���û�����һ���ַ���
		String line = sc.nextLine();
		
		// 3.����LinkedHashSet.����ȥ���ظ����ַ���,����֤����˳��
		LinkedHashSet<Character> chs = new LinkedHashSet<>();
		
		// 4.���ַ�����ת��char[]
		char[] charArray = line.toCharArray();
		
		// 5.ʹ����ǿforѭ������ÿ���ַ�
		for (char c : charArray) {
			// 6.��ÿ���ַ���ӵ�LinkedHashSet��
			chs.add(c);
		}
		
		// 7.ʹ����ǿfor��ӡLinkedHashSet�е�����
		for (char c : chs) {
			System.out.print(c);
		}
	}
}