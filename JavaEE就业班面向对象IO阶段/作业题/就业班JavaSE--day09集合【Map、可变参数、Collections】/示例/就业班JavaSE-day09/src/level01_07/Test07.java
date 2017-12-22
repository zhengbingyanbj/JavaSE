package level01_07;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 每位学生（姓名，年龄）都有自己的家庭住址。那么，既然有对应关系，则将学生对象和家庭住址存储到Map集合中。
 * 家庭住址作为键, 学生作为值。并使用keySet和entrySet方式遍历Map集合
 */
public class Test07 {
	public static void main(String[] args) {
		// 2.创建HashMapkey保存学生家庭住址,value是学生对象
		HashMap<String, Student> hm = new HashMap<String, Student>();

		// 3.添加一批学生到HashMap中
		Student p1 = new Student("马云", 46);
		Student p2 = new Student("马化腾", 42);
		Student p3 = new Student("马冬梅", 22);
		Student p4 = new Student("马赛克", 18);

		hm.put("杭州", p1);
		hm.put("深圳", p2);
		hm.put("北京", p3);
		hm.put("东京", p4);

		// 4.使用keySet方式遍历Map
		for (String key : hm.keySet()) {
			// 5.通过key获取value
			Student p = hm.get(key);
			System.out.println(key + " -  " + p.getName() + "," + p.getAge());
		}

		System.out.println("----------------------");
		// 6.使用entrySet方式遍历Map
		Set<Entry<String, Student>> entrySet = hm.entrySet();
		for (Entry<String, Student> entry : entrySet) {
			Student p = entry.getValue();
			System.out.println(entry.getKey() + " - " + p.getName() + "," + p.getAge());
		}

	}
}