package cn.itcast.thissuper;
/*
 * 
 * 任何构造方法 如果第一行没有写this(..) 或者 super(..)
 *   	  默认都是 super()
 *   
 *  子类初始化完毕前,必须要进行父类(“对象”)数据的初始化
 *  
 *  如果在子类构造第一行  super()  
 *  
 *  super() this()只能出现在构造的第一行
 */
public class Demo {
  public static void main(String[] args) {
	 
	  Student stu = new Student();
  }
}
