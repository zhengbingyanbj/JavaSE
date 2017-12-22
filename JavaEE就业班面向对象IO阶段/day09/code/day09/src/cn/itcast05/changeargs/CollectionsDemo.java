package cn.itcast05.changeargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * Collections 集合工具类
 *      static <T> boolean addAll(Collection<T> c, T... elements) 
 *                                 集合                      往集合中添加的元素
 *                             
 *      public static void shuffle(List<?> list) //  集合元素存储位置打乱
 *      
 *      
 *      public static <T> void sort(List<T> list) 
 *      排序
 *      
 *  Arrays 数组工具类
 *      sort(数组 ) 完成数组排序   快排  
 *       (我们学过冒泡 选择)
 *        
 */
public class CollectionsDemo {
  public static void main(String[] args) {
	  //创建集合对象
	  ArrayList<Integer>  list = new ArrayList<Integer>();
//	  list.add(23);
//	  list.add(33122);
//	  list.add(233);
//	  list.add(1123);
	  //使用工具类
	  Collections.addAll(list,13,11,30,9,7);
	  
	  System.out.println(list);
	  //排序
	  Collections.sort(list);
	  System.out.println(list);
  }
}
