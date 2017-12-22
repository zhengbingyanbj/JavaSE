package com.itheima.test02;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

public class Test02_06 {
	/*
	 * 使用集合存储10个1-50(含50)的随机偶数元素,要求数字不能重复,按指定格式输出到C盘的num.txt中,例如: 48,44,40,38,34,30,26...... 
	 */
	public static void main(String[] args) throws IOException {
		// 1.创建集合对象HashSet
		HashSet<Integer> set = new HashSet<Integer>();
		// 2.创建随机数对象Random
		Random r = new Random();
		// 3.使用循环随机生成10个1-50(含50)的偶数
		while(set.size() < 10) {
			// 4.随机生成一个整数
			int num = r.nextInt(50) + 1;
			// 5.判断是否偶数
			if(num % 2 == 0) {
				// 6.将生成的偶数添加到集合中
				set.add(num);
			}
		}
		// 将集中的元素按指定格式拼接成字符串
		StringBuilder sb = new StringBuilder();
		for (Integer num : set) {
			sb.append(num).append(",");
		}
		// 删除最后一个分号
		sb.deleteCharAt(sb.length() - 1);
		// 创建高效流关联目标文件，
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/num.txt"));
		bos.write(sb.toString().getBytes());
		// 关闭流释放资源
		bos.close();
	}
	
}
