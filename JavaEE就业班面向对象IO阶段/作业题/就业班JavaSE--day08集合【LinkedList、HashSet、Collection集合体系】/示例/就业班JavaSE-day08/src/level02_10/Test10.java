package level02_10;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * 有2个ArrayList,元素如下: array1 = "a","b","a","c","d",
 * array2 = "e","f","a","d","g",将两个集合重复项去除后合并成一个集合
 * */
public class Test10 {
	public static void main(String[] args) {
		// 1.创建ArrayList array1
		ArrayList<String> array1 = new ArrayList<String>();
		// 2.使用add方法为array1存放对应的元素
		array1.add("a");
		array1.add("b");
		array1.add("a");
		array1.add("c");
		array1.add("d");
		
		// 3.创建ArrayList array2
		ArrayList<String> array2 = new ArrayList<String>();
		// 4.使用add方法为array2存放对应的元素
		array2.add("e");
		array2.add("f");
		array2.add("a");
		array2.add("d");
		array2.add("g");
		
		// 5.创建HashSet用于存放去除重复的元素
		HashSet<String> hs = new HashSet<>();
		// 方法1,简单方法
//		hs.addAll(arr1);
//		hs.addAll(arr2);
		
		// 方法2
		// 6.遍历array1,获取到每个元素,将每个元素添加到HashSet中
		for (String str : array1) {
			hs.add(str);
		}
		
		// 7.遍历array2,获取到每个元素,将每个元素添加到HashSet中
		for (String str : array2) {
			hs.add(str);
		}
		
		// 8.输出HashSet中去除重复后的元素
		System.out.println(hs);
	}
	
}