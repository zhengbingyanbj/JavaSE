package cn.itcast.interface02;

import java.util.ArrayList;

/*
 * 接口的成员特点 
 *    1：没有构造 不能创建对象
 *    2:成员方法 可以有 但是 必须是公共的抽象方法  
 *       这些方法是固定修饰符  public abstract 
 *    3:有没有成员变量呢
 *       这里不能有普通的成员变量
 *       只能有常量 
 *         而且是  公共的静态常量
 *         public static final 修饰的  
 *         
 *         固定修饰符     只能赋值一次  而且要在类加载完成之前 赋值
 *      4:子类必须覆盖掉接口中所有的抽象方法后，子类才可以实例化。
 *        否则子类是一个抽象类   
 *     
 */
public class Demo {
  public static void main(String[] args) {
	  
//	  String[] arr = {"1","a","b"};
//	  
//	  for (String s : arr) {
//		  System.out.println(s);
//	  }
  }
}
