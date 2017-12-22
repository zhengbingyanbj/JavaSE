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
 *           e.printStackTrace();
 *           
 *           ���
 *        		java.io.FileNotFoundException: �ļ��Ҳ���
					at cn.itcast02.exceptiontrycatch.TryCatchDemo2.read(TryCatchDemo2.java:57)
					at cn.itcast02.exceptiontrycatch.TryCatchDemo2.main(TryCatchDemo2.java:42)
 *         over
 *         
 *         ����쳣��������ϸ��λ�ø�����
 *         
 */
public class TryCatchDemo2 {
     public static void main(String[] args) {
    	 
    
		 
    	try{
    		read("b.txt");
    	}catch(FileNotFoundException e){
    		
    		e.printStackTrace();
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
