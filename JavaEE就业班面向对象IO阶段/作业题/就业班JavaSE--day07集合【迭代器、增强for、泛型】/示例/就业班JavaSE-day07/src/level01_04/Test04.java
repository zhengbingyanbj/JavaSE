package level01_04;

/*
 * 往int[]添加以下元素{11, 22, 33}使用增强for遍历数组中的元素
 */
public class Test04 {

	public static void main(String[] args) {
		// 1.创建数组
		int[] arr = new int[]{11,22,33};
		
		// 2.使用增强for循环获取数组中的元素
		for (int n : arr) {//变量n代表被遍历到的数组元素
			System.out.println(n);
		}

	}

}
