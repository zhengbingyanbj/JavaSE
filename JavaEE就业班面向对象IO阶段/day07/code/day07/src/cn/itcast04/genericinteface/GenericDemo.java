package cn.itcast04.genericinteface;
/*
 *  泛型方法的调用
 *  
 *   其实确定  方法的泛型具体的类型
 *   
 *      泛型只能是引用类型
 */
public class GenericDemo {
      public static void main(String[] args) {
		   GenericMethod  gm = new GenericMethod();
		   
		   gm.show("哈哈哈");
		   
		   gm.show(124);
		   
		   gm.show(true);
	  }
}
