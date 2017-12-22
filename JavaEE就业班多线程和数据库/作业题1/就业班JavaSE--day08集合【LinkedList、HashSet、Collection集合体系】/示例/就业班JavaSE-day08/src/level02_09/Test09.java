package level02_09;

import java.util.HashSet;
import java.util.Scanner;

/*
 * 编写一个程序，键盘录入多个数字,直到录入-1结束.将录入的重复数据去除,计算这些不重复数据的总和和平均值
 * */
public class Test09 {
	public static void main(String[] args) {
		// 1.创建Scanner对象,用于键盘录入
		Scanner sc = new Scanner(System.in);
		
		// 2.创建HashSet.用于去除重复的数字
		HashSet<Integer> hs = new HashSet<>();
		
		// 3.不停循环,让用户输入数字
		while (true) {
			System.out.println("请输入一个数字");
			
			// 4.调用Scanner的nextInt()方法,让用户输入一个数字
			int num = sc.nextInt();
			
			// 5.如果用户输入-1,跳出循环
			if (num == -1) {
				break;
			}
			
			// 6.不是-1将数字添加到HashSet
			hs.add(num);
		}
		
		System.out.println(hs);
		
		// 7.定义求和变量sum
		int sum = 0;
		
		// 8.使用增强for获取HashSet中的每个元素
		for (Integer i : hs) {
			// 9.将每个数字添加到sum中
			sum += i;
		}
		
		// 10.输出求和的结果
		System.out.println("总数是: " + sum);
		
		// 11.输出平均值,平均值 = 总数 / 个数
		System.out.println("平均值是: " + sum / hs.size());
	}
}