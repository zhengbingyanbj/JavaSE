package level02_13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;

/*
	Map中有{张三=23,李四=24,王五=15,赵六=36,孙七=17,田七=57,周八=35}
	这些元素key为姓名value为年龄.将周八的年龄修改为22,并将年龄小于30岁人的信息写入到perosn.txt中,
	person.txt每行数据格式为:姓名=年龄
 */
public class Test13 {
	public static void main(String[] args) throws IOException {
		// 1.创建HashMap集合key存放姓名,value存放年龄
		HashMap<String, Integer> hm = new HashMap<>();

		// 2.使用put方法添加对应的元素
		hm.put("张三", 23);
		hm.put("李四", 24);
		hm.put("王五", 15);
		hm.put("赵六", 36);
		hm.put("孙七", 17);
		hm.put("田七", 57);
		hm.put("周八", 35);
		
		// 3.使用put将周八的年龄修改为22
		hm.put("周八", 22);
		
		// 4.创建BufferedWriter字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("person.txt"));
		
		// 5.使用keySet遍历HashMap集合
		Set<String> keySet = hm.keySet();
		for (String key : keySet) {
			// 6.根据key获取到对应的value
			Integer age = hm.get(key);
			if(age  < 30){
				// 7.将key和value按格式拼接好写入到person.txt文件中
				bw.write(key + "=" + age);
				bw.newLine();
			}
		
		}
		
		// 8.关闭流
		bw.close();
	}

}