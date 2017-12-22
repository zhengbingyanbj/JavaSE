package cn.itcast02.set;

import java.util.HashSet;

/*
 * 使用HashSet存储 自定义类型对象  
 *    我们往往 将 两个对象  它们如果成员变量完全一样 认为是 同一个对象 
 *    
 *    对于当前   认为 学生姓名和年龄一样的 是同一对象  重复
 *    
 *    如果想要实现上面的描述 
 *      必须重写 hashCode 和 equals方法
 *      
 *      快捷键生成 alt+shift+s  h 
 */
public class HashSetStuent {
     public static void main(String[] args) {
	   
    	 //创建HashSet对象
    	 HashSet<Student> set = new HashSet<Student>(); 
    	 Student stu1 = new Student("柳岩",36);//0x11
    	 set.add(stu1);//0x11
    	 set.add(new Student("朱茵", 50));//0x22
    	 set.add(new Student("赵雅芝", 60));//0x33
    	 set.add(new Student("朱茵", 50));//0x44
    	 set.add(stu1);//0x11 
    	 
    	 for (Student stu : set) {
			System.out.println(stu);
		 }
	 }
}
