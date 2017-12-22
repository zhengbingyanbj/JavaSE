package level02_02;

import java.util.ArrayList;

/*
定义一个方法add接收0个及以上的String类型数据,这个方法的作用是将传入的String类型的参数放入一个ArrayList中,
并返回这个ArrayList集合
 */
public class Test02 {
	public static void main(String[] args) {
		// 6.调用add方法传入任意个字符串
		ArrayList<String> list = add("a", "b", "d");
		
		// 7.使用增强for遍历返回的ArrayList,打印每个元素
		for (String str : list) {
			System.out.println(str);
		}
	}
	
	// 1.定义add方法,参数是(String ... str),返回值是ArrayList<String>
	public static ArrayList<String> add(String ... str) {
		// 2.在add方法中创建ArrayList用于存放传入的字符串
		ArrayList<String> array = new ArrayList<String>();
		
		// 3.使用增强for循环获取每个参数
		for (String s : str) {
			// 4.将每个参数都添加到ArrayList中
			array.add(s);
		}
		
		// 5.返回array
		return array;
	}
}