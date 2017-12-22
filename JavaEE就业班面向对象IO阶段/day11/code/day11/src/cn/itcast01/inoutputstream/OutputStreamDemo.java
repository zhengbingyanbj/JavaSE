package cn.itcast01.inoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   ���Ĳ�������
 *     1������ ������
 *     2��ִ�ж�Ӧ����
 *     3���ͷ���Դ      (�Ӻ���ǰ  ��С����)
 *     
 *    OutputStream 
 *      �˳������Ǳ�ʾ����ֽ�����������ĳ���
 *      
 *         �ֽ�������� ���� ����    �����������ֽ������Ӧ�þ߱��Ĺ��� 
 *         
 *         close() �ͷ���Դ
 *         flush() ˢ��
 *         
 *        void write(int b) �����ֽڷ�ʽ д��ȥ  ֻ����ʹ��int�����Ǹ��ֽڶ���
 *        void write(byte[] bys) �����ֽ����鷽ʽд��ȥ  
 *        void write(byte[] bys,int start,int len)�����ֽ�����һ����д��ȥ
 *        
 *          |---FileOutputStream  �����ļ��ֽ������
 *          
 *              ���� 
 *                FileOutputStream(String name)
 *                FileOutputStream(File file)
 * 
 */
public class OutputStreamDemo {
        public static void main(String[] args) throws IOException {
			//1:���� �ֽ����������
        	FileOutputStream fos = new FileOutputStream("a.txt");
        	//2��д����
//        	fos.write(97);
//        	fos.write(98);
        	
        	String s = "abcde";
        	//GBK���� һ�����ĺ��� ռ�������ֽ�
        	//byte[] getBytes() �Ѹ��ַ��� ת���� �ֽ�����
        	byte[] bys = s.getBytes();
        	
        	fos.write(bys);
        	
        	//3:�ͷ���Դ
        	fos.close();
        	
        	
        	
        	
        	
		}
}
