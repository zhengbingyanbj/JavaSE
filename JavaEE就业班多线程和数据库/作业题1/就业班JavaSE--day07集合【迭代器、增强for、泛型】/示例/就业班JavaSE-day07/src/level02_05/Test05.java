package level02_05;

/*
 * 编写一个泛形方法，接收一个任意类型数组，并反转数组中的所有元素
 */
public class Test05 {

	public static void main(String[] args) {
		// 3.定义一个String数组,调用reverse方法,反转数组中的元素
		String[] strs = {"a","b","c"};
		reverse(strs);
		
		// 4.打印反转后的元素
		for (String s : strs) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// 5.定义一个Integer数组,调用reverse方法,反转数组中的元素
		Integer[] arr = {1, 5, 3, 6, 2, 4};
		reverse(arr);
		
		// 6.打印反转后的元素
		for (Integer i : arr) {
			System.out.print(i + " ");
		}
	}
	
	// 1.编写一个泛形方法reverse，接收一个任意数组
	public static <T> void reverse(T[] arr) {
		// 2.在reverse方法中将数组传入的元素反转
		for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
			T temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
	}

}
