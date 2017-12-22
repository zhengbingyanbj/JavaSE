package cn.itcast01.collection;

import java.util.LinkedHashSet;

/*
 *  ==   equals  区别 
 *    ==  关系运算符 
 *       比较 值的 
 *          基本类型比较 数值  引用类型比较地址值
 *    equals是一个方法  （对对象来说）
 *          Object中比较的是地址值
 *          如果子类重写了 一般比较的是内容
 *          
 *   集合 和 数组 
 *   相同点 
 *     都是容器 
 *   不同点
 *      集合可变  数组定长
 *      数组中可以存储基本类型 和 引用类型
 *      集合只能存储 引用类型 
 *    
 *    
 *    对集合来说  
 *      说到数据结构 
 *      就是指的 数据存储到集合的  方式
 *      
 *      
 *      Collection接口定义着集合框架中最最共性的内容。
 *      
 *      在学习时：我们需要看最顶层怎么用， 创建底层对象即可。因为底层继承了父类中的所有功能。
 *      Collection 层次结构 中的根接口。Collection 表示一组对象，这些对象也称为 collection 的元素。一些 collection 允许有重复的元素，而另一些则不允许。
 *      一些 collection 是有序的，而另一些则是无序的。
 *      
 *      JDK 不提供此接口的任何直接 实现：它提供更具体的子接口（如 Set 和 List）实现。
 */
public class CollectionDemo {
      public static void main(String[] args) {
		  
	}
}
