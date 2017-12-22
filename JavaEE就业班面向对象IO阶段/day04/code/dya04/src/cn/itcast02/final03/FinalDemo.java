package cn.itcast02.final03;
/*
 * 
 *  如果 final修饰的局部变量是基本类型 
 *  
 *       final修饰的变量 只能赋值一次  
 *                  常量是不可变的值 
 *                  
 *                  基本类型  数值不可变 
 *                  
 *                  引用类型  地址值不可变
 */
public class FinalDemo {
  public static void main(String[] args) {
	 
//	  int  a;
//	  
//	  a=20;
//	  a=30;
//	  System.out.println(a);
	  
	 final int a = 10;
	 
//	 a=20;
	 System.out.println(a);
	 
	 
	final Student stu = new Student("小明");
	 
	 stu.name = "小红";
//	 
//	 stu = new Student("静香");
	 
	 
	 
  }
}
