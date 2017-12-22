package cn.itcast05.generictest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {
   public static void main(String[] args) {
	  
	   ArrayList<String>  list = new ArrayList<String>();
	   list.add("迪丽热巴");
	   list.add("古力娜扎");
	   list.add("马尔扎哈");
	    
	   printCollection(list);
	   TreeSet<Integer>  set = new TreeSet<Integer>();
	   
	   set.add(12);
	   set.add(14);
	   set.add(18);
	   printCollection(set);
	 
	   LinkedList<Student> ll = new LinkedList<Student>();
	   
	   ll.add(new Student());
	   ll.add(new Student());
	   ll.add(new Student());
	   printCollection(ll);
	  
	   HashSet<Worker> ts = new HashSet<Worker>();
	   ts.add(new Worker());
	   ts.add(new Worker());
	   ts.add(new Worker());
	   printCollection(ts);
	   
   } 
   /*
    * 写一个公共的方法 遍历 上述所有集合    
    * 
    * Collection<Object> coll = new ArrayList<String>();不是多态
    * 
    * Collection<Object> coll = new ArrayList<Object>();
    * Collection<String> coll = new ArrayList<String>();
    * 
    */
//   public static <T> void printCollection(Collection<T> coll){
//	   
//	   for (T t : coll) {
//		  System.out.println(t);
//	   }
//   }
    /*
     * 
     * 现在 这个Collection< >  这个括号里面类型不确定 
     *      什么类型都应该能接受 
     *      
     *      ? 通配符 
     *        传什么就是什么     ?相当于 占住这个位置  传什么类型都可以
     *      
     */
    public static  void printCollection(Collection<?> coll){
	   
	    for (Object object : coll) {
			System.out.println(object);
		}
   }
}
