package cn.itcast01.map;

import java.util.HashMap;
/*
 * put功能详解
 *   V put(K key, V value) 将指定的值与此映射中的指定键关联 
 *   
 *      当一个键 第一次出现的时候 
 *          put完成什么事情  将映射添加到集合中
 *          返回值 是null
 *          
 *      当键已经存在 
 *        put完成什么   根据键 替换了 之前的值  存储了新值
 *        返回值  被替换的值
 *        
 *        
 *      就是 用来更新映射关系的  键维护  
 *         返回的都是 被替换的 
 */
public class MapDemo2 {
   public static void main(String[] args) {
	  
	   //创建集合对象
	   HashMap<String, String>  map = new HashMap<String,String>();
	   System.out.println(map);
	  map.put("黄晓明", "杨颖");
	  System.out.println(map.put("文章", "马伊琍"));
	   System.out.println(map);
	   
	  System.out.println(map.put("文章", "姚笛"));
	   System.out.println(map);
   }
}
