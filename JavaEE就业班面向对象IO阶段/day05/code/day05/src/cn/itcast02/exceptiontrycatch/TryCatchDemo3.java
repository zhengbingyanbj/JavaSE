package cn.itcast02.exceptiontrycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  
 *finally  不管 产生异常与否 这里的代码 必须要执行的
 *  使用场景 
 *    是哪里呢？ 
 *       释放资源的时候
 *         
 */
public class TryCatchDemo3 {
     public static void main(String[] args) {
    	 
    
		 
    	try{
    		read("b.txt");
    	}catch(FileNotFoundException e){
    		//如果出现了问题 
    		//  就将 编译期异常对象 抓到这里了 叫 e
    		throw new RuntimeException(e);
    		
    	}finally{
    		System.out.println("你丫必须执行");
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
