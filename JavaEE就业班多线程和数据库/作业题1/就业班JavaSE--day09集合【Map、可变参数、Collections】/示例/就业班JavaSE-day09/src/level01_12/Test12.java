package level01_12;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList����������������: {11,33,55,77},ʹ��Collections.reverse()��ArrayList�����е����ݽ��з�ת,ʹ����ǿfor����ArrayList����
 */
public class Test12 {
	public static void main(String[] args) {
		// 1.����ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 2.ʹ��add�������{11,33,55,77}�ĸ�Ԫ��
		arr.add(11);
		arr.add(33);
		arr.add(55);
		arr.add(77);
		
		// 3.����Collections��reverse����,��ArrayList�����е����ݽ��з�ת
		Collections.reverse(arr);
		
		// 4.ʹ����ǿfor����ArrayList����
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}