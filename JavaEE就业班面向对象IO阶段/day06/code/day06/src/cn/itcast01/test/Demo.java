package cn.itcast01.test;
/*
 * 
 * 
 * 1: 
 *    抽象类中存在 一个静态的方法 
 *       就是获取该类型的 对象
 *       （实际源码中 返回的是该类的子类对象）
 *       
 * 2：
 *   有一些类 全部都是静态的成员
 *     在这种类中 （工具类 或者系统类）
 *     会将构造 私有化
 *          
 */
public class Demo {
  public static void main(String[] args) {
	  
	  Person p = Person.getInstance();
  }
}
