package com.itheima.test02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test02_06 {
	/*
	 * 已知数组int arr[] = {2,3,4,2,4};
 	(1)计算出该数组的平均分、最大值、最小值
 	(2)并将大于平均分的元素放到当前根目录下number.txt中(使用打印流,以追加的方式添加)
	 */
	public static void main(String[] args) throws IOException {
		// 已知数组i
		int arr[] = { 2, 3, 4, 2, 4 };
		// 计算平均分需要先算出总分
		// 统计总分
		int sum = 0;
		// 记录最大值
		int max = arr[0];
		// 记录最小值
		int min = arr[0];
		// 遍历数组
		for (int num : arr) {
			// 求和
			sum += num;
			// 如果num比max大,修改max为num
			if (max < num) {
				max = num;
			}
			// 如果min > num, 修改min为num
			if (min > num) {
				min = num;
			}
		}
		// 计算平均值
		int avg = sum / arr.length;
		System.out.println("平均值=" + avg + ",最大值=" + max + ",最小值=" + min);
		// (2)并将大于平均分的元素放到当前根目录下number.txt中(使用打印流,以追加的方式添加)
		// 创建打印流
		PrintWriter pw = new PrintWriter(new FileWriter("number.txt", true));
		// 遍历数组
		for (int num : arr) {
			if (num > avg) {
				pw.println(num);
			}
		}
		// 关闭流,释放资源
		pw.close();
	}
}
