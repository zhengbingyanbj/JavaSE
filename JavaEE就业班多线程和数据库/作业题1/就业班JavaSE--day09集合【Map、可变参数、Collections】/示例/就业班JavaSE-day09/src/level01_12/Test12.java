package level01_12;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList集合中有如下内容: {11,33,55,77},使用Collections.reverse()对ArrayList集合中的数据进行反转,使用增强for遍历ArrayList集合
 */
public class Test12 {
	public static void main(String[] args) {
		// 1.创建ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 2.使用add方法添加{11,33,55,77}四个元素
		arr.add(11);
		arr.add(33);
		arr.add(55);
		arr.add(77);
		
		// 3.调用Collections的reverse方法,对ArrayList集合中的数据进行反转
		Collections.reverse(arr);
		
		// 4.使用增强for遍历ArrayList集合
		for (Integer integer : arr) {
			System.out.println(integer);
		}
	}
}