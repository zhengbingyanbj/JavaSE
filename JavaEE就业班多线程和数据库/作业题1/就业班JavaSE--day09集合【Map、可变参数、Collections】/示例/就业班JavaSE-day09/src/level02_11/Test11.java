package level02_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
	有一个Map集合里面存储了学生的名字,年龄,内容如下:{赵四=21, 王二=17, 张三=21},
		1将里面的元素使用两种遍历方式打印的控制台,
		2将赵四的年龄改为18,
		3将元素存入到student.txt中.一行保存格式:姓名,年龄
 */
public class Test11 {
	public static void main(String[] args) throws IOException {
		// 1.创建HashMap集合key存放姓名,value存放年龄
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 2.使用put添加对应的数据
		hm.put("赵四", 21);
		hm.put("王二", 17);
		hm.put("张三", 21);
		
		// 3.使用keySet遍历Map
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			Integer value = hm.get(key);
			System.out.println(key + " -- " + value);
		}
		
		// 4.使用entrySet遍历Map
		Set<Entry<String, Integer>> entrySet = hm.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " -- " + entry.getValue());
		}
		
		// 5.使用put修改赵四的年龄为18岁
		hm.put("赵四", 18);
		
		// 6.创建BufferedWriter字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("student.txt"));
		
		// 7.使用keySet遍历Map
		Set<String> keySet2 = hm.keySet();
		for (String key : keySet2) {
			// 8.根据key拿到对应的value
			Integer value = hm.get(key);
			// 9.使用字符输出流将拼接好的字符串写到文件中
			bw.write(key + " -- " + value);
			bw.newLine();
		}
		
		// 10.关闭流
		bw.close();
	}

}