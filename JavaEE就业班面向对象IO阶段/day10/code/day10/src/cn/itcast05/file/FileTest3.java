package cn.itcast05.file;

import java.io.File;

/*
 *   ָ��Ŀ¼
 *   D:\2017\308\day10\aaa
 *   
 *   ��ȡ���Ŀ¼��  ����.java�ļ�  ���༶��
 *       ��ӡ����·��
 */
public class FileTest3 {
     public static void main(String[] args) {
		 //�ȷ�װָ��Ŀ¼
    	 File dir = new File("D:\\2017\\308\\day10\\aaa");
    	 
    	 getJavaFileByDir(dir);
	 }
     /*
      * ����һ�� Ŀ¼  
      *    ��ӡ ��Ŀ¼�� ���е�.java�ļ�
      */
     public static void getJavaFileByDir(File dir){
    	 
    	 if(!dir.isDirectory()){
    		 return;
    	 }
    	 
    	 //��ȡ��ǰĿ¼�� �����ļ������ļ��� File������ʽ
    	 File[] files = dir.listFiles();
    	 for (File file : files) {
		    //file  �Ǹ�Ŀ¼�µ� �ļ����ļ���  ����
    		 
    		 if(file.isFile()){//�ж��Ƿ����ļ�
    			 
    			 String name = file.getName();
    			 
    			 if(name.endsWith(".java")){
    				 System.out.println(file.getAbsolutePath());
    			 }
    			 
    			 
    		 }
    		 
    		 
    		 if(file.isDirectory()){//�ж��Ƿ����ļ���
    			 
    			 //����   ���� �ļ���  ��ӡ ����Ҫ�� �ļ��Ĺ���
    			 getJavaFileByDir(file);
    		 }
    		 
		 }
     }
}
