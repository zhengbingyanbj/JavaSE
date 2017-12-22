package level01_06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 往ArrayList添加以下元素” abc”, ” itcast”,练习ArrayList不加泛型和加泛型2种情况迭代出ArrayList中的元素.
 * 并说出泛型的好处
 * 
 * 使用迭代器的好处:
 * 	集合明确具体存放的元素类型，那么在使用迭代器的时候，迭代器也同样会知道具体遍历元素类型,存放类型不一致就会编译报错,避免了类型强转的麻烦.
 */
public class Test06 {

	public static void main(String[] args) {
//		method01();
		method02();
	}

	private static void method02() {
		// 1.定义有泛型的ArrayList
		Collection<String> list = new ArrayList<String>();
		// 2.添加字符串
		list.add("abc");
		list.add("itcast");
		// 3.添加Integer类型
		// list.add(5); // 当集合明确类型后，存放类型不一致就会编译报错
		// 4.获取迭代器
		Iterator<String> it = list.iterator();
		// 5.判断是否有下一个元素
		while (it.hasNext()) {
			// 6.获取下一个元素,元素是String类型
			String str = it.next();
			
			// 7.获取字符串的长度
			System.out.println(str.length());
		}
	}

	private static void method01() {
		// 1.定义没有泛型的ArrayList
		Collection list = new ArrayList<String>();
		// 2.添加字符串
		list.add("abc");
		list.add("itcast");
		// 3.添加Integer类型
		list.add(5); // 没有泛型,任意类型都能放入
		
		// 4.获取迭代器
		Iterator it = list.iterator();
		
		// 5.判断是否有下一个元素
		while (it.hasNext()) {
			// 6.获取下一个元素,并强转为String类型
			String str = (String)it.next();
			
			// 7.获取字符串的长度
			System.out.println(str.length());
		}
	}

}
