package cn.itcast02.exceptionthrow;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *   throw new ArrayIndexOutOfBoundsException("哥们儿,你访问的索引不存在");
 *   
 *   将异常对象进行抛出 
 *     在java中，提供了一个throw关键字，它用来抛出一个指定的异常对象
 *     
 *     格式 
 *       throw new 异常类(...);
 *       
 *       throw 将异常抛出  告诉给调用者
 *       
 *       
 *       如果抛出的运行期异常  采用的是 默认的处理方式 
 *           最终交给JVM进行处理   中止程序 打印信息
 *           
 *       如果抛出的是一个编译期异常呢 
 *         编译报错了  需要我们给出处理方案 否则编译不通过 
 *         
 *         异常的处理 除了JVM默认处理方式外
 *            两种方式 
 *              1：throws 声明抛出
 *              2：try..catch.. 捕获异常
 *              
 *         声明抛出  
 *           继续将问题抛出来  抛给调用者
 *           谁调用 谁处理
 *           
 *           将问题标识出来，报告给调用者。如果方法内通过throw抛出了编译时异常，
 *           而没有捕获处理(稍后讲解该方式),那么必须通过throws进行声明，让调用者去处理
 *           
 *           throws格式 
 *           在方法声明上  throws 异常类名
 *    
 */
public class ThrownDemo2 {
     public static void main(String[] args) throws FileNotFoundException {
    	 
    	read("b.txt");
		 
	 }
     
     /*
      * 根据索引  找到指定数组中的元素
      */
     public static void read(String path) throws FileNotFoundException {
    	 if(!path.endsWith("a.txt")){
    		 throw new FileNotFoundException("文件找不到");
    	 }
    	 
    	 
     }
}
