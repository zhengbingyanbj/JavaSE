package cn.itcast02.exceptiontrycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
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
 *     捕获异常 
 *       java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定方式的处理 
 *       
 *         try{
 *            被检测语句;
 *         }catch(抓取到的异常类型  变量名){
 *             给出处理方案;
 *         }
 *        
 *         
 *         处理方案一
 *           System.out.println(e); 打印异常对象
 *           
 *           结果
 *         java.io.FileNotFoundException: 文件找不到
 *         over
 *         
 */
public class TryCatchDemo {
     public static void main(String[] args) {
    	 
    
		 
    	try{
    		read("b.txt");
    	}catch(FileNotFoundException e){
    		
    		System.out.println(e);
    	}
    	
    	
    	System.out.println("over");
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
