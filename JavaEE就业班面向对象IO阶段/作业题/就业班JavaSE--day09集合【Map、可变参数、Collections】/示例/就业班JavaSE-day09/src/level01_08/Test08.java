package level01_08;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到map集合中。
 * 学生作为键, 家庭住址作为值, 并使用keySet和entrySet方式遍历Map集合.注意，学生姓名相同并且年龄相同视为同一名学生
 */
public class Test08 {
	public static void main(String[] args) {
		// 2.创建HashMapkey保存学生对象,value是学生家庭住址
		HashMap<Student, String> hm = new HashMap<>();

		// 3.添加一批学生到HashMap中
		Student p1 = new Student("马云", 46);
		Student p2 = new Student("马化腾", 42);
		Student p3 = new Student("马冬梅", 22);
		Student p4 = new Student("马赛克", 18);
		Student p5 = new Student("马赛克", 18);

		hm.put(p1, "杭州");
		hm.put(p2, "深圳");
		hm.put(p3, "北京");
		hm.put(p4, "东京");
		hm.put(p5, "西安");

		// 4.使用keySet方式遍历Map
		Set<Student> keySet = hm.keySet();
		for (Student p : keySet) {
			// 根据key获取value
			String value = hm.get(p);
			System.out.println(p.getName() + "," + p.getAge() + " - " + value);
		}

		System.out.println("-------------");

		// 5.使用entrySet方式遍历Map
		Set<Entry<Student, String>> entrySet = hm.entrySet();
		for (Entry<Student, String> entry : entrySet) {
			Student key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key.getName() + "," + key.getAge() + " - " + value);
		}
	}
}