package level02_06;

/*
 * ��дһ�����η���������һ�������������飬���������е�Ԫ�ذ���һ���ĸ�ʽ��ӡ."[3, 6, 7, 1, 2]"
 */
public class Test06 {

	public static void main(String[] args) {
		// 4.����Integer����
		Integer[] arr = {1,2,3,4,5,6};
		// 5.����String����
		String[] strs = {"a","b"};
		
		// 6.����printArr��ӡ����
		printArr(arr);
		printArr(strs);
	}
	
	// 1.���巺�ͷ���printArr,�����������͵�����
	public static <E> void printArr(E[] arr) {
		// 2.��printArr��,��ӡ"["
		System.out.print("[");
		
		// 3.ʹ��for��ȡ�����е�Ԫ��,��ӡ "Ԫ��, ",���һ��Ԫ�ش�ӡ "Ԫ��]"
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
