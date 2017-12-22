package level03_02;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 一个学科中有若干班级，每一个班级又有若干学生。整个学科一个大集合，若干个班级分为每一个小集合(集合嵌套之HashSet嵌套HashSet)。要求如下
	1、 学生类有两个属性，姓名和年龄，并定义有参构造、无参构造和getter/setter方法.姓名和年龄相同的视为同一学生
	2、向班级集合中添加若干个学生（至少两个学生）。
	2、向学科集合中添加所有班级(至少创建两个班级)。
	3、使用两种方法遍历学科集合，并打印出所有学生。
 * */
public class Test02 {
	public static void main(String[] args) {
		// 1.创建HashSet作为一个班级集合储存学生
		HashSet<Student> class1 = new HashSet<Student>();
		class1.add(new Student("zhangsan", 20));
		class1.add(new Student("lisi", 25));
		class1.add(new Student("lisi", 25));

		// 创建HashSet作为一个班级集合储存学生
		HashSet<Student> class2 = new HashSet<Student>();
		class2.add(new Student("wanwu", 23));
		class2.add(new Student("zhaoli", 27));

		// 创建HashSet<HashSet<Student>>作为一个学科集合储存班级
		HashSet<HashSet<Student>> xueKe = new HashSet<HashSet<Student>>();
		xueKe.add(class1);
		xueKe.add(class2);

		System.out.println("--------------增强for遍历----------------");
		// 使用两种方法遍历学科集合，并打印出所有学生。
		// 增强for
		for (HashSet<Student> cls : xueKe) {
			for (Student student : cls) {
				System.out.println(student.getName() + "---" + student.getAge());
			}
		}

		System.out.println("--------------迭代器遍历----------------");

		// 迭代器遍历
		Iterator<HashSet<Student>> xueKeItr = xueKe.iterator();
		while (xueKeItr.hasNext()) {
			HashSet<Student> cls = xueKeItr.next();
			Iterator<Student> clsItr = cls.iterator();
			
			while (clsItr.hasNext()) {
				Student stu = clsItr.next();
				System.out.println(stu.getName() + "---" + stu.getAge());
			}
		}
	}

}