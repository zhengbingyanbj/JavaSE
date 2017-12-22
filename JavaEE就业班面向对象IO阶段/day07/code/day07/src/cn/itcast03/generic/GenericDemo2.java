package cn.itcast03.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 加上泛型 操作
 * 
 *     好处
 *       1：将运行期异常 提前到编译期爆出来问题
 *       2：没有黄色警告线
 *       3：避免了强制转换（向下转型）
 */
public class GenericDemo2 {
       public static void main(String[] args) {
    	   //创建对象
		   Collection<String> coll = new ArrayList<String>(); 
           //添加元素
		   coll.add("丁彦雨航");
		   coll.add("肖泽马李亚");
		   coll.add("尼鲁拉斯赵四");
		   
		  
		   for (String s : coll) {
			  System.out.println(s);
			  System.out.println(s.length());
		   }
		   
		   
       
       }
}
