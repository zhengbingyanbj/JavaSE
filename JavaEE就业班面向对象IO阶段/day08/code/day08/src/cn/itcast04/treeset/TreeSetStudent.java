package cn.itcast04.treeset;

import java.util.TreeSet;

public class TreeSetStudent {
  public static void main(String[] args) {
	   //使用TreeSet存储自定义数据类型
	  TreeSet<Student>  set = new TreeSet<Student>();
	  
	  set.add(new Student("zy",50));
	  set.add(new Student("swk",500));
	  set.add(new Student("zpf",30));
	  set.add(new Student("zgl",300));
	  
	  for (Student student : set) {
		System.out.println(student);
	   }
  }
}
