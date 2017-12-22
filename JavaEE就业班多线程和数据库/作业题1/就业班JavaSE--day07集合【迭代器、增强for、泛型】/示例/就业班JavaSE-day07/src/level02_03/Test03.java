package level02_03;

import java.util.ArrayList;
import java.util.List;

/*
 * ArrayList中有如下数据:”a”, ”b”, ”c”, ”c”, ”a”, ”b”, ”b”, ”b”, ”a”.
 * 定义名为:frequency(ArrayList arr, String key)的方法.
 * arr是ArrayList集合,key是要查找的某个元素.使用增强for方式查找key在ArrayList中出现的次数.
 * 并将次数作为方法的返回值.在mian方法中调用frequency方法
 */
public class Test03 {

	public static void main(String[] args) {
		// 1.创建ArrayList
		List<String> list = new ArrayList<>();

		// 2.添加元素
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");
		list.add("d");

		// 8.在main中调用这个方法测试
		System.out.println(frequency(list, "a")); // 3
	}

	// 3.定义frequency方法统计集合中指定元素出现的次数，
	public static int frequency(List<String> list, String str) {
		// 4.在frequency方法中计数变量
		int count = 0;

		// 5.在frequency方法中使用增强for遍历传入的ArrayList集合.拿到每个元素
		for (String string : list) {
			// 6.如果遍历出来的元素是要查找的元素.计数器加1
			if (string.equals(str)) {
				count++;
			}
		}
		// 7.返回计数值
		return count;
	}

}
