package cn.itcast04.copy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *                     ���Ʒ�ʽ
 *   ������                һ���ֽ�һ���ֽ�            1476.636  s
 *                  �ֽ�����                         1.382s
 *   
 *   ��Ч��                һ���ֽ�һ���ֽ�             3.615s
 *                  �ֽ�����                          0.329s
 */
public class Copy {
  public static void main(String[] args) throws IOException {
	  // Դ�ļ�
	   File srcFile = new File("�ݶ�������.mp4");
	  // Ŀ���ļ�
	   File destFile = new File("copy\\copy4.mp4");
	  
	  //��¼��ʼʱ��
	  
	  long start = System.currentTimeMillis();
	  // �� Դ�ļ��е����� ���Ƶ� Ŀ���ļ��� 
		copy4(srcFile,destFile);
	  //��¼����ʱ��
	  long end = System.currentTimeMillis();
	  
	  System.out.println("��ʱ��"+Math.abs((start-end))+"����");
  }
    /*
     *  �ļ����� ���û����� һ���ֽ�һ���ֽ���ʽ
     */
	public static void copy1(File srcFile, File destFile) throws IOException {
		 //�����ֽ�����������Դ�ļ�
		FileInputStream fis = new FileInputStream(srcFile);
		//�����ֽ������ ����Ŀ���ļ�
		FileOutputStream fos = new FileOutputStream(destFile);
		
		//������ 
		int b;
		while((b=fis.read())!=-1){
			fos.write(b);
		}
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
	
	/*
     *  �ļ����� ���û����� �ֽ�������ʽ
     */
	public static void copy2(File srcFile, File destFile) throws IOException {
		 //�����ֽ�����������Դ�ļ�
		FileInputStream fis = new FileInputStream(srcFile);
		//�����ֽ������ ����Ŀ���ļ�
		FileOutputStream fos = new FileOutputStream(destFile);
		
		//������ 
		byte[] buffer = new byte[1024];
		int len;
		
		while((len=fis.read(buffer))!=-1){
			fos.write(buffer, 0, len);
		}
		//�ͷ���Դ
		fis.close();
		fos.close();
	}
	
	 /*
     *  �ļ����� ���ø�Ч�� һ���ֽ�һ���ֽ���ʽ
     */
	public static void copy3(File srcFile, File destFile) throws IOException {
		 //�����ֽ�����������Դ�ļ�
		FileInputStream fis = new FileInputStream(srcFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		//�����ֽ������ ����Ŀ���ļ�
		FileOutputStream fos = new FileOutputStream(destFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//������ 
		int b;
		while((b=bis.read())!=-1){
			bos.write(b);
		}
		//�ͷ���Դ
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
	
	 /*
     *  �ļ����� ���ø�Ч�� �ֽ�������ʽ
     */
	public static void copy4(File srcFile, File destFile) throws IOException {
		 //�����ֽ�����������Դ�ļ�
		FileInputStream fis = new FileInputStream(srcFile);
		BufferedInputStream bis = new BufferedInputStream(fis);
		//�����ֽ������ ����Ŀ���ļ�
		FileOutputStream fos = new FileOutputStream(destFile);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		//������ 
		byte[] buffer = new byte[1024];
		int len;
		
		while((len=bis.read(buffer))!=-1){
			bos.write(buffer, 0, len);
		}
		//�ͷ���Դ
		bos.close();
		fos.close();
		bis.close();
		fis.close();
	}
}
