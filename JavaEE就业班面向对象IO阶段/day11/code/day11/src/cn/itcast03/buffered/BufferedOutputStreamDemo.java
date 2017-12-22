package cn.itcast03.buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *  
 *    BufferedOutputStream  
 *       ��Ч�� �ֽ������   ��� ԭ���������� д��Ч��
 *       
 *       
 *       ����� 
 *         OutputStream�� BufferedOutputStream����
 *         
 *         BufferedOutputStream(OutputStream out)
 *         
 *             
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
	    //1:���� ��Ч���ֽ������ ����
    	BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("b.txt"));
    	//2:��ȡ
    	String s = "kobebranyt";
    	bos.write(s.getBytes());
    	//3:�ͷ�
    	bos.close();
    	
	}
}
