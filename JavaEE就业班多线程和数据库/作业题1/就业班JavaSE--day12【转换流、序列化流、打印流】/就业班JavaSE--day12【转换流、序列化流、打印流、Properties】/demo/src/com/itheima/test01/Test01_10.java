package com.itheima.test01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Test01_10 {

	/*
	 * 定义一个集合用户存放多个字符串，利用打印流将集合中的字符串输出到当前项目根目录下的array.txt文件中，要求一个字符串占据一行。
	 */
	public static void main(String[] args) throws IOException{
		// 创建集合存放字符串
		ArrayList<String> strs = new ArrayList<String>();
		// 添加多个字符串
		strs.add("zhangsan");
		strs.add("lisi");
		strs.add("wangwu");
		
		// 创建打印流对象
		PrintWriter pw = new PrintWriter(new FileOutputStream("array.txt"), true);
		// 遍历集合，将集合元素输出到文件中
		for (String str : strs) {
			pw.println(str);
		}
		// 关闭流释放资源
		pw.close();
	}
	
}
