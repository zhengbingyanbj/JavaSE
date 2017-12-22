package cn.itcast02.set;

import java.util.HashSet;

/*
 *   Set  保证元素唯一的集合  
 *        不能保证元素的有序性 存取顺序一致
 *        
 *        主要的操作  就是来保证元素存储的  的唯一性 
 *        
 *        主要学习 它的子类 HashSet
 *        使用哈希表 来保证元素的 唯一性 
 */
public class HashSetDemo {
  public static void main(String[] args) {
	  
	  //创建set集合
	  HashSet<String>  set = new HashSet<String>();
	  
	  System.out.println("cba".hashCode());
	  System.out.println("abc".hashCode());
	  System.out.println("bac".hashCode());
	  set.add(new String("cba"));
	  set.add("abc");
	  set.add("cba");
	  set.add("bac");
	 
	  
	  for (String s : set) {
		  System.out.println(s);
	   }
	  
  }
}
