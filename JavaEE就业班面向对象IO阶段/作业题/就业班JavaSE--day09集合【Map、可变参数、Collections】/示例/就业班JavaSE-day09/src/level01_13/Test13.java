package level01_13;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList����������������: {11,33,55,77},ʹ��Collections.binarySearch()
 * ��ѯ33Ԫ����ArrayList�����е������Ƕ���
 */
public class Test13 {
	public static void main(String[] args) {
		// 1.����ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 2.ʹ��add�������{11,33,55,77}�ĸ�Ԫ��
		arr.add(11);
		arr.add(33);
		arr.add(55);
		arr.add(77);
		
		// 3.����Collections��binarySearch����,��ArrayList�����е����ݽ��з�ת
		int index = Collections.binarySearch(arr, 33);
		
		// 4.������ҵ�������
		System.out.println(index);
	}
}