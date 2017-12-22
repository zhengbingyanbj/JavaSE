package level02_02;

import java.util.ArrayList;

/*
����һ������add����0�������ϵ�String��������,��������������ǽ������String���͵Ĳ�������һ��ArrayList��,
���������ArrayList����
 */
public class Test02 {
	public static void main(String[] args) {
		// 6.����add��������������ַ���
		ArrayList<String> list = add("a", "b", "d");
		
		// 7.ʹ����ǿfor�������ص�ArrayList,��ӡÿ��Ԫ��
		for (String str : list) {
			System.out.println(str);
		}
	}
	
	// 1.����add����,������(String ... str),����ֵ��ArrayList<String>
	public static ArrayList<String> add(String ... str) {
		// 2.��add�����д���ArrayList���ڴ�Ŵ�����ַ���
		ArrayList<String> array = new ArrayList<String>();
		
		// 3.ʹ����ǿforѭ����ȡÿ������
		for (String s : str) {
			// 4.��ÿ����������ӵ�ArrayList��
			array.add(s);
		}
		
		// 5.����array
		return array;
	}
}