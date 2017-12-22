package cn.itcast01.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection接口定义着集合框架中最最共性的内容。
 *      
 *   在学习时：我们需要看最顶层怎么用，
 *      创建底层对象即可。因为底层继承了父类中的所有功能。
 *      
 *      学习 接口中的功能  
 *        只能学习 实现类中
 *        
 *      我们采用多态的方式 学习（研究）  这样只能访问接口中定义功能
 */
public class CollectionDemo2 {
     public static void main(String[] args) {
	    
    	 //采用多态方式创建对象
    	 Collection<String> coll = new ArrayList<String>();
    	 
    	 //boolean  add(String s)
    	 coll.add("大力娃");
    	 coll.add("金刚娃");
    	 coll.add("葫芦娃");
    	 
    	 System.out.println(coll);
//    	 System.out.println(coll.isEmpty());
//    	 //void clear() 清空集合
//    	 coll.clear();
//    	 System.out.println(coll);
//    	 
//    	 //isEmpty()集合中是否为空
//    	 System.out.println(coll.isEmpty());
    	 
    	 //boolean contains(Object obj)
    	 //判断o 是否在该集合中
    	 System.out.println("判断隐身娃在不在："+coll.contains("隐身娃"));
    	 System.out.println("判断大力娃在不在："+coll.contains("大力娃"));
    	 
    	 //boolean remove(Object o)
    	 System.out.println("删除隐身娃："+coll.remove("隐身娃"));
    	 System.out.println("删除大力娃："+coll.remove("大力娃"));
    	 System.out.println(coll);
    	 
    	 //size 长度 集合中元素的个数
    	 
    	 
    	 //Object[] toArray()
    	 Object[] array = coll.toArray();
    	 
    	 for (int i = 0; i < array.length; i++) {
			  System.out.println(array[i]);
		  }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	 }
}
