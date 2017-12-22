package cn.itcast01.map;

import java.util.HashMap;

/*
 *   Map  是双列集合的顶层接口 也就是双列集合的规范
 *      键  值  
 *      Key  Value 
 *      
 *      Map<K,V>  
 *        K 代表键的类型
 *        V 代表值的类型
 *        
 *     每次存储一对儿元素 
 *     
 *     特点
 *       1:键唯一  值可以重复
 *       2：一个键只对应一个值
 *       3：键维护 关系 
 *     从方法中体现  
 *     
 *     Map的方法   接口  
 *       学习子类  
 *         HashMap<K,V>
 *         
 *       V put(K key, V value) 将指定的值与此映射中的指定键关联 
 *               添加 最新的 映射关系 
 *               
 *       V remove(Key k) 根据键删除映射关系  返回值为映射的值  
 *        V get(Key k)  根据键找对应的值  找的没有键 返回的是null
 */
public class MapDemo {
     public static void main(String[] args) {
	      //创建集合对象
    	 HashMap<String, String>  map = new HashMap<String,String>();
    	 
    	 //添加元素到集合 
    	map.put("黄晓明","杨颖");
    	map.put("马赛克", "马蓉");
    	map.put("班长", "朱茵");
//    	map.put("班长", "zhuyin");
    	
    	System.out.println(map);
    	
    	//V remove(Key k)
    	
    	 System.out.println("班长要退出江湖了："+map.remove("班长"));
           
    	 
    	 System.out.println(map);
    	 
    	 // V get(Key k)  根据键找对应的值
    	 
    	 System.out.println("查看黄晓明媳妇："+map.get("黄晓明"));
    	 System.out.println("查看班长媳妇："+map.get("班长"));
    	 
    	 /*
    	  *    boolean containsKey(Object key)  判断该map的键中是否有此key
    	  *    boolean containsValue(Object value) 判断该map的值中是否此 value
    	  *  
    	  *    boolean isEmpty() 是否有 键值对 
    	  *    Set<K> keySet() 获取键集
    	  *    Collection<V> values() 获取值集
    	  *    int size() 有几对儿元素
    	  *    
    	  *      键盘录入一个 字符串  
    	  *        统计 每个字符出现的次数 
    	  */
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
	 } 
}
