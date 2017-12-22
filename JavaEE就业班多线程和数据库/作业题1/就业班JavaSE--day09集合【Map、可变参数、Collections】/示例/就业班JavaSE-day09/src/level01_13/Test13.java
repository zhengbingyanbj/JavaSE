package level01_13;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ArrayList集合中有如下内容: {11,33,55,77},使用Collections.binarySearch()
 * 查询33元素在ArrayList集合中的索引是多少
 */
public class Test13 {
	public static void main(String[] args) {
		// 1.创建ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// 2.使用add方法添加{11,33,55,77}四个元素
		arr.add(11);
		arr.add(33);
		arr.add(55);
		arr.add(77);
		
		// 3.调用Collections的binarySearch方法,对ArrayList集合中的数据进行反转
		int index = Collections.binarySearch(arr, 33);
		
		// 4.输出查找到的索引
		System.out.println(index);
	}
}