package level02_08;

import java.util.ArrayList;
import java.util.HashMap;

/*
	定义一个List集合,泛型为String类型。统计整个集合中所有字符（注意，不是字符串）的个数。
	例如:集合中有”abc”、”bcd”两个元素,程序最终输出结果为:“a = 1,b = 2,c = 2,d = 1”
 */
public class Test08 {
	public static void main(String[] args) {
		// 1.定义ArrayList存放元素
		ArrayList<String> arr = new ArrayList<String>();
		
		// 2.使用add方法添加需要的元素
		arr.add("abc");
		arr.add("bcd");
		
		// 3.定义HashMap,key是字符,value是字符对应的次数
		HashMap<Character, Integer> hm = new HashMap<>();
		
		// 4.使用增强for获取ArrayList中的每个字符串
		for (String str : arr) {
			
			// 5.将每个字符串转成字符数组
			char[] charArray = str.toCharArray();
			
			// 6.使用增强for遍历字符数组
			for (char ch : charArray) {
				// 7.获取拿到每个字符,使用字符去HashMap中查找次数
				Integer num = hm.get(ch);
				// 8.如果为空,说明该字符第一次出现
				if (num == null) {
					// 9.放入字符作为key,把次数设置为1
					hm.put(ch, 1);
				} else {
					// 10.如果之前,已经有字符了,就把字符的次数+1
					hm.put(ch, num + 1);
				}
			}
		}
		
		// 11.输出map中的内容
		System.out.println(hm);
	}

}