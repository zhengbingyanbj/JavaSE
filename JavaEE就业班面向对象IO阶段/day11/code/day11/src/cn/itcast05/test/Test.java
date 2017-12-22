package cn.itcast05.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *    �� �ؾ����� Ŀ¼�е�һ��  ���� 
 *       ���Ƶ� ��ѧ���� 
 *       
 *       ֻ���Ƶ���Ŀ¼�µ�
 */
public class Test {
      public static void main(String[] args) throws IOException {
		  //1: ��װ Դ�ļ���   
    	  File srcDir = new File("�ؾ���");
    	  // ��װ Ŀ���ļ���
    	  File destDir = new File("��ѧ��");
    	  
    	  copyDir(srcDir,destDir);
	   }
      /*
       *   ���  �����ļ��и��Ʋ�����
       */
	  public static void copyDir(File srcDir, File destDir) throws IOException {
		  // ��һ����׳���ж�
		  if(!srcDir.isDirectory() || !destDir.isDirectory()){
			  return;
		  }
		  
		  //2.1��ȡ Դ�ļ����� ���е�File����
		  File[] files = srcDir.listFiles();
		  
		  //2.2���� �õ�ÿһ��file���� 
		  for (File file : files) {
			  //file���� ���������Ķ���
			  //2.2.1�ж����ļ�  
			  if(file.isFile()){
				  //���ļ�  file��ΪԴ�ļ�  ��ɸ���
				  File srcFile = file;
				  
				  //  ȷ��Ŀ���ļ�  ��Ŀ���ļ�����  ���ָ�Դ�ļ���һ��
				  File destFile = new File(destDir,file.getName());
				  //����ļ�����
				  copyFile(srcFile, destFile);
			  }  
			  
			  //2.3 �ж��Ƿ����ļ���  
			  if(file.isDirectory()){
				  //file��һ���ļ��� 
				  //��Ҫ��Ŀ���ļ����� ����һ�����ָ�fileһ�����ļ��� ���� mkdir
				  File dir = new File(destDir,file.getName());
				  dir.mkdir();
			  }
		  }
	  }
	  
	  public static void copyFile(File srcFile, File destFile) throws IOException {
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
