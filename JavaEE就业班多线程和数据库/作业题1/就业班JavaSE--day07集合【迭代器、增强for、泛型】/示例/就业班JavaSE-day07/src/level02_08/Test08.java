package level02_08;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 自定义人类:包含姓名,年龄,身高属性.私有成员变量,生成无参,有参构造方法,生成get/set方法.
 * 创建5个人对象放到ArrayList中.使用迭代器获取每个人对象.将每个人的年龄加2岁.再使用增强for打印每个人的信息
 */
public class Test08 {

	public static void main(String[] args) {
		// 2.定义ArrayList
		ArrayList<Person> persons = new ArrayList<>();
		
		// 3.添加5个学生
		persons.add(new Person("张三", 20, 1.66));
		persons.add(new Person("王昭君", 21, 1.65));
		persons.add(new Person("西施", 20, 1.70));
		persons.add(new Person("杨玉环", 20, 1.72));
		persons.add(new Person("凤姐", 22, 1.80));
		
		// 4.获取迭代器
		Iterator<Person> itr = persons.iterator();
		
		// 5.循环判断是否有下一个人
		while (itr.hasNext()) {
			// 6.使用next方法获取学生对象
			Person p = itr.next();
			
			// 7.将学生的年龄加2岁,在使用setAge方法设置回去
			p.setAge(p.getAge() + 2);
		}
		
		// 8.使用增强for获取每个学生,打印每个学生的信息
		for (Person p : persons) {
			System.out.println(p.getName() + " 的身高是 " + p.getAge());
		}
	}

}
