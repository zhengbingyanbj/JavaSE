package cn.itcast08.objectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 *  �����л�����
 *      �����Ƕ����ļ�  ���� ������������  ��Ҫ ��.class�ļ�
 *      
 *      ObjectInputStream
 *      ObjectInputStream(InputStream in)
 *      
 *      ����
 *        Object readObject()
 */
public class ObjectInputStreamDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	  //���������л�����
	  ObjectInputStream ois = new ObjectInputStream(new FileInputStream("p1.person"));
     
	  //��ȡ�ļ� 
	  Object obj = ois.readObject();
	  
	  System.out.println(obj);
	  
	  ois.close();
  }
}
