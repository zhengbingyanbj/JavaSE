package cn.itcast02.exceptionthrow;

import java.io.FileReader;

/*
 *   throw new ArrayIndexOutOfBoundsException("���Ƕ�,����ʵ�����������");
 *   
 *   ���쳣��������׳� 
 *     ��java�У��ṩ��һ��throw�ؼ��֣��������׳�һ��ָ�����쳣����
 *     
 *     ��ʽ 
 *       throw new �쳣��(...);
 *       
 *       throw ���쳣�׳�  ���߸�������
 *    
 */
public class ThrownDemo {
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
    	 if(index<0 || index>arr.length-1){
    		 throw new ArrayIndexOutOfBoundsException("���Ƕ�,����ʵ�����������");
    	 }
    	 
    	 int element = arr[index];
    	 
    	 return element;
     }
}
