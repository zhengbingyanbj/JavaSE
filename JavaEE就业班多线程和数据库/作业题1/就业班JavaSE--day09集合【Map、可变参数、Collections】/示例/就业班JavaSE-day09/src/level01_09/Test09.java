package level01_09;

/*
 * 定义一个方法add接收0个及以上的int类型数据,这个方法的作用是将传入的int类型的值进行相加,并返回相加后的结果
 */
public class Test09 {
	public static void main(String[] args) {
		// 6.调用add方法传入任意个int类型的参数
		add(1);
		add(1, 2);
		add(1, 3, 5);
	}

	// 1.定义add方法.参数是可变参数(int... arr)
	public static int add(int... arr) {
		// 2.在add方法定义求和变量sum
		int sum = 0;
		
		// 3.使用增强for获取每个参数
		for (int i : arr) {
			// 4.将每个参数都加到求和变量sum中
			sum += i;
		}
		// 5.返回sum
		return sum;
	}

}