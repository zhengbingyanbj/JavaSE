package cn.itcast04.genericclass;
/*
 *   使用 泛型类 
 *       主要研究
 *       
 *          泛型什么时候 变成 确定的数据类型
 *          
 *          创建对象的时候
 */
public class GenericDemo {
      public static void main(String[] args) {
		  //创建对象
    	  GenericClass<String>  gc = new GenericClass<String>();
    	  
    	  gc.setMVP("詹姆斯登登");
    	  
    	  String mvp = gc.getMVP();
    	  
    	  System.out.println(mvp);
    	  
    	  GenericClass<Integer>  gc2 = new GenericClass<Integer>();
    	  
    	  gc2.setMVP(123);
    	  
    	  Integer mvp2 = gc2.getMVP();
	  }
}
