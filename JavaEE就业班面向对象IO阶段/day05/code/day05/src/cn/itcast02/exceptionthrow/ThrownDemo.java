package cn.itcast02.exceptionthrow;

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
 */
public class ThrownDemo {
     public static void main(String[] args) {
    	 
    	
		 //创建数组对象
    	 int[] arr = {23,12,22};
    	 
    	 int index = 3;
    	 
    	 int element = getElement(arr, index);
    	 
    	 System.out.println(element);
    	 System.out.println("over");
	 }
     
     /*
      * 根据索引  找到指定数组中的元素
      */
     public static int getElement(int[] arr,int index){
    	 if(index<0 || index>arr.length-1){
    		 throw new ArrayIndexOutOfBoundsException("哥们儿,你访问的索引不存在");
    	 }
    	 
    	 int element = arr[index];
    	 
    	 return element;
     }
}
