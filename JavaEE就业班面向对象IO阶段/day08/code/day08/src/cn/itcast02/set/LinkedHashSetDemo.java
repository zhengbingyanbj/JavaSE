package cn.itcast02.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
 *   LinkedHashSet
 *       哈希表 保证元素的 唯一性 
 *       在这个基础上加上一层链表   维护了存的顺序
 */
public class LinkedHashSetDemo {
  public static void main(String[] args) {
	  
	  //创建set集合
//	  HashSet<String>  set = new HashSet<String>();
	  LinkedHashSet<String>  set = new LinkedHashSet<String>();
	  
	  set.add("机器猫");
	  set.add("大雄");
	  set.add("宜静");
	  set.add("技安");
	  set.add("康夫");
	  set.add("技安");
	  
	  for (String s : set) {
		  System.out.println(s);
	   }
	  
  }
}
