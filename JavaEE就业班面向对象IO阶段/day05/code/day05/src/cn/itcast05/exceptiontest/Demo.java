package cn.itcast05.exceptiontest;
/*
 * 有一个新的问题 产生了 
 *   年龄非法问题  
 *     问题可以定义一个异常  
 *     在出现问题的地方
 *       将这个异常 throw抛出 
 *         停止程序执行
 *         
 *      自定义异常 
 *        年龄非法异常 继承 Exception
 *          写俩构造
 */
public class Demo {
   public static void main(String[] args) throws UnAgeException {
	  
	   Person p = new Person("东北陈小春", 18);
	   System.out.println(p);
	   
	   Person p2 = new Person("社会王",-20);
	   System.out.println(p2);
   }
}
