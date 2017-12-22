package cn.itcast04.file;

import java.io.File;

/*
 * File 
 *   �жϹ��� 
 *      boolean exists() �ж��Ƿ����
 *      boolean isFile() �ж��ǲ����ļ�
 *      boolean isDirectory() �ж��ǲ����ļ���
 *      
 *      
 *      �ж���
 *        һ��File���� �����ļ� �����ļ���
 *           ����   
 *           
 *           ���һ��File����������� ·��
 *             ��ô�Ȳ��� �ļ� Ҳ�����ļ��� 
 *              
 */ 
public class FileDemo {
    public static void main(String[] args) {
	   //File���Է�װ ��ʱ�����ڵ��ļ� 
    	File file = new File("��а����.txt");
    	
    	System.out.println(file);
    	
    	//�ܲ��ܰ�  �������ļ� ʶ����� 
    	System.out.println("�ļ��Ƿ���ʵ���ڣ�"+file.exists());
    	
    	File file2 = new File("D:\\2017\\308\\day10\\aaa\\ƭ���.java");
    	//�ж� �Ƿ���ʵ�ļ�
    	System.out.println(file2.exists());
    	
    	//���ļ������ļ����� ��
    	System.out.println("file2���ļ���"+file2.isFile());
    	System.out.println("file2���ļ�����"+file2.isDirectory());
    	
    	
    	
	}
}
