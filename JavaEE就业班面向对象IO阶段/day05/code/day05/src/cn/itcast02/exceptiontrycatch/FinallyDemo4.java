package cn.itcast02.exceptiontrycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 *  
 *       ����׳����������쳣  ���õ��� Ĭ�ϵĴ���ʽ 
 *           ���ս���JVM���д���   ��ֹ���� ��ӡ��Ϣ
 *           
 *       ����׳�����һ���������쳣�� 
 *         ���뱨����  ��Ҫ���Ǹ��������� ������벻ͨ�� 
 *         
 *         �쳣�Ĵ��� ����JVMĬ�ϴ���ʽ��
 *            ���ַ�ʽ 
 *              1��throws �����׳�
 *              2��try..catch.. �����쳣
 *              
 *     �����쳣 
 *       java�ж��쳣������Ե������в��񣬿��ԶԳ��ֵ��쳣����ָ����ʽ�Ĵ��� 
 *       
 *         try{
 *            ��������;
 *         }catch(ץȡ�����쳣����  ������){
 *             ����������;
 *         }
 *        
 *         
 *         ��������
 *             ���������쳣ת�����������쳣
 *           
 *           ���
 *        		�������ֹ 
 *        ���һ��ӡ����ϸ���쳣��Ϣ
 *         
 */
public class FinallyDemo4 {
     public static void main(String[] args) {
    	 
    
		 
    	try{
    		read("b.txt");
    	}catch(FileNotFoundException e){
    		//������������� 
    		//  �ͽ� �������쳣���� ץ�������� �� e
    		throw new RuntimeException(e);
    		
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
