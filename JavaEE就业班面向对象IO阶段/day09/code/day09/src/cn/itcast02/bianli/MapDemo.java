package cn.itcast02.bianli;

import java.util.HashMap;
import java.util.Set;

/*   双列集合没法 foreach
 *   java.util.Map<K,V>
 *     容器   
 *     集合就可以存储元素 
 *        存储成对的 
 *        
 *        完成集合遍历
 *      遍历方式一 之   键找值    
 *        
 *        1:创建集合对象  存储元素
 *        2:获取所有的键 根据 keySet方法
 *        3:遍历键集 得到每个键 
 *        4:通过键找到对应的值  get(Key )
 */
public class MapDemo {
    public static void main(String[] args) {
		//创建集合对象 
    	HashMap<String, String>  map = new HashMap<String,String>();
    	
    	//存储元素到集合
    	map.put("张三丰","武当");
    	map.put("灭绝师太","峨眉");
    	map.put("成昆","少林");
    	map.put("张无忌","明教");
    	
    	//2:获取键集
    	Set<String> keys = map.keySet();
    	//3:遍历键集
    	for (String key : keys) {
			//key  就是每个键
    		//4：根据键获取值 
    		String value = map.get(key);
    		System.out.println(key+"的门派是："+value);
		}
    	
	}
}
