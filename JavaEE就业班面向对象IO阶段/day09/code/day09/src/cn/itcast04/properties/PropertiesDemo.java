package cn.itcast04.properties;

import java.util.Properties;
import java.util.Set;

/*
 * Properties  
 *   Properties 类表示了一个持久的属性集。
 *   Properties 可保存在流中或从流中加载。
 *   属性列表中每个键及其对应值都是一个字符串。
 *   
 *   1:Properties 父亲 Hashtable<K,V> 父接口 Map<K,V>  
 *    map中定义的功能都具备
 *   2:没有泛型   因为 每个键 和值 都是String类型 
 *   
 *   从这个角度上看  Properties是一个 双列 集合
 *   那么就具备集合操作  
 *   
 *     Object setProperty(String key, String value) 调用 Hashtable 的方法 put。 
 *    
 *     Set<String> stringPropertyNames() 返回此属性列表中的键集 
 *     
 *     String getProperty(String key) 用指定的键在此属性列表中搜索属性。 
 */
public class PropertiesDemo {
   public static void main(String[] args) {
	  //1:创建Properties集合对象
	   Properties pp = new Properties();
	   //2:添加元素到集合
//	   pp.put("钢铁侠", "托尼");
//	   pp.put("蜘蛛侠", "皮特");
//	   pp.put("孙悟空", 72);
	   //不够严谨 因为Properties 每个键及其对应值都是一个字符串。
	   //其他类型也存进去  不够严谨
	   //Object setProperty(String key, String value)
	   pp.setProperty("钢铁侠", "托尼");
	   pp.setProperty("熊猫侠", "赵雷");
	   pp.setProperty("闪电侠", "韦德");
	   
	   //遍历 
//	   Set<Object> keySet = pp.keySet();
       // 不够严谨  	   
	   Set<String> keys = pp.stringPropertyNames();
	   //遍历
	   for (String key : keys) {
		   //根据键获取值 
//		   Object object = pp.get(key);
		   String value = pp.getProperty(key);
		   
		   System.out.println(key+"  "+value);
	   }
	   
	   
	   
	   
	   
   }
}
