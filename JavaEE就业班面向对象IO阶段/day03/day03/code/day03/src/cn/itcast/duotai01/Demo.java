package cn.itcast.duotai01;
/*
 * 研究多态  
 *   多态的代码体现 
 *   
 *    前提
 *      1：有继承或者实现关系
 *      2：一般来说有方法重写
 *      3：父类引用指向子类对象
 *      
 *      父类类型  变量名 = new 子类类型();
 *      
 *      虽然该变量指向的是子类对象，但表现为一个父类的形态，可以调用一切父类的方法，子类特有的方法将不能调用。
 */
public class Demo {
   public static void main(String[] args) {
	  
	   //使用多态形式 
	   Animal a = new Lv();
	   //表象为父类  实际空间是子类空间
	   
	   a.shout();
	   
//	   a.laMo();
   }
 }
