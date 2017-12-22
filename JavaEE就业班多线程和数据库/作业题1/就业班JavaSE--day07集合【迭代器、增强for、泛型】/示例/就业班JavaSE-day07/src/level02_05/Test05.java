package level02_05;

/*
 * ��дһ�����η���������һ�������������飬����ת�����е�����Ԫ��
 */
public class Test05 {

	public static void main(String[] args) {
		// 3.����һ��String����,����reverse����,��ת�����е�Ԫ��
		String[] strs = {"a","b","c"};
		reverse(strs);
		
		// 4.��ӡ��ת���Ԫ��
		for (String s : strs) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 5.����һ��Integer����,����reverse����,��ת�����е�Ԫ��
		Integer[] arr = {1, 5, 3, 6, 2, 4};
		reverse(arr);
		
		// 6.��ӡ��ת���Ԫ��
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}
	
	// 1.��дһ�����η���reverse������һ����������
	public static <T> void reverse(T[] arr) {
		// 2.��reverse�����н����鴫���Ԫ�ط�ת
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}

}
