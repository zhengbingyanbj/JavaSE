package level02_09;

import java.util.HashMap;
import java.util.Scanner;

/*
	键盘录入语句英语,统计每个单词出现的次数,有如下字符串:
	"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
	打印格式：
		to=3
	  	think=1
	  	you=2
		…
 */
public class Test09 {
	public static void main(String[] args) {
		// 1.创建键盘输入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串:");
		
		// 2.使用nextLine从键盘中读取一行内容
		String line = sc.nextLine();
		
		// 3.定义HashMap,key是单词,value是字符对应的次数
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 4.使用空格分割字符串
		String[] strings = line.split(" ");
		
		// 5.遍历分割好的每个字符串
		for (String str : strings) {
			// 6.获取拿到每个字符串,使用字符去HashMap中查找次数
			Integer num = hm.get(str);
			// 7.如果为空,说明该字符串第一次出现
			if (num == null) {
				// 8.放入字符串作为key,把次数设置为1
				hm.put(str, 1);
			} else {
				// 9.如果之前,已经有字符串了,就把字符的次数+1
				hm.put(str, num + 1);
			}
		}
		
		System.out.println(hm);
	}

}