package level02_10;

import java.util.ArrayList;

/*
 * 编写一个deleteElements方法，接收一个ArrayList,ArrayList中存放元素的类型不确定，
 * 在deleteElements方法的删除ArrayList中的第一个和最后一个元素
 */
public class Test10 {

	public static void main(String[] args) {
		// 4.创建ArrayList
		ArrayList<String> array = new ArrayList<>();
		
		// 5.往ArrayList添加元素
		array.add("王昭君");
		array.add("西施");
		array.add("杨玉环");
		array.add("貂蝉");
		
		// 6.调用deleteElements方法传入array
		deleteElements(array);
		
		// 7.打印array
		System.out.println(array);
	}

	// 1.定义deleteElements(ArrayList<?> array)方法
	public static void deleteElements(ArrayList<?> array) {
		// 2.在deleteElements方法中删除第一个元素
		array.remove(0);
		
		// 3.删除最后一个元素
		array.remove(array.size() - 1);
	}
}
