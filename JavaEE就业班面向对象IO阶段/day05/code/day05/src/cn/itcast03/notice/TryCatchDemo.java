package cn.itcast03.notice;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  
 *         
 */
public class TryCatchDemo {
     public static void main(String[] args) {
    	 
    
		 
    	
    		read("b.txt");
    	
    	
    	System.out.println("over");
	 }
     
     /*
      * 根据索引  找到指定数组中的元素
      */
     public static void read(String path) {
    	 if(!path.endsWith("a.txt")){
    		 try {
				throw new FileNotFoundException("文件找不到");
			  } catch (FileNotFoundException e) {
				e.printStackTrace();
			 }
    	 }
    	 
    	 
     }
}
