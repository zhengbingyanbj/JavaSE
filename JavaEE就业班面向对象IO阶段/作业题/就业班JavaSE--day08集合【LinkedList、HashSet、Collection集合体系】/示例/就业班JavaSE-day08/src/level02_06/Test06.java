package level02_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

/*
 *ArrayList集合有以下元素:{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明","张柏芝","刘德华"}.
 * 1.使用HashSet将重复的元素去除.2.编写一个方法:将去重后的人员写入到D:\\a.txt中.3.编写一个方法:
 * 将D:\\a.txt中所有姓张的人员信息读取出来并打印到控制台上
 * */
public class Test06 {
	public static void main(String[] args) throws IOException {
		// 1.定义ArrayList
		ArrayList<String> arr = new ArrayList<String>();
		
		// 2.使用add方法往ArrayList添加指定的内容
		arr.add("张柏芝");
		arr.add("刘德华");
		arr.add("张亮");
		arr.add("张靓颖");
		arr.add("杨颖");
		arr.add("黄晓明");
		arr.add("张柏芝");
		arr.add("刘德华");
		
		// 3.创建HashSet.将ArrayList的内容放入HashSet去除重复内容
		HashSet<String> hs = new HashSet<>(arr);
		
		// 9.调用save方法,传入去重后的名称
		save(hs);
		
		// 15.调用read方法
		read();
	}
	
	// 10.定义read()方法读取指定文件内容
	public static void read() throws IOException {
		// 11.创建BufferedReader字符输入流
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		
		System.out.println("读取到姓张的名称:");
		
		String line = null;
		// 12.读取文件中的名称
		while ((line = br.readLine()) != null) {
			// 13.判断名称是否以张开头
			if (line.startsWith("张")) {
				// 14.打印以张开头的名称
				System.out.println(line);
			}
		}
	}
	
	// 4.定义save(HashSet<String> hs)方法
	public static void save(HashSet<String> hs) throws IOException {
		// 5.在save方法中创建BufferedWriter字符输出流
		BufferedWriter bw = new BufferedWriter(new FileWriter("a.txt"));
		
		// 6.遍历获取每个名称
		for (String name : hs) {
			// 7.将名称写入指定文件中
			bw.write(name);
			bw.newLine();
		}
		
		// 8.关闭流
		bw.close();
	}
}