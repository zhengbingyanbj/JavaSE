package level03_04;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/*
	有四种水果(苹果，香蕉，西瓜，橘子)
	 1、给每种水果设定一个商品号，商品号是8个0-9的随机数，商品号码不能重复, 最小值 "00000001", 最大值 "99999999"
	 2、根据商品号查询对应的商品。
	如果查不到输出：“查无此商品”
	如果能查到打印：”根据商品号：12345678，查询到对应的商品为：西瓜”
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		// 1.定义四种水果数组
		String[] fruit = { "苹果", "香蕉", "西瓜", "橘子" };

		// 2.创建随机数对象
		Random ran = new Random();

		// 3.创建HashSet保存4个不相同的商品号
		HashSet<String> ids = new HashSet<>();
		
		// 4.循环判断HashSet是否小于4.
		while (ids.size() < 4) {
			// 5.产生一个商品编号,是8个0-9的数
			String id = "";
			for (int i = 0; i < 8; i++) {
				id += ran.nextInt(10);
			}

			// 6.添加到HashSet中
			ids.add(id);
		}

		// 7.定义HashMap,存放商品id和商品名称
		HashMap<String, String> hm = new HashMap<>();

		// 8.遍历ids,拿到每个商品id,再去找一个对应的商品名称,存储到HashMap中
		int index = 0;
		for (String id : ids) {
			// 找到一个对应的商品
			String product = fruit[index];
			hm.put(id, product);

			index++;
		}

		System.out.println(hm);

		// 9.让用户输入要查询的商品id
		System.out.println("请输入要查询商品的id:");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();

		// 10.根据id去map中查找对应的商品
		String product = hm.get(id);
		if (product == null) {
			// 11.没有找到商品打印:查无此商品
			System.out.println("查无此商品");
		} else {
			// 12.找到商品打印对应商品的信息
			System.out.println("根据商品号：" + id + "，查询到对应的商品为：" + product);
		}
	}

}