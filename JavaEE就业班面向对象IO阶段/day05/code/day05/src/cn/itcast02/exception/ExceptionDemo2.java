package cn.itcast02.exception;

import java.io.FileReader;

/*
 *  异常产生的过程解析 
 *    
 */
public class ExceptionDemo2 {
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
    	 
    	 int element = arr[index];
    	 
    	 return element;
     }
}
