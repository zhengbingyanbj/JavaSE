package cn.itcast04.file;

import java.io.File;
import java.io.IOException;

/*
 * File 
 *   ��������
 *     boolean creatNewFile() �������ļ�  ���ж��Ƿ�ɹ�
 *     boolean mkdir() �����µ��ļ���  �����������ж��Ƿ�ɹ�
 *     boolean mkdirs() �����༶�ļ��� ���ж��Ƿ�ɹ�
 */
public class FileDemo2 {
  public static void main(String[] args) throws IOException {
	//File���Է�װ ��ʱ�����ڵ��ļ� 
  	File file = new File("��а����.txt");
  	//ԭ������������ļ�   �ҿ���ͨ�� java����  ����ļ�����
  	
  	boolean b = file.createNewFile();
  	
  	if(b){
  		System.out.println("�����ļ��ɹ���"+file.isFile());
  	}else{
  		System.out.println("�����ļ�ʧ��");
  	}
  	
  	System.out.println("-----------------");
  	// ���� һ���ļ��� ���� �ؾ���
  	//1::����һ�� Ҫ�������� �ļ��е� ·��  ����
    File dir = new File("�ؾ���");
    //2������mkdir���� ��ɴ��� �����ļ���
    boolean c = dir.mkdir();
    if(c){
    	System.out.println("���� �ļ��гɹ���"+dir.isDirectory());
    }else{
    	System.out.println("�����ļ���ʧ��");
    }
    System.out.println("----------------");
    //�����༶�ļ���  
    File dirs = new File("aa\\bb\\cc");
    //2������mkdir���� ��ɴ��� �����ļ���
    boolean d = dirs.mkdirs();
    if(d){
    	System.out.println("���� �༶�ļ��гɹ���"+dirs.isDirectory());
    }else{
    	System.out.println("�����༶�ļ���ʧ��");
    }
    System.out.println("----------------");
   }
}
