package cn.itcast02.exception;
/*
 * Throwable ���� Java ���������д�����쳣�ĳ��� 
 * 
 *   �ع�һ����֪�����쳣 
 *      ��ָ���쳣  ����Խ���쳣  ����ת���쳣  ��ѧ�쳣
 *      
 *      IO�쳣  �ļ��Ҳ����쳣
 * 
 *    �쳣��ϵ
 *      Throwable 
 *         |---Error ���� ϵͳ����   ����  ��֢
 *            OutOfMemoryError  �ڴ����  
 *                
 *         |---Exception  �쳣   ���뼶��
 *          ArrayIndexOutOfBoundsException ����Խ���쳣 
 *             ��ð  ��β�� 
 *             |-- �������쳣 ��RuntimeException
 *                   �����ڵ�ʱ�� ������ʾ������ 
 *                    ��Ҫ���������ʽ ������벻ͨ��
 *                   �������ִ�й����� �������� ��ô�ᱬ�� 
 *             |-- �������쳣 RuntimeException
 *                   ������û���κ���ʾ
 *                   �������ִ���� ��������  �ᱬ��
 *             
 */
public class ExceptionDemo {
      public static void main(String[] args) {
		   //int[] arr = new int[1024*1024*1024];
    	  
    	  int[] arr = {1,2,1};
    	  
    	  System.out.println(arr[3]);
	  }
}
