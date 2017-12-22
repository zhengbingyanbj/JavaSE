package level02_12;

import java.util.ArrayList;

/*
	����һ������filterChars(ArrayList<String> list)�������ArrayList<String>�����е�ÿ��Ԫ���е���ĸ���˵�,
	����list��2��Ԫ��{"hello123java", "11world555java"}�����ؽ��{"123", "11555"}
 */
public class Test12 {
	public static void main(String[] args) {
		// 1.����ArrayList strs���Ԫ��
		ArrayList<String> strs = new ArrayList<>();
		
		// 2.ʹ��add������ArrayList�����Ԫ��,Ԫ�ذ�����ĸ������
		strs.add("hello123java");
		strs.add("123java");
		strs.add("hello123");
		strs.add("hello123ja45va");
		strs.add("111hel0lo123java");
		
		// 7.����filterChars����
		filterChars(strs);
		System.out.println(strs);
	}
	
	// 3.����filterChars(ArrayList<String> list)����
	public static void filterChars(ArrayList<String> list) {
		// 4.��filterChars������ʹ��forѭ���ó�ÿ��Ԫ��
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			// 5.�滻���ַ��������е���ĸ 
			String newStr = str.replaceAll("[a-zA-Z]+","");
			
			// 6.ʹ���滻����ַ�������ԭ�����ַ���
			list.set(i, newStr);
		}
	}
}