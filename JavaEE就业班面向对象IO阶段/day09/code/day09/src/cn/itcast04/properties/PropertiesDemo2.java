package cn.itcast04.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
 *   3: 该集合 可以将数据存到文件中  也可以从文件中获取数据到集合中
 *   4：该集合是唯一可与流进行交互的集合 
 *   
 *      load(输入流)  从流中读取数据到集合
 *      
 *      store(输出流,注释)  将数据写到流中
 *   
 */
public class PropertiesDemo2 {
   public static void main(String[] args) throws IOException {
	    //创建集合对象
	   Properties pp = new Properties();
	   
	   // 调用load方法
	   pp.load(new FileReader("db.properties"));
	   
	   
	   System.out.println(pp);
	   
	   
	   
	   
   }
}
