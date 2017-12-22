package level02_10;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/*
	通过键盘录入五个人的姓名,每当录入一个人的姓名,随机给出一个成绩[0, 100](包含0分,也包含100分).
	将姓名和成绩存储到Map集合中,姓名作为key,成绩作为value.统计五个学生的总分,最高分,最低分,平均分,
	并将总分,最高分,最低分,平均分,写入到score.txt文件中,格式为:最高分=xxx,最低分=xxx,平均分=xxx
 */
public class Test10 {
	public static void main(String[] args) throws IOException {
		// 1.创建键盘输入对象
		Scanner sc = new Scanner(System.in);
		
		// 2.创建随机数对象
		Random ran = new Random();
		
		// 3.创建HashMap集合key存放姓名,value存放成绩
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 4.循环判断HashMap中数量是否小于5
		while (hm.size() < 5) {
			System.out.println("请输入一个学生的姓名:");
			
			// 5.如果HashMap中数量小于5,让用户再输入一个姓名
			String name = sc.next();
			
			// 6.使用随机数生成一个成绩
			int score = ran.nextInt(101);
			
			// 7.将姓名和分数添加到HashMap中
			hm.put(name, score);
		}
		
		// 8.使用迭代器获取一个键
		String k = hm.keySet().iterator().next();
		// 9.通过键找到对应的分数,作为默认分数
		Integer defaultScore = hm.get(k);
		
		// 10.定义总分分变量
		int totalScore = 0;
		
		// 11.定义最高分变量=默认分数
		int maxScore = defaultScore;
		
		// 12.定义最低分变量=默认分数
		int minScore = defaultScore;
		
		// 13.使用keySet获取到所有的key
		Set<String> keySet = hm.keySet();
		
		// 14.使用增强for遍历所有的key
		for (String key : keySet) {
			// 15.根据key找到对应的value
			Integer value = hm.get(key);
			
			// 16.将这个分数添加到总分
			totalScore += value;
			
			// 17.如果最高分小于这个分数,让最高分=这个分数
			if (maxScore < value) {
				maxScore = value;
			} else if (minScore > value) {
				// 18.如果最低分大于这个分数,让最低分=这个分数
				minScore = value;
			}
		}
		
		// 19.计算平均分
		int avg = totalScore / hm.size();
		
		// 20.定义StringBuilder,用于拼接,总分,最高分,最低分,平均分字符串
		StringBuilder sb = new StringBuilder();
		sb.append("总分=").append(totalScore).append(",最高分=").append(maxScore).append(",最低分=").append(minScore).append(",平均分=").append(avg);
		
		// 21.创建FileWriter字符输出流
		FileWriter fw = new FileWriter("score.txt");
		
		// 22.使用字符输出流将拼接好的字符串写到文件中
		fw.write(sb.toString());
		
		// 23.关闭流
		fw.close();
	}

}