package level02_07;

import java.util.ArrayList;

/*
 * ��һ������ String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
 * ����һ��ArrayList����arr���������Ԫ����ӽ�ArrayList��ȥ����ArrayList��Ԫ�ز����ظ� (arr���鲻��)
 */
public class Test07 {

	public static void main(String[] args) {
		// 1.��������String arr[] = {"abc","bad","abc","aab","bad","cef","jhi"};
		String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
		
		// 2.����ArrayList����
		ArrayList<String> list = new ArrayList<String>();
		
		// 3.ʹ����ǿfor��������.�õ������е�ÿ��Ԫ��
		for (String str : arr) {
			// 4.ʹ��ArrayList��contains(Object 0)�����ж�ArrayList���Ƿ����ĳ��Ԫ��
			if(!list.contains(str)) {
				// 5.���ArrayList��û�����Ԫ�ز���������������
				list.add(str);
			}
		}
		
		// 6.���ArrayList��Ԫ��
		System.out.println(list);
	}
	

}
