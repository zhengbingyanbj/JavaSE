package cn.itcast02.copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * ����ļ�����  
 *    �Ժ���Ҫ��� �ļ�����  
 *       ���� ʹ���ֽ���
 *       
 *       �岽
 *         1�������ֽ�����������Դ�ļ�
 *         2�������ֽ������ ����Ŀ���ļ�
 *         3����ȡԴ�ļ������ݵ��ڴ�
 *         4�����ڴ�������д��Ŀ���ļ�
 *         5���ͷ���Դ
 *         
 */
public class CopyDemo {
    public static void main(String[] args) throws Exception {
		//1�������ֽ�����������Դ�ļ� 
    	FileInputStream fis = new FileInputStream("���.jpg");
    	//2�������ֽ������ ����Ŀ���ļ�
    	FileOutputStream fos = new FileOutputStream("copy\\С����.jpg");
    	//3����ȡ����
    	byte[] buffer = new byte[1024];
    	int len;
    	while((len=fis.read(buffer))!=-1){
    		// buffer 0  len 
    		//���ڴ������� buffer ��ʵ�����ֽ�  д��  Ŀ���ļ���
    		//4д����
    		fos.write(buffer, 0, len);
    	}
    	
    	//5���ͷ���Դ
    	fos.close();
    	fis.close();
	}
}
