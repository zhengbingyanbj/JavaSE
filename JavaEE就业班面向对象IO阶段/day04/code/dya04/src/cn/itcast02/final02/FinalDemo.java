package cn.itcast02.final02;
/*
 *   final 状态修饰符 
 *     表示 最终的   
 *          不可变的 
 *          
 *          它可以修饰  类   成员方法    成员变量     局部变量
 *             被final修饰的类  叫做最终类  不能被继承
 *             
 *              被final修饰的方法 叫做 最终方法 可以被继承 但是不能被重写
 *              
 *             被final修饰的成员变量  叫做 常量 
 *             
 *             初始化之前必须要赋值 只能赋值一次 
 */
public class FinalDemo {
   public static void main(String[] args) {
	  
	   Person p = new Person();
	   
	   //p.num = 20;
	   
//	   p.num = 30;
	   
	   
   }
} 
