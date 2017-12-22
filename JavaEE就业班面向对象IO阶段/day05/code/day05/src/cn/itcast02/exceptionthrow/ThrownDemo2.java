package cn.itcast02.exceptionthrow;

import java.io.FileNotFoundException;
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
 *         �����׳�  
 *           �����������׳���  �׸�������
 *           ˭���� ˭����
 *           
 *           �������ʶ����������������ߡ����������ͨ��throw�׳��˱���ʱ�쳣��
 *           ��û�в�����(�Ժ󽲽�÷�ʽ),��ô����ͨ��throws�����������õ�����ȥ����
 *           
 *           throws��ʽ 
 *           �ڷ���������  throws �쳣����
 *    
 */
public class ThrownDemo2 {
     public static void main(String[] args) throws FileNotFoundException {
    	 
    	read("b.txt");
		 
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
