package cn.itcast05.generictest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo2 {
   public static void main(String[] args) {
	  
	   ArrayList<String>  list = new ArrayList<String>();
	   list.add("迪丽热巴");
	   list.add("古力娜扎");
	   list.add("马尔扎哈");
	    
	   //printCollection(list);
	   TreeSet<Integer>  set = new TreeSet<Integer>();
	   
	   set.add(12);
	   set.add(14);
	   set.add(18);
       
	   //printCollection(set);
	 
	   LinkedList<Student> ll = new LinkedList<Student>();
	   
	   ll.add(new Student());
	   ll.add(new Student());
	   ll.add(new Student());
	   printCollection(ll);
	  
	   HashSet<Worker> ts = new HashSet<Worker>();
	   ts.add(new Worker());
	   ts.add(new Worker());
	   ts.add(new Worker());
	   
	  // printCollection(ts);
	   
	   HashSet<Person> tss = new HashSet<Person>();
	   tss.add(new Person());
	   tss.add(new Person());
	   tss.add(new Person());
	   
	   printCollection(tss);
   }
   
   
   
   /*
    * 想要这个方法 只对泛型为   Student  Worker Person 有效 ? 
    * 
    *   限定泛型范围
    *       这个几个类 继承Person或者是 Person本身
    *       传进来的泛型  要么继承Person 要么是Person
    *       
    *    限定了 泛型的上限 
    *    
    *      ? extends Person  Person或其子类
    */
//   public static  void printCollection(Collection<? extends Person>  coll){
//	  	 
//	  	 for (Object o : coll) {
//				System.out.println(o);
//			  }
//	   }

 
   
   /*
    * 想要这个方法 只对 Student  或者Person   Object有效 ? 
    *     限定泛型的范围 
    *        也就是说 传进来的泛型 要么是Student 要么Student的父类
    */
   public static  void printCollection(Collection<? super Student>  coll){
	  	 
	  	 for (Object o : coll) {
				System.out.println(o);
			  }
	   }

   
   
}
