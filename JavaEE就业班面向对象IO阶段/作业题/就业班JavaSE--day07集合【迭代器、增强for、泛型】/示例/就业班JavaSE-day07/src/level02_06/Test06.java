package level02_06;

/*
 * 编写一个泛形方法，接收一个任意类型数组，并将数组中的元素按照一定的格式打印."[3, 6, 7, 1, 2]"
 */
public class Test06 {

	public static void main(String[] args) {
		// 4.定义Integer数组
		Integer[] arr = {1,2,3,4,5,6};
		// 5.定义String数组
		String[] strs = {"a","b"};
		
		// 6.调用printArr打印数组
		printArr(arr);
		printArr(strs);
	}
	
	// 1.定义泛型方法printArr,接收任意类型的数组
	public static <E> void printArr(E[] arr) {
		// 2.在printArr中,打印"["
		System.out.print("[");
		
		// 3.使用for获取数组中的元素,打印 "元素, ",最后一个元素打印 "元素]"
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.print(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

}
