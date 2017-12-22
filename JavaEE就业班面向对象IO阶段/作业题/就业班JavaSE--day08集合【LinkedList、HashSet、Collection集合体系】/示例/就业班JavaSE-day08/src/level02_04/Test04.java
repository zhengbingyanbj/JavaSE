package level02_04;

import java.util.HashSet;
import java.util.Iterator;

/*
 * 定义一个Student类,包含名称,年龄,性别(姓名,年龄,性别完全相同视为同一学生)
创建10个Student对象,至少有两个学生姓名,年龄,性别完全相同. 把这10个学生添加到Set集合中,不可以重复,遍历Set集合打印学生信息,使用两种方式
 */
public class Test04 {
	public static void main(String[] args) {
		// 2.创建HashSet集合
		HashSet<Student> set = new HashSet<>();
		// 3.使用Student类创建10个学生,把这10个学生添加到Set集合中
        set.add(new Student("张三", 18, "男"));
        set.add(new Student("小王", 16, "女"));
        set.add(new Student("倩倩", 19, "女"));
        set.add(new Student("张伟", 18, "男"));
        set.add(new Student("张三", 18, "男"));
        set.add(new Student("老王", 38, "男"));
        set.add(new Student("张三", 18, "男"));
        set.add(new Student("小刘", 20, "女"));
        set.add(new Student("张三", 18, "男"));
        set.add(new Student("天二", 21, "男"));

        // 4.使用迭代器遍历HashSet
        Iterator<Student> iterator = set.iterator();
        while(iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        
        System.out.println("------------------------------------------------");
        // 5.使用增强for遍历集合
        for(Student stu : set){
        	System.out.println(stu);
        }
	}
}