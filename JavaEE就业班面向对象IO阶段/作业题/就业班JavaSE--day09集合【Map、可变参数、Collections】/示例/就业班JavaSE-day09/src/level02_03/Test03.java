package level02_03;

import java.util.ArrayList;
import java.util.Arrays;

/*
	ArrayList集合中有如下内容: {11,33,55,77}.使用2种方式将集合中的数据转成数组
 */
public class Test03 {
	public static void main(String[] args) {
		// 1.定义ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();

		// 2.使用add方法添加元素{11,33,55,77}
		arr.add(10);
		arr.add(30);
		arr.add(20);
		arr.add(50);

		// 3.使用方式1转数组.toArray()
		Object[] array = arr.toArray();

		// 4.使用方式2转数组.准备空数组
		Integer[] array2 = new Integer[arr.size()];
		arr.toArray(array2);

		// 5.打印数组
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));

	}

}