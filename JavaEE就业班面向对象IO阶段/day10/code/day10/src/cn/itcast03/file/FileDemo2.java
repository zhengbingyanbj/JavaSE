package cn.itcast03.file;

import java.io.File;

/*
 * 
 *  String getAbsolutePath()��ȡ����·�� 
 *     ���̷���·��
 *  
 *  String getPath()  ��ȡ��װ·��
 *  
 *  String toString() 
 *  
 *  
 *  ��� ���Ը��� 
 *     ��  ��װ�����ʱ��  ���� ����� ����  ֮��  
 *     
 *     ����  ���̷�����
 *     ���  ����ڵ�ǰ����Ŀ����
 */
public class FileDemo2 {
    public static void main(String[] args) {
		//ʹ�þ���·����װa.txt
    	File file = new File("E:\\308\\day10\\a.txt");
    	
    	System.out.println(file.getAbsolutePath());
    	//ʹ�����·����װ a.txt
    	File file2 = new File("a.txt");
    	System.out.println(file2.getAbsolutePath());
    	
    	
    	System.out.println("-----------");
    	
    	System.out.println(file.getPath());
    	System.out.println(file2.getPath());
    	
    	System.out.println(file.toString());
	}
}
