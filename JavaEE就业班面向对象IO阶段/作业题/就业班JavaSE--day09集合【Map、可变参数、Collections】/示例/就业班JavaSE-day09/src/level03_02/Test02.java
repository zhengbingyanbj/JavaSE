package level03_02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/*
	传智博客
		Java基础班
			001	李晨
			002	范冰冰
		Java就业班
			001	马云
			002	马化腾
	使用HashMap嵌套HashMap方式完成,1使用keySet和增强for遍历出里面的元素,2使用entrySet和迭代器遍历出里面的元素

 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		// 1.定义Java基础班的HashMap<String, String>
		HashMap<String, String> JavaSEMap = new HashMap<String, String>();
		// 2.存放2个学生到Java基础班的Map
		JavaSEMap.put("001", "李晨");
		JavaSEMap.put("002", "范冰冰");

		// 3.定义Java就业班的HashMap<String, String>
		HashMap<String, String> JavaEEMap = new HashMap<>();
		// 4.存放2个学生到Java就业班的Map
		JavaEEMap.put("001", "马云");
		JavaEEMap.put("002", "马化腾");

		// 5.定义传智播客集合HashMap<String, HashMap<String, String>>
		HashMap<String, HashMap<String, String>> czbkMap = new HashMap<>();
		// 6.将Java基础班和Java就业班存放到传智播客HashMap集合中
		czbkMap.put("Java基础班", JavaSEMap);
		czbkMap.put("Java就业班", JavaEEMap);

		// 7.使用keySet和增强for遍历出里面的元素
		// 7.1使用keySet获取传智播客集合的所有key
		Set<String> keySet = czbkMap.keySet(); // "Java基础班", "Java就业班"
		// 7.2使用增强for获取传智播客集合每个key
		for (String czbkKey : keySet) {
			System.out.println(czbkKey);
			// 7.3通过key找value,value是Java基础班的HashMap和Java就业班的HashMap
			HashMap<String, String> classMap = czbkMap.get(czbkKey);

			// 7.4拿到班级的HashMap所有key
			Set<String> classKeys = classMap.keySet();
			// 7.5遍历班级的每个key(学号)
			for (String key : classKeys) {
				// 7.6根据班级的key(学号)去找value(姓名)
				String value = classMap.get(key);
				System.out.println("\t" + key + " -- " + value);
			}
		}
		
		System.out.println("-------------------");
		
		// 8.使用entrySet和迭代器遍历出里面的元素
		// 8.1使用entrySet获取传智播客集合的所有Entry
		Set<Entry<String, HashMap<String, String>>> entrySet = czbkMap.entrySet();
		// 8.2拿到传智播客集合的所有Entry的迭代器
		Iterator<Entry<String, HashMap<String, String>>> czbkItr = entrySet.iterator();
		// 8.3循环判断传智播客所有Entry的迭代器是否有下一个元素
		while (czbkItr.hasNext()) {
			// 8.4通过传智播客所有Entry的迭代器获取一个Entry
			Entry<String, HashMap<String, String>> czbkEntry = czbkItr.next();
			// 8.5输出Entry的key(班级名称)
			System.out.println(czbkEntry.getKey());
			
			// 8.6获取Entry的value(某个班级Map集合)
			HashMap<String, String> classMap = czbkEntry.getValue();
			
			// 8.7获取班级Map的所有Entry
			Set<Entry<String, String>> classEntry = classMap.entrySet();
			// 8.8拿到班级Map的所有Entry的迭代器
			Iterator<Entry<String, String>> classItr = classEntry.iterator();
			// 8.9循环判班级Map的所有Entry的迭代器是否有下一个元素
			while (classItr.hasNext()) {
				// 8.10 使用班级Map的所有Entry的迭代器拿出一个Entry
				Entry<String, String> entry = classItr.next();
				// 8.11按格式输出entry的key和entry的value
				System.out.println("\t" + entry.getKey() + " -- " + entry.getValue());
			}
		}
	}

}