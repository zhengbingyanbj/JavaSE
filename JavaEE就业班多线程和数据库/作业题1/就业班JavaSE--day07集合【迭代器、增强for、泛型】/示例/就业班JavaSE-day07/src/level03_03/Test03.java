package level03_03;

/*
 * 统计101-200之间有多少个素数，并输出所有素数。素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。
 */
public class Test03 {

	public static void main(String[] args) {
		// 定义计数变量
		int count = 0;
		for (int i = 101; i <= 200; i++) {
			// 103 / 2 3 4 5 6 7 8 9 ... 102
			boolean flag = false;

			for (int j = 2; j < i; j++) {
				// 被其他数整除了
				if (i % j == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) { // 没有被其他数整除的是素数
				count++;
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		System.out.println("在101~200之间一共有素数：" + count + "个");
	}
}
