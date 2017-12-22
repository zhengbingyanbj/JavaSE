package cn.itcast07.objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * ���л� 
 *    �� ����д����Ĳ���   
 *      �������л� 
 *       ������ ��Ϊ ���л���  ObjectOutputStream
 *       
 *       ����
 *         ObjectOutputStream(OutputStream out)
 *         
 *       ����
 *         writeObject(Object obj)   
 *         
 *         ��Ҫ���л� ��ô����ʵ�����л��ӿ�
 *         
 */
public class ObjectOutputStreamDemo {
  public static void main(String[] args) throws IOException {
	  //����һ�� ����
	  Person p = new Person("С����", 2400);
	  
	 // ���� ���л��� 
	  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("p3.person"));
	  
	  //�Ѷ���д������
	  oos.writeObject(p);
	  //�ͷ�
	  oos.close();
	  
  }
}
