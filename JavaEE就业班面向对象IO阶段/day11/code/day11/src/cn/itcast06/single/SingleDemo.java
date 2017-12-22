package cn.itcast06.single;
/*
 * 
 *  只让对象 new 一次    代表这个对象 只产生一个
 */
public class SingleDemo {
   public static void main(String[] args) {
	 
//	   Single s = new Single();
//	   Single s2 = new Single();
//	   Single s3 = new Single();
	   
	   Single s = Single.getInstance();
	   Single s2 = Single.getInstance();
	   Single s3 = Single.getInstance();
	   
	   System.out.println(s);
	   System.out.println(s2);
	   System.out.println(s3);
   }
}
