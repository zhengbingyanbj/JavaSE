package cn.itcast04.genericmethod;
/*
 *  
 *  
 *  定义在接口上 
 *    什么时候  确定泛型 数据类型啊
 *    
 *    实现类 
 *      1：在实现类实现的时候 就确定数据类型
 *      public class MyImp1 implements GenericInteface<String>
 *      2:实现类实现的时候不确定
 *      public class MyImp2<E> implements GenericInteface<E>{
 *        创建实现类对象的时候确定
 */
public class GenericDemo {
      public static void main(String[] args) {
		  MyImp2<String> m = new MyImp2<String>();
		  
		  m.add("aaa");
	  }
}
