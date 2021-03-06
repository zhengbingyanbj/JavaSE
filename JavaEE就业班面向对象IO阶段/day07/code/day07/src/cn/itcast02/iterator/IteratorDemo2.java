package cn.itcast02.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 *   集合 的使用
 *    1：创建集合对象
 *    2： 添加元素到集合
 *    3：遍历集合
 *    
 *      遍历  元素一个一个 获取出来  
 *      迭代  一个一个往下走 
 *      
 *      迭代器 可以理解为一种工具  
 *      每个集合对象 都具备自己的迭代器
 *      
 *      其实一个方法 
 *        Iterator<E> iterator() 
 *             返回在此 collection 的元素上进行迭代的迭代器。 
 *             
 *       通过迭代器对象完成 
 *          学习迭代器中的功能  
 *          
 *          两个
 *            boolean hasNext()  
 *                如果仍有元素可以迭代，则返回 true。 
 *            String next() 
 *                返回迭代的下一个元素。 
 */
public class IteratorDemo2 {
   public static void main(String[] args) {
	  //多态的形式创建对象 研究
	   Collection<String> coll = new ArrayList<String>();
	   //添加元素到集合
	   coll.add("串串星人");
	   coll.add("吐槽星人");
	   coll.add("怪兽星人");
	   
	   //遍历
	   //获取迭代器
	  
	   Iterator<String> it = coll.iterator();
       for(;it.hasNext();){
    	  
    	  String s = it.next();
    	  System.out.println(s);
      }
   }
}
