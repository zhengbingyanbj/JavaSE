package level02_03;

import java.util.ArrayList;
import java.util.Arrays;

/*
	ArrayList����������������: {11,33,55,77}.ʹ��2�ַ�ʽ�������е�����ת������
 */
public class Test03 {
	public static void main(String[] args) {
		// 1.����ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// 2.ʹ��add�������Ԫ��{11,33,55,77}
		arr.add(10);
		arr.add(30);
		arr.add(20);
		arr.add(50);

		// 3.ʹ�÷�ʽ1ת����.toArray()
		Object[] array = arr.toArray();

		// 4.ʹ�÷�ʽ2ת����.׼��������
		Integer[] array2 = new Integer[arr.size()];
		arr.toArray(array2);

		// 5.��ӡ����
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));

	}

}