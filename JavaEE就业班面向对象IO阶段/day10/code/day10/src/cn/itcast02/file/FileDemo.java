package cn.itcast02.file;

import java.io.File;

/*
 *   Ŀ¼  = �ļ���
 * 
 *   �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
 * 
 *   ����ϵͳ�е� �ļ������ļ��� ��javaʹ��File�����ʾ 
 *         �����ļ����ļ��е� ·�� 
 *         
 *   File  ���Ա�ʾ �ļ� �����ļ���  
 *   
 *     ���ļ������ļ��� ·�� ��װ File����
 *     ���췽�� 
 *        File(String pathName) �����ļ���·����  ��װFile����
 *        
 *        File(String parent,String child)
 *              ���� ��·�� + ��·��  ��װFile����
 *              
 *        File(File parent,String child)
 *           ���ݸ�·����File��ʽ + ��·��  ��װFile����
 */
public class FileDemo {
      public static void main(String[] args) {
		//ʹ�õ�һ�ֹ��� ��� File����ķ�װ
    	  //���ļ���װ��File����
    	  File file = new File("D:\\2017\\308\\day10\\aaa\\���챦��v4.0.java");
    	  
    	  System.out.println(file);
    	  
    	  //���ļ��з�װ��File����
    	  File dir = new File("D:\\2017\\308\\day10\\aaa");
    	  System.out.println(dir);
    	  
    	  File file2 = new File("D:\\2017\\308\\day10\\aaa","���챦��v4.0.java");
    	  System.out.println(file2);
    	  
    	  File file3 = new File(dir,"���챦��v4.0.java");
    	  
    	  System.out.println(file3);
	  }
}
