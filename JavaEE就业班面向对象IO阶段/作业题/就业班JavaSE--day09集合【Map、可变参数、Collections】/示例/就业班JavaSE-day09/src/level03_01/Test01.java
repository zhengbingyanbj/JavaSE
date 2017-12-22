package level03_01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/*
	Map中有{张三=3,李四=4,王五=5,赵六=6,孙七=7,田七=7,周八=5}这些元素.
	将Map中value相同的元素从Map中去除.再将Map中剩余元素的key存放到一个ArrayLis中,并打印到控制台上
 */
public class Test01 {
	public static void main(String[] args) throws IOException {
		// 1.创建HashMap集合key存放姓名,value存放年龄
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 2.使用put方法添加对应的元素
		hm.put("张三", 3);
		hm.put("李四", 4);
		hm.put("王五", 5);
		hm.put("赵六", 6);
		hm.put("孙七", 7);
		hm.put("田七", 7);
		hm.put("周八", 5);
		
		// 3.定义一个ArrayList存放重复的值
		ArrayList<Integer> repeatValues = new ArrayList<>();
		
		// 4.拿到所有的键放到ArrayList中
		ArrayList<Integer> values = new ArrayList<>(hm.values());
		
		// 5.遍历所有的值
		for (int i = 0; i < values.size(); i++) {
			// 6.拿到一个值
			Integer value = values.get(i);
			
			// 7.和后面的那些值比较,看是否有重复的
			for (int j = i + 1; j < values.size(); j++) {
				
				Integer v2 = values.get(j);
				// 8.和后面的比较相同,说明重复
				if (value == v2) {
					// 9.将重复的值放入repeatValues中
					repeatValues.add(value);
				}
			}
		}
		
		System.out.println(repeatValues);
		
		// 10.定义一个ArrayList存放值相同的键.因为只能拿键去删除
		ArrayList<String> repeatKeys = new ArrayList<>();
		
		// 11.使用keySet遍历HashSet
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Integer value = hm.get(key);
			
			// 12.如果值是重复的,那么将这个件放入repeatKeys中
			if (repeatValues.contains(value)) {
				repeatKeys.add(key);
			}
		}
		System.out.println(repeatKeys);
		
		// 13.遍历重复的键,通过键去HashMap中删除元素
		for (String key : repeatKeys) {
			hm.remove(key);
		}
		
		// 14.输出删除后的HashMap
		System.out.println(hm);
	}

}