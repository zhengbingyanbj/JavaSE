package level02_07;

import java.util.ArrayList;

/*
 * 有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
 * 创建一个ArrayList，将arr数组里面的元素添加进ArrayList中去，但ArrayList中元素不能重复 (arr数组不变)
 */
public class Test07 {

	public static void main(String[] args) {
		// 1.创建数组String arr[] = {"abc","bad","abc","aab","bad","cef","jhi"};
		String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
		
		// 2.创建ArrayList集合
		ArrayList<String> list = new ArrayList<String>();
		
		// 3.使用增强for遍历数组.拿到数组中的每个元素
		for (String str : arr) {
			// 4.使用ArrayList的contains(Object 0)方法判断ArrayList中是否包含某个元素
			if(!list.contains(str)) {
				// 5.如果ArrayList中没有这个元素才添加往数组中添加
				list.add(str);
			}
		}
		
		// 6.输出ArrayList的元素
		System.out.println(list);
	}
	

}
