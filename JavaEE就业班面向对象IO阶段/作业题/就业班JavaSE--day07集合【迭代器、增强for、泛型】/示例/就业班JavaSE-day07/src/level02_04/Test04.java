package level02_04;

/*
 * ��дһ�����η�������Ϊswap��ʵ��ָ��λ������Ԫ�صĽ���.�����Ҫ������������Ϊ��������
 */
public class Test04 {

	public static void main(String[] args) {
		// 3.����һ��String����,����swap����,����ָ��������Ԫ��
		String[] strs = {"a","b","c"};
		swap(strs, 0, 2);
		
		// 4.��ӡ�������Ԫ��
		for (String s : strs) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 5.����һ��Integer����,����swap����,����ָ��������Ԫ��
		Integer[] arr = {1, 8, 9, 5, 7};
		swap(arr, 0, 2);
		
		// 6.��ӡ�������Ԫ��
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}

	// 1.��дһ�����η�������������������,������2��Ҫ����λ�õ�����
	public static <T> void swap(T[] arr,int i,int j) {
		// 2.ʹ�õ����������ķ�ʽ���������е�Ԫ��
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
