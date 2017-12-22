package cn.itcast05.system;
/*
 *  System.in
 *  System.out
 *  
 *  在API中System类介绍的比较简单，我们给出定义，
 *  System中代表程序所在系统，提供了对应的一些系统属性信息，和系统操作
 *  
 *  这里面定义的所有属性 和方法 都是 静态的 
 *    静态的 是通过类  都是类成员  跟对象无关 
 *    
 *    所以这个类中的构造是私有
 *    System 类包含一些有用的类字段和方法。它不能被实例化。
 *    
 *       static long currentTimeMillis() 
 *         返回以毫秒为单位的当前时间。 
 *       static void exit(int status) 
 *          终止当前正在运行的 Java 虚拟机。 
 *       static void gc()  
 *           运行垃圾回收器。
 *       static String getProperty(String key) 
 *          获取系统信息 
 *       
 */
public class SystemDemo {
     public static void main(String[] args) {
	     //获取当前时间毫秒值
    	 long start = System.currentTimeMillis();
    	 
    	 System.out.println("你追我。。。");
    	 
    	 for(int i = 0; i<100000;i++){
    		 System.out.println("追"+i);
    	 }
    	 System.out.println("追上了");
    	 
    	 //执行之后
    	 long end = System.currentTimeMillis();
    	 
    	 System.out.println(end-start);
    	 
    	 System.out.println("获取系统信息");
    	 
    	 String version = System.getProperty("java.version");
    	 
    	 System.out.println(version);
	 }
}
