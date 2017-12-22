package cn.itcast03.maptest;

import java.util.HashMap;
import java.util.Set;

/*
 * // 使用map集合存储  自定义类型	
 * 练习：每位学生（姓名，年龄）都有自己的家庭住址。
 *   那么，既然有对应关系，则将学生对象和家庭住址存储到map集合中。
 *   学生作为键, 家庭住址作为值。
 *   注意，学生姓名相同并且年龄相同视为同一名学生。
 */
public class MapTest {
     public static void main(String[] args) {
	    // 使用map集合存储  自定义类型	
    	 //创建 map集合 
    	 HashMap<Student, String> map = new HashMap<Student,String>();
    	 
    	 //存储 
    	 map.put(new Student("社会王", 33), "东北");
    	 map.put(new Student("老王", 35), "隔壁");
    	 map.put(new Student("老宋", 37), "楼上");
    	 map.put(new Student("老王", 35), "楼下");
    	 
    	 //遍历 
    	 Set<Student> stus = map.keySet();
    	 for (Student stu : stus) {
			  String address = map.get(stu);
    		 System.out.println("来自"+address+"的"+stu.getName());
		 }
	 }
}
