package level01_11;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList����������������: {11,33,55,77},ʹ��Collections.shuffle()��ArrayList�����е����ݽ����������˳��
 */
public class Test11 {
	public static void main(String[] args) {
		// 1.����ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 2.ʹ��add�������{11,33,55,77}�ĸ�Ԫ��
		arr.add(11);
		arr.add(33);
		arr.add(55);
		arr.add(77);
		
		// 3.����Collections��shuffle����,�Լ����е�Ԫ�ش���˳��
		Collections.sort(arr);
		
		// 4.ʹ����ǿfor����ArrayList����
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}