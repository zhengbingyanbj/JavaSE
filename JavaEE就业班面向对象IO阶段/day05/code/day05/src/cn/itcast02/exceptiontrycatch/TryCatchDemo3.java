package cn.itcast02.exceptiontrycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  
 *finally  ���� �����쳣��� ����Ĵ��� ����Ҫִ�е�
 *  ʹ�ó��� 
 *    �������أ� 
 *       �ͷ���Դ��ʱ��
 *         
 */
public class TryCatchDemo3 {
     public static void main(String[] args) {
    	 
    
		 
    	try{
    		read("b.txt");
    	}catch(FileNotFoundException e){
    		//������������� 
    		//  �ͽ� �������쳣���� ץ�������� �� e
    		throw new RuntimeException(e);
    		
    	}finally{
    		System.out.println("��Ѿ����ִ��");
    	}
    	
    	
    	System.out.println("over");
	 }
     
     /*
      * ��������  �ҵ�ָ�������е�Ԫ��
      */
     public static void read(String path) throws FileNotFoundException {
    	 if(!path.endsWith("a.txt")){
    		 throw new FileNotFoundException("�ļ��Ҳ���");
    	 }
    	 
    	 
     }
}
