package level01_06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Map集合中包含5对元素: 
 * 	"邓超"->"孙俪", "李晨"->"范冰冰", "刘德华"->"柳岩", “黄晓明”->” Baby”, “谢霆锋”->”张柏芝”.
 * 使用Entry方式迭代出Map集合中的元素
 */
public class Test06 {
	public static void main(String[] args) {
		// 1.创建HashMap
		HashMap<String, String> hm = new HashMap<String, String>();

		// 2.使用put方法添加元素
		hm.put("邓超", "孙俪");
		hm.put("李晨", "范冰冰");
		hm.put("刘德华", "柳岩");
		hm.put("黄晓明", "Baby");
		hm.put("谢霆锋", "张柏芝");

		// 3.使用entrySet方法获取到所有的键值对关系
		Set<Entry<String, String>> entrySet = hm.entrySet();

		// 4.获取entrySet的迭代器
		Iterator<Entry<String, String>> it1 = entrySet.iterator();
		// 5.使用迭代器查看是否有下一个元素
		while (it1.hasNext()) {
			// 6.使用迭代器拿到下一个元素(Entry类型)
			Map.Entry<String, String> entry = it1.next();

			// 7.通过一个Entry<K,V>获取到key和value
			System.out.println(entry.getKey() + " -" + entry.getValue());
		}
	}
}