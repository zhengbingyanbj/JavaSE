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
      * ��������  �ҵ�ָ�������е�Ԫ��
      */
     public static void read(String path) {
    	 if(!path.endsWith("a.txt")){
    		 try {
				throw new FileNotFoundException("�ļ��Ҳ���");
			  } catch (FileNotFoundException e) {
				e.printStackTrace();
			 }
    	 }
    	 
    	 
     }
}
