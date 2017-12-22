package cn.itcast03.generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 *  泛型  就是  我们以前 见到 的<> 中定义的内容
 *  
 *  Collection<E>  E 代表 未来的类型  
 *           将来创建对象的 时候 传入什么类型  这里就变成了什么类型
 *           
 *       泛型概述
 *         是一种把明确类型的工作推迟到创建对象或者调用方法的时候才去明确的特殊的类型。
 *         
 *      写泛型 不写泛型 是两个概念 
 *      写了泛型  类加上泛型 整体是一种数据类型
 *      
 *      如果有泛型  你定义的时候忽略了 就是连<>都不写 
 *       默认存储 是 Object类型
 */
public class GenericDemo {
       public static void main(String[] args) {
    	   //创建对象
		   Collection coll = new ArrayList(); 
           //添加元素
		   coll.add("丁彦雨航");
		   coll.add("肖泽马李亚");
		   coll.add("尼鲁拉斯赵四");
		   coll.add(7654321);
		   
		   //遍历
		   for(Object obj : coll){
			   System.out.println(obj);
			   //需要向下转型
			   String s = (String)obj;
			   System.out.println(s.length());
		   }
		   
		   
       
       }
}
