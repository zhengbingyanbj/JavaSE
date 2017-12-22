package level01_05;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 往ArrayList添加以下元素” itcast”, ” itcast2”, ” itcast3”, ” itcast4”使用增强for遍历ArrayList中的元素
 */
public class Test05 {

	public static void main(String[] args) {
		// 1.创建ArrayList
		Collection<String> coll = new ArrayList<String>();
		
		// 2.往ArrayList中添加元素
		coll.add("itcast1");
		coll.add("itcast2");
		coll.add("itcast3");
		coll.add("itcast4");
		
		// 3.使用增强for循环获取元素
		for(String str : coll){ //变量Str代表被遍历到的集合元素
			System.out.println(str);
		}

	}

}
