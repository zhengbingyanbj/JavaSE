package cn.itcast05.file;

import java.io.File;

/*
 *   File �߼���ȡ���� 
 *       ��Ŀ¼���ļ��У���˵
 *       
 *     String[] list() ��ȡ��ǰĿ¼�µ� �ļ����ļ���  �����б� ʹ��String�������
 *     File[] listFiles() ��ȡ��ǰĿ¼�µ�  �ļ����ļ��� �����б� ʹ��File�����������
 */
public class FileDemo {
    public static void main(String[] args) {
		//���� File  ָ��Ŀ¼����
    	File dir = new File("D:\\2017\\308\\day10\\aaa");
    	
    	String[] list = dir.list();
    	System.out.println(list.length);
    	for (String name : list) {
			System.out.println(name);
		}
    	
    	System.out.println("--------");
    	File[] files = dir.listFiles();
    	for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}
}
