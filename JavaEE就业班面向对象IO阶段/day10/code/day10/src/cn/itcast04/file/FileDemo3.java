package cn.itcast04.file;

import java.io.File;

/*
 * ɾ������
 *   boolean delete()
 *   
 *   ����ɾ���ļ� �Լ�  �����������ļ���
 *   
 *     ���� ����������վ   ����
 */
public class FileDemo3 {
      public static void main(String[] args) {
    	  //ɾ���ļ�
		  File file = new File("a.txt");
		  
		  //ɾ��
		  System.out.println(file.delete());
	     //ɾ�� �ļ���
          File  dir = new File("�ؾ���\\����\\����");
          
          System.out.println(dir.delete());
      }
}
