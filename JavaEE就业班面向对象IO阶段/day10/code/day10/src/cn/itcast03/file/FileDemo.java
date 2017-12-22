package cn.itcast03.file;

import java.io.File;
import java.util.Date;

/*
 *   ��ȡ����
 *      ��ȡFile�����Ӧ�� ����
 *      String getName()
 *      String getAbsolutePath() ���̷���·��
 *      long length()
 *      long lastModified()
 */
public class FileDemo {
  public static void main(String[] args) {
	  File file = new File("D:\\2017\\308\\day10\\aaa\\���챦��v4.0.java");
      
	  //getName()
	  System.out.println("�ļ����ƣ�"+file.getName());
	  // getAbsolutePath()
	  System.out.println("��ȡ�ļ�����·����"+file.getAbsolutePath());
	  
	  //long length()��ȡ�ļ�ռ�õ��ֽ���  ��Ч��ռ�õĿռ�
	  System.out.println(file.length());
	  
	  // long lashModified() ��ȡ����޸�ʱ��ĺ���ֵ
	  long time = file.lastModified();
      System.out.println(time);
      System.out.println(new Date(time));
  }
}
