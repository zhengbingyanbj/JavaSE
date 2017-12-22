package level02_12;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
	使用键盘循环录入:书名,价格.创建一个Map集合,key存储书名,value存储书的价格. 录入以下5本书数据:{Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2} 要求;
		1.删除集合中的C++这本书
		2.Java的这本书涨价为38.5元 
		3.使用keySet和entrySet两种不同方式对集合遍历输出
 */
public class Test12 {
	public static void main(String[] args) throws IOException {
		// 1.创建HashMap集合key存放姓名,value存放年龄
		HashMap<String, Double> hm = new HashMap<>();
		
		// 2.创建键盘录入对象Scanner
		Scanner sc = new Scanner(System.in);
		
		// 3.循环判断HashSet的数量是否小于5
		while (hm.size() < 5) {
			// 4.如果HashSet的数量小于5,让用户输入一本书的信息
			System.out.println("请录入一本书(书名,价格):");
			String line = sc.nextLine();
			
			// 5.使用,分割书名和价格
			String[] strings = line.split(",");
			
			// 6.将书名和价格添加到HashMap中
			hm.put(strings[0], Double.valueOf(strings[1]));
		}
		
		// 7.使用remove方法删除集合中的C++这本书
		hm.remove("C++");
		
		// 8.使用put方法将Java的这本书涨价为38.5元 
		hm.put("Java", 38.5);
		
		// 9.使用keySet遍历Map
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Double value = hm.get(key);
			System.out.println(key + " -- " + value);
		}
		
		// 10.使用entrySet遍历Map
		Set<Entry<String, Double>> entrySet = hm.entrySet();
		for (Entry<String, Double> entry : entrySet) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
	}

}