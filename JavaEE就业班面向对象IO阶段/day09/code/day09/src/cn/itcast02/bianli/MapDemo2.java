package cn.itcast02.bianli;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/*  
 * 
 * 集合的遍历方式二  
 *    根据键值对 关系 去完成遍历 
 *      1：创建集合对象 添加元素
 *      2：获取所有的键值对关系  
 *      3：遍历得到 每一个 entry对象
 *      4：解析entry对象 getKey()  getValue
 *      
 *      
 *      Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系 
 *      
 */
public class MapDemo2 {
    public static void main(String[] args) {
		//创建集合对象 
    	HashMap<String, String>  map = new HashMap<String,String>();
    	
    	//存储元素到集合
    	map.put("张三丰","武当");
    	map.put("灭绝师太","峨眉");
    	map.put("成昆","少林");
    	map.put("张无忌","明教");
    	
    	//3:获取所有的键值对 关系
    	 Set<Entry<String, String>> entrySet = map.entrySet();
    	 //4:遍历 entrySet得到每一个entry对象
    	 for (Entry<String, String> entry : entrySet) {
			  // entry代表 每一个键值对对象
    		 //解析
    		 String key = entry.getKey();
    		 String value = entry.getValue();
    		 
    		 System.out.println(key+"的门派是："+value);
		 }
	}
}
