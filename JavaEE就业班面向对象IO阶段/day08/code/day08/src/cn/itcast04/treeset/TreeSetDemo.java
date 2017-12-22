package cn.itcast04.treeset;

import java.util.TreeSet;

public class TreeSetDemo {
  public static void main(String[] args) {
	  
	  //创建TreeSet 存储 Integer类型
	  TreeSet<Integer>  set = new TreeSet<Integer>();
	  //存储元素至集合
	  
	  set.add(33);
	  set.add(48);
	  set.add(27);
	  set.add(28);
	  set.add(21);
	  set.add(55);
	  set.add(40);
	  
	  set.add(40);
	  set.add(28);
	  
	  set.add(25);
	  set.add(10);
	  
	  System.out.println(set.size());
	  System.out.println("-------------");
	  for (Integer i : set) {
		   System.out.println(i);
	   }
  }
}
