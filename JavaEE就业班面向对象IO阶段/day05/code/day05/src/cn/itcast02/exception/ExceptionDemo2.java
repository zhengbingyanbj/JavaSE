package cn.itcast02.exception;

import java.io.FileReader;

/*
 *  �쳣�����Ĺ��̽��� 
 *    
 */
public class ExceptionDemo2 {
     public static void main(String[] args) {
    	 
    	
		 //�����������
    	 int[] arr = {23,12,22};
    	 
    	 int index = 3;
    	 
    	 int element = getElement(arr, index);
    	 
    	 System.out.println(element);
    	 System.out.println("over");
	 }
     
     /*
      * ��������  �ҵ�ָ�������е�Ԫ��
      */
     public static int getElement(int[] arr,int index){
    	 
    	 int element = arr[index];
    	 
    	 return element;
     }
}
