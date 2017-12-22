package level02_11;

import java.util.HashSet;
/*
 * 自定义学生类:包含姓名,年龄,成绩属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个学生放到HashSet中(姓名和年龄相同的认为是同一学生).
 * 使用迭代器获取每个学生信息.统计总分,平均分,最高分,最低分并输出
 * */
public class Test11 {
	public static void main(String[] args) {
		// 1.创建HashSet,用于存放学生
		HashSet<Student> hs = new HashSet<>();
		
		// 2.使用add方法添加5个学生
		hs.add(new Student("王昭君", 21, 99));
		hs.add(new Student("西施", 21, 88));
		hs.add(new Student("杨玉环", 20, 77));
		hs.add(new Student("貂蝉", 19, 66));
		hs.add(new Student("貂蝉", 19, 89));
		hs.add(new Student("貂蝉", 18, 89));
		
		// 3.使用迭代器获取一个学生.
		Student student = hs.iterator().next();
		
		// 4.定义总分变量
		double totalScore = 0;
		
		// 5.定义最高分变量,初始化值为迭代出来的学生的成绩
		double maxScore = student.getScore();
		
		// 6.定义最低分变量,初始化值为迭代出来的学生的成绩
		double minScore = student.getScore();
		
		// 7.使用增强for循环获取遍历HashSet,获取到每个学生
		for (Student stu : hs) {
			// 8.在增强for中将学生的分数添加到总分
			totalScore += stu.getScore();
			
			// 9.在增强for中判断最高分是否小于这个学生的分数,如果最高分小于这个学生的分数,将这个学生的分数设置为最高分
			if (maxScore < stu.getScore()) {
				maxScore = stu.getScore();
			} else if (minScore > stu.getScore()) {
				// 10.在增强for中判断最低分是否大于这个学生的分数,如果最低分大于这个学生的分数,将这个学生的分数设置为最低分
				minScore = stu.getScore();
			}
		}
		
		// 11.计算平均分(平均分 = 总分 / 人数)
		double avgScore = totalScore / hs.size();
		
		// 12.按照格式打印
		System.out.println("总分 = " + totalScore + ",平均分 = " + avgScore + ",最高分 = " + maxScore + ",最低分 = " + minScore);
	}
}