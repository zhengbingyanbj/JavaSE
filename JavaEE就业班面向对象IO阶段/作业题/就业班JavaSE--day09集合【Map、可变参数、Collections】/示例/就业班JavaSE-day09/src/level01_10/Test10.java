package level01_10;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList����������������: {33,11,77,55},ʹ��Collections.sort()��ArrayList�����е����ݽ�������
 */
public class Test10 {
	public static void main(String[] args) {
		// 1.����ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 2.ʹ��add�������{33,11,77,55}�ĸ�Ԫ��
		arr.add(33);
		arr.add(11);
		arr.add(77);
		arr.add(55);
		
		// 3.����Collections��sort����,�Լ�������
		Collections.sort(arr);
		
		// 4.ʹ����ǿfor����ArrayList����
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}